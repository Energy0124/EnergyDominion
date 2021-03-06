package net.xeoh.plugins.remotediscovery.impl.v4;

import net.xeoh.plugins.base.Plugin;
import net.xeoh.plugins.remotediscovery.options.DiscoverOption;
import net.xeoh.plugins.remotediscovery.options.discover.OptionCallback;

import java.util.Timer;
import java.util.TimerTask;

/**
 * A request for callbacks.
 *
 * @author rb
 */
public class CallbackRequest {
    /**
     *
     */
    final RemoteDiscoveryImpl remoteDiscoveryImpl;

    Class<? extends Plugin> req;

    OptionCallback oc;

    DiscoverOption[] moreOptions;

    Timer timer = new Timer();

    /**
     * @param remoteDiscoveryImpl
     * @param p
     * @param c
     * @param moreOptions
     */
    public CallbackRequest(final RemoteDiscoveryImpl remoteDiscoveryImpl,
                           final Class<? extends Plugin> p, final OptionCallback c,
                           final DiscoverOption... moreOptions) {
        this.remoteDiscoveryImpl = remoteDiscoveryImpl;
        this.req = p;
        this.oc = c;
        this.moreOptions = moreOptions;
        if (this.oc.getTimeout() > 0) {
            this.timer.schedule(new TimerTask() {

                @Override
                public void run() {
                    c.getCallback().timeout();
                    cancelTimeout();
                    //remoteDiscoveryImpl.allRequests.remove(remoteDiscoveryImpl);
                }

            }, this.oc.getTimeout());
        }
    }

    /**
     *
     */
    public void cancelTimeout() {
        try {
            this.timer.cancel();
        } catch (Throwable t) {
            // 
        }
    }
}