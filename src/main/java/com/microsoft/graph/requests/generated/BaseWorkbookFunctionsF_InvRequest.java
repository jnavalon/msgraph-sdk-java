// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.WorkbookFunctionsF_InvBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsF_InvRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsF_InvRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions F_Inv Request.
 */
public class BaseWorkbookFunctionsF_InvRequest extends BaseRequest implements IBaseWorkbookFunctionsF_InvRequest {
    protected final WorkbookFunctionsF_InvBody body;

    /**
     * The request for this WorkbookFunctionsF_Inv
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookFunctionsF_InvRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookFunctionResult.class);
        body = new WorkbookFunctionsF_InvBody();
    }

    public void post(final ICallback<WorkbookFunctionResult> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public WorkbookFunctionResult post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkbookFunctionsF_InvRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (WorkbookFunctionsF_InvRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IWorkbookFunctionsF_InvRequest top(final int value) {
        getQueryOptions().add(new QueryOption("$top", value+""));
        return (WorkbookFunctionsF_InvRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkbookFunctionsF_InvRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (WorkbookFunctionsF_InvRequest)this;
    }

}
