/*******************************************************************************
 * Copyright 2015 The MITRE Corporation
 *   and the MIT Kerberos and Internet Trust Consortium
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package org.mitre.uma.service;

import java.util.Collection;

import org.mitre.uma.model.Claim;

/**
 * 
 * Processes claims presented during an UMA transaction.
 * 
 * @author jricher
 *
 */
public interface ClaimsProcessingService {

	/**
	 * 
	 * Determine whether or not the claims that have been supplied are
	 * sufficient to fulfill the requirements given by the claims that
	 * are required.
	 * 
	 * @param claimsRequired the required claims to check against
	 * @param claimsSupplied the supplied claims to test
	 * @return the unmatched claims (if any), an empty set if the claims are satisfied, never null
	 */
	public Collection<Claim> claimsAreSatisfied(Collection<Claim> claimsRequired, Collection<Claim> claimsSupplied);

}
