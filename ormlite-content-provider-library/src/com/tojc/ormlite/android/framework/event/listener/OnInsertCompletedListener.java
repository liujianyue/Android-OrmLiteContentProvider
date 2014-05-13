package com.tojc.ormlite.android.framework.event.listener;

import android.net.Uri;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.tojc.ormlite.android.framework.MatcherPattern;
import com.tojc.ormlite.android.framework.OperationParameters.InsertParameters;
import com.tojc.ormlite.android.framework.event.listenerbase.ContentProviderEventListenerInterfaceBase;

/**
 * Created by Jaken on 2014/05/05.
 */
public interface OnInsertCompletedListener<T extends OrmLiteSqliteOpenHelper> extends ContentProviderEventListenerInterfaceBase {
    /**
     * This method is called after the onInsert processing has been handled. If you're a need,
     * you can override this method.
     *
     * @param result    This is the return value of onInsert method.
     * @param uri       This is the Uri of target.
     * @param target    This is identical to the argument of onInsert method.
     *                  It is MatcherPattern objects that match to evaluate Uri by UriMatcher. You can
     *                  access information in the tables and columns, ContentUri, MimeType etc.
     * @param parameter This is identical to the argument of onInsert method.
     *                  Arguments passed to the insert() method.
     * @since 1.0.4
     */
    void onInsertCompleted(Uri result, Uri uri, MatcherPattern target, InsertParameters parameter);
}