// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IEducationSchoolRequest;
import com.microsoft.graph.requests.extensions.EducationSchoolRequest;
import com.microsoft.graph.requests.extensions.IEducationClassCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationClassCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationClassWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationClassWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationUserCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationUserCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationUserWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationUserWithReferenceRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Education School Request Builder.
 */
public class BaseEducationSchoolRequestBuilder extends BaseRequestBuilder implements IBaseEducationSchoolRequestBuilder {

    /**
     * The request builder for the EducationSchool
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseEducationSchoolRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IEducationSchoolRequest instance
     */
    public IEducationSchoolRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IEducationSchoolRequest instance
     */
    public IEducationSchoolRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new EducationSchoolRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IEducationClassCollectionWithReferencesRequestBuilder classes() {
        return new EducationClassCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("classes"), getClient(), null);
    }

    public IEducationClassWithReferenceRequestBuilder classes(final String id) {
        return new EducationClassWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("classes") + "/" + id, getClient(), null);
    }
    public IEducationUserCollectionWithReferencesRequestBuilder users() {
        return new EducationUserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("users"), getClient(), null);
    }

    public IEducationUserWithReferenceRequestBuilder users(final String id) {
        return new EducationUserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("users") + "/" + id, getClient(), null);
    }
}

