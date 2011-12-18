/*
 * Copyright 2005 Wavechain Consulting LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.firstopen.singularity.business;

import org.firstopen.singularity.system.BaseObject;

/**
 * 
 */
public class TagIdMap extends BaseObject{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2085616562715267406L;

	/*
	 * NOTE: This class should be set to lazy=false, otherwise the following
	 * exception is thrown when accessing properties from outside the Hibernate
	 * JVM: org.hibernate.LazyInitializationException: could not initialize
	 * proxy - no Session
	 */
	private String id;

	private String binId;

	private String itemId;

	private double quantity;

	private String location;

	public TagIdMap() {
	}

	/**
	 * @hibernate.id 
	 *   generator-class="uuid.hex" length="128"
	 *  
	 */
	public String getId() {
		return id;
	}

	public void setId(String x) {
		id = x;
	}

	/**
	 * @hibernate.property
	 */
	public String getBinId() {
		return binId;
	}

	public void setBinId(String x) {
		binId = x;
	}

	/**
	 * @hibernate.property
	 */
	public String getItemId() {
		return itemId;
	}

	public void setItemId(String x) {
		itemId = x;
	}

	/**
	 * @hibernate.property
	 */
	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double x) {
		quantity = x;
	}

	/**
	 * @hibernate.property
	 */
	public String getLocation() {
		return location;
	}

	public void setLocation(String x) {
		location = x;
	}

	public void setDisplayName() {
		displayName = id;
	}

}
