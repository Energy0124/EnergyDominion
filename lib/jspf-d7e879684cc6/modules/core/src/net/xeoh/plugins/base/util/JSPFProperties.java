/*
 * JSPFProperties.java
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
package net.xeoh.plugins.base.util;

import net.xeoh.plugins.base.PluginConfiguration;
import net.xeoh.plugins.base.impl.PluginManagerFactory;

import java.util.Properties;

/**
 * Can be used to set properties more easily. Pass this object to the {@link PluginManagerFactory}'s
 * <code>createPluginManager()</code> method to set initial properties.<br/><br/>
 * <p/>
 * A good overview on how properties can be used is in the {@link PluginConfiguration}'s documentation.
 *
 * @author Ralf Biedert
 */
public class JSPFProperties extends Properties {

    /** */
    private static final long serialVersionUID = -4275521676384493982L;

    /**
     * Sets a property using a class as prefix. For example, if
     * <code>GeoService</code> is in the package <code>com.company.plugins.geoservice</code>
     * the following call:<br/><br/>
     * <code>
     * setProperty(GeoService.class, "remote.url", "http://geo.ip/q?");
     * </code><br/><br/>
     * would set the configuration key <code>com.company.plugins.geoservice.GeoService.remote.url</code>
     * to the value <code>http://geo.ip/q?</code>.
     *
     * @param root   Root class to set an option for.
     * @param subkey The subkey to set.
     * @param value  The value to set.
     */
    public void setProperty(final Class<?> root, final String subkey, final String value) {
        setProperty(getKey(root, subkey), value);
    }

    /**
     * Assembles a key, only used internally.
     *
     * @param root   Root class.
     * @param subkey Subkey to assemble.
     * @return The assembled key.
     */
    public static String getKey(final Class<?> root, final String subkey) {
        String prefix = "";
        if (root != null) {
            prefix = root.getName() + ".";
        }

        return prefix + subkey;
    }
}
