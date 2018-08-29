// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.WorkbookRange;
import com.microsoft.graph.requests.extensions.IWorkbookRangeLastCellRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeLastCellRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Range Last Cell Request.
 */
public class BaseWorkbookRangeLastCellRequest extends BaseRequest implements IBaseWorkbookRangeLastCellRequest {

    /**
     * The request for this WorkbookRangeLastCell
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookRangeLastCellRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookRange.class);
    }

    /**
     * Patches the WorkbookRangeLastCell
     * @param srcWorkbookRange the WorkbookRange with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    public void patch(WorkbookRange srcWorkbookRange, final ICallback<WorkbookRange> callback) {
        send(HttpMethod.PATCH, callback, srcWorkbookRange);
    }

    /**
     * Patches the WorkbookRangeLastCell
     *
     * @param srcWorkbookRange the WorkbookRange with which to PATCH
     * @return the WorkbookRange
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     public WorkbookRange patch(WorkbookRange srcWorkbookRange) throws ClientException {
        return this.send(HttpMethod.PATCH, srcWorkbookRange);
    }

    /**
     * Puts the WorkbookRangeLastCell
     *
     * @param srcWorkbookRange the WorkbookRange to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(WorkbookRange srcWorkbookRange, final ICallback<WorkbookRange> callback) {
        send(HttpMethod.PUT, callback, srcWorkbookRange);
    }

    /**
     * Puts the WorkbookRangeLastCell
     *
     * @param srcWorkbookRange the WorkbookRange to PUT
     * @return the WorkbookRange
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     public WorkbookRange put(WorkbookRange srcWorkbookRange) throws ClientException {
        return this.send(HttpMethod.PUT, srcWorkbookRange);
    }
    /**
     * Gets the WorkbookRange
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WorkbookRange> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookRange
     *
     * @return the WorkbookRange
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public WorkbookRange get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkbookRangeLastCellRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (WorkbookRangeLastCellRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkbookRangeLastCellRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (WorkbookRangeLastCellRequest)this;
    }

}
