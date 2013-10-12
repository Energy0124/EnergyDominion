/*
 * ShutdownTest.java
 * 
 * Copyright (c) 2009, Ralf Biedert All rights reserved.
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
package net.xeoh.plugins.sandbox;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;

import net.xeoh.plugins.base.Plugin;
import net.xeoh.plugins.base.PluginInformation;
import net.xeoh.plugins.base.PluginInformation.Information;
import net.xeoh.plugins.base.PluginManager;
import net.xeoh.plugins.base.impl.PluginManagerFactory;
import net.xeoh.plugins.base.util.JSPFProperties;
import net.xeoh.plugins.base.util.PluginManagerUtil;

/**
 * @author rb
 *
 */
public class ShutdownTest {
    /**
     * @param args
     * @throws URISyntaxException
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws URISyntaxException,
                                          InterruptedException {

        final JSPFProperties props = new JSPFProperties();

        props.setProperty(PluginManager.class, "cache.enabled", "true");
        props.setProperty(PluginManager.class, "cache.file", "myjspf.cache");

        PluginManager pm = PluginManagerFactory.createPluginManager(props);

        System.out.println("X");
        pm.addPluginsFrom(new URI("classpath://*"));
        pm.addPluginsFrom(new File("coolplugin.jar").toURI());
        System.out.println("Y");

        final PluginInformation pi = pm.getPlugin(PluginInformation.class);
        final PluginManagerUtil pmu = new PluginManagerUtil(pm);
        Collection<Plugin> plugins = pmu.getPlugins(Plugin.class);
        for (Plugin p : plugins) {
            Collection<String> information = pi.getInformation(Information.CLASSPATH_ORIGIN, p);
            for (String string : information) {
                System.out.println(p + ": " + string);
            }
        }

        Thread.sleep(5000);
        pm.shutdown();
    }
}
