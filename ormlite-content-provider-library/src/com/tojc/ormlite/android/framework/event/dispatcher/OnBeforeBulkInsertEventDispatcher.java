package com.tojc.ormlite.android.framework.event.dispatcher;

import com.tojc.ormlite.android.framework.event.EventDispatcherBase;
import com.tojc.ormlite.android.framework.event.multieventlistener.OnBeforeBulkInsertMultiEventListener;
import com.tojc.ormlite.android.framework.event.multieventobject.OnBeforeBulkInsertMultiEventObject;

/**
 * Created by Jaken on 2014/05/13.
 */
public final class OnBeforeBulkInsertEventDispatcher
        extends EventDispatcherBase<OnBeforeBulkInsertMultiEventListener, OnBeforeBulkInsertMultiEventObject> {

    public OnBeforeBulkInsertEventDispatcher() {
        super();
    }

    @Override
    public void dispatch(OnBeforeBulkInsertMultiEventListener listener, OnBeforeBulkInsertMultiEventObject param) {
        listener.onBeforeBulkInsert(param);
    }
}