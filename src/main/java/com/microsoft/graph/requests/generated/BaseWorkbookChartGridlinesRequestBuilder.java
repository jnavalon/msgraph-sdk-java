// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookChartGridlinesRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartGridlinesRequest;
import com.microsoft.graph.requests.extensions.IWorkbookChartGridlinesFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartGridlinesFormatRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Chart Gridlines Request Builder.
 */
public class BaseWorkbookChartGridlinesRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookChartGridlinesRequestBuilder {

    /**
     * The request builder for the WorkbookChartGridlines
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookChartGridlinesRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWorkbookChartGridlinesRequest instance
     */
    public IWorkbookChartGridlinesRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartGridlinesRequest instance
     */
    public IWorkbookChartGridlinesRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new WorkbookChartGridlinesRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     * Gets the request builder for WorkbookChartGridlinesFormat
     *
     * @return the IWorkbookChartGridlinesFormatRequestBuilder instance
     */
    public IWorkbookChartGridlinesFormatRequestBuilder format() {
        return new WorkbookChartGridlinesFormatRequestBuilder(getRequestUrlWithAdditionalSegment("format"), getClient(), null);
    }
}

