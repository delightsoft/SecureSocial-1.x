/**
 * Copyright 2012 Jorge Aliss (jaliss at gmail dot com) - twitter: @jaliss
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
 *
 *
 */
package controllers.securesocial;

import play.mvc.Before;
import play.mvc.Controller;

/**
 * A controller that sets the current user in the renderArgs object.
 * Use this controller to annotate public controllers that need access to the 'user' object
 * in the templates.
 */
public class SecureSocialPublic extends Controller {
    /**
     * Sets the current user (if there's one) in the renderArgs object.
     */
    @Before
    static void setCurrentUserInRenderArgs() {
    	renderArgs.put(SecureSocial.USER, SecureSocial.loadCurrentUser());
    }
}
