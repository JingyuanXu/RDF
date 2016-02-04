/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package riotcmdx;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.apache.jena.atlas.lib.Lib ;
import org.apache.jena.atlas.web.ContentType ;
import org.apache.jena.riot.Lang ;
import org.apache.jena.riot.RDFLanguages ;

import riotcmd.CmdLangParse ;

/**
 * A command line tool for direct and scalable transforming from CSV to the formatted RDF syntax (i.e. N-Triples), 
 * with no intermediary Graph or PropertyTable.
 */
public class csv2rdf extends CmdLangParse{
	
	  public static void main(String... argv) throws FileNotFoundException
	    {
	        String[] args = new String[1];
	        args[0] = "/Users/xujing/Documents/workspace/csv2/src/riotcmdx/test11.csv";
	        new csv2rdf(args).mainRun() ;
	        System.setOut(new PrintStream(new FileOutputStream("/Users/xujing/Documents/workspace/csv2/src/riotcmdx/test11.nt")));
	       
	    }    
	    
	    protected csv2rdf(String[] argv)
	    {
	        super(argv) ;
	    }
	    
	    @Override
	    protected Lang selectLang(String filename, ContentType contentType, Lang dftLang) {
	        return RDFLanguages.CSV; 
	    }

	    @Override
	    protected String getCommandName() {
	        return Lib.classShortName(csv2rdf.class) ;
	    }
}
