/**
 Copyright 2006 OCLC, Online Computer Library Center
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at
 
 http://www.apache.org/licenses/LICENSE-2.0
 
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package test.ORG.oclc.oai.harvester2.verb;

import junit.framework.TestCase;
import ORG.oclc.oai.harvester2.verb.ListMetadataFormats;

public class ListMetadataFormatsTest extends TestCase {
    public ListMetadataFormatsTest(String name) {
	super(name);
    }

    public void test11() {
	try {
	    ListMetadataFormats listMetadataFormats =
		new ListMetadataFormats("http://scholar.lib.vt.edu/theses/OAI/cgi-bin/index.pl",
					"oai:VTETD:etd-3345131939761081");
	    assertTrue(ListMetadataFormats.SCHEMA_LOCATION_V1_1_LIST_METADATA_FORMATS.equals(listMetadataFormats.getSchemaLocation()));
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
    
    public void test20() {
	try {
	    ListMetadataFormats listMetadataFormats =
		new ListMetadataFormats("http://alcme.oclc.org/xtcat/servlet/OAIHandler",
					"oai:xtcat.oclc.org:OCLCNo/ocm00000012");
	    assertTrue(ListMetadataFormats.SCHEMA_LOCATION_V2_0.equals(listMetadataFormats.getSchemaLocation()));
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
