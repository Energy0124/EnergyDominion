/*
 * PluginTest.java
 *
 * Copyright (c) 2008, Ralf Biedert All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list of
 * conditions and the following disclaimer. Redistributions in binary form must reproduce the
 * above copyright notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *
 * Neither the name of the author nor the names of its contributors may be used to endorse or
 * promote products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS
 * OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
 * TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */
package net.xeoh.plugins.remote;

import net.xeoh.plugins.base.Plugin;
import net.xeoh.plugins.base.PluginManager;
import net.xeoh.plugins.base.impl.PluginManagerFactory;
import net.xeoh.plugins.base.util.JSPFProperties;
import net.xeoh.plugins.remotediscovery.DiscoveredPlugin;
import net.xeoh.plugins.remotediscovery.RemoteDiscovery;
import net.xeoh.plugins.remotediscovery.options.discover.OptionCallback;
import net.xeoh.plugins.testplugins.testannotations.TestAnnotations;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author rb
 */
public class DiscoveryPluginTest3 {

    private PluginManager pm;

    /**
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        final JSPFProperties props = new JSPFProperties();

        props.setProperty(PluginManager.class, "supervision.enabled", "true");
        this.pm = PluginManagerFactory.createPluginManager(props);

        System.out.println(11);
        this.pm.addPluginsFrom(new URI("classpath://*"));
        System.out.println(22);

    }

    /**
     *
     */
    @After
    public void tearDown() {
        this.pm.shutdown();
    }

    /**  */
    @Test
    public void testDiscovery() {
        System.out.println(1);
        RemoteAPIXMLRPC p = this.pm.getPlugin(RemoteAPIXMLRPC.class);
        System.out.println(2);

        TestAnnotations p2 = this.pm.getPlugin(TestAnnotations.class);
        System.out.println(p);
        System.out.println(p2);

        p.exportPlugin(p2);
        System.out.println("exported to " + p2);

        RemoteDiscovery plugin = this.pm.getPlugin(RemoteDiscovery.class);
        //while(true) {
        Collection<DiscoveredPlugin> discover = plugin.discover(Plugin.class, new OptionCallback(new OptionCallback.Callback() {

            public void pluginsDiscovered(Collection<DiscoveredPlugin> plugins) {
                ArrayList<DiscoveredPlugin> test = new ArrayList<DiscoveredPlugin>(plugins);
                for (DiscoveredPlugin discoveredPlugin : test) {
                    System.out.println("Callback says: " + discoveredPlugin.getPublishURI() + " @" + discoveredPlugin.getDistance());
                }

            }

            public void timeout() {
                System.out.println("Timeout!");
            }

        }, 5000));

        for (DiscoveredPlugin discoveredPlugin : discover) {
            System.out.println(">>> " + discoveredPlugin.getPublishURI());
        }

    }
}
