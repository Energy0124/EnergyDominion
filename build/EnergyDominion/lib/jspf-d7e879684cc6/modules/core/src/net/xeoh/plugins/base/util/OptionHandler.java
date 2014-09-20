package net.xeoh.plugins.base.util;

import net.xeoh.plugins.base.Option;

/**
 * Handles options. Only used internally.
 *
 * @param <T> Type parameter.
 * @author Ralf Biedert
 */
public interface OptionHandler<T extends Option> {
    /**
     * Called with e
     *
     * @param option
     */
    public void handle(T option);
}