// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.WorkbookTable;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Table Request.
 */
public interface IBaseWorkbookTableRequest extends IHttpRequest {

    /**
     * Gets the WorkbookTable from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WorkbookTable> callback);

    /**
     * Gets the WorkbookTable from the service
     *
     * @return the WorkbookTable from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookTable get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<WorkbookTable> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookTable with a source
     *
     * @param sourceWorkbookTable the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WorkbookTable sourceWorkbookTable, final ICallback<WorkbookTable> callback);

    /**
     * Patches this WorkbookTable with a source
     *
     * @param sourceWorkbookTable the source object with updates
     * @return the updated WorkbookTable
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookTable patch(final WorkbookTable sourceWorkbookTable) throws ClientException;

    /**
     * Posts a WorkbookTable with a new object
     *
     * @param newWorkbookTable the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WorkbookTable newWorkbookTable, final ICallback<WorkbookTable> callback);

    /**
     * Posts a WorkbookTable with a new object
     *
     * @param newWorkbookTable the new object to create
     * @return the created WorkbookTable
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookTable post(final WorkbookTable newWorkbookTable) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseWorkbookTableRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseWorkbookTableRequest expand(final String value);

}

