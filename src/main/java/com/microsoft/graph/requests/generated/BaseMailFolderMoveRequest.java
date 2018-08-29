// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.MailFolderMoveBody;
import com.microsoft.graph.models.extensions.MailFolder;
import com.microsoft.graph.requests.extensions.IMailFolderMoveRequest;
import com.microsoft.graph.requests.extensions.MailFolderMoveRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Mail Folder Move Request.
 */
public class BaseMailFolderMoveRequest extends BaseRequest implements IBaseMailFolderMoveRequest {
    protected final MailFolderMoveBody body;

    /**
     * The request for this MailFolderMove
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseMailFolderMoveRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, MailFolder.class);
        body = new MailFolderMoveBody();
    }

    public void post(final ICallback<MailFolder> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public MailFolder post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IMailFolderMoveRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (MailFolderMoveRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IMailFolderMoveRequest top(final int value) {
        getQueryOptions().add(new QueryOption("$top", value+""));
        return (MailFolderMoveRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IMailFolderMoveRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (MailFolderMoveRequest)this;
    }

}
