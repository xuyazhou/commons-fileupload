/*
 * Copyright 2001-2004 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.fileupload.portlet;

import java.io.InputStream;
import java.io.IOException;
import javax.portlet.ActionRequest;
import org.apache.commons.fileupload.RequestContext;

/**
 * <p>Provides access to the request information needed for a request made to
 * a portlet.</p>
 *
 * @author <a href="mailto:martinc@apache.org">Martin Cooper</a>
 *
 * @since FileUpload 1.1
 *
 * @version $Id: PortletRequestContext.java,v 1.1 2004/10/31 05:21:43 martinc Exp $
 */
public class PortletRequestContext implements RequestContext {

    // ----------------------------------------------------- Instance Variables

    /**
     * The request for which the context is being provided.
     */
    private ActionRequest request;


    // ----------------------------------------------------------- Constructors

    /**
     * Construct a context for this request.
     */
    public PortletRequestContext(ActionRequest request) {
        this.request = request;
    }


    // --------------------------------------------------------- Public Methods

    /**
     * Retrieve the content type of the request.
     *
     * @return The content type of the request.
     */
    public String getContentType() {
        return request.getContentType();
    }

    /**
     * Retrieve the content length of the request.
     *
     * @return The content length of the request.
     */
    public int getContentLength() {
        return request.getContentLength();
    }

    /**
     * Retrieve the input stream for the request.
     *
     * @return The input stream for the request.
     *
     * @throws IOException if a problem occurs.
     */
    public InputStream getInputStream() throws IOException {
        return request.getPortletInputStream();
    }
}
