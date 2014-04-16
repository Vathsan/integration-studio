/*
 * Copyright 2014 WSO2, Inc. (http://wso2.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dataMapper.diagram.custom.configuration.function;

import java.util.ArrayList;
import java.util.List;

import dataMapper.TreeNode;

public class ForLoop {
	private String arguments;
	private List<String> functionCall;
	private ForLoop forLoop;
	private String index;
	private TreeNode arrayTree;
	private List<AssignmentStatement> assignmentStatements;
	private String decleration;
	
	
	
	public ForLoop() {
		this.arguments = null;
		this.functionCall = new ArrayList<String>();
//		this.forLoop = new ForLoop();
		this.index = "i";
		this.arrayTree = null;
		this.assignmentStatements = new ArrayList<AssignmentStatement>();
		this.decleration = null;
	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public String getArguments() {
		return arguments;
	}
	public void setArguments(String arguments) {
		this.arguments = arguments;
	}
	public List<String> getFunctionCall() {
		return functionCall;
	}
	public void setFunctionCall(ArrayList<String> functionCall) {
		this.functionCall = functionCall;
	}
	public ForLoop getForLoop() {
		return forLoop;
	}
	public void setForLoop(ForLoop forLoop) {
		this.forLoop = forLoop;
	}
	public TreeNode getArrayTree() {
		return arrayTree;
	}
	public void setArrayTree(TreeNode arrayTree) {
		this.arrayTree = arrayTree;
	}
	public List<AssignmentStatement> getAssignmentStatements() {
		return assignmentStatements;
	}
	public void setAssignmentStatements(ArrayList<AssignmentStatement> assignmentStatements) {
		this.assignmentStatements = assignmentStatements;
	}
	
	public String getDecleration() {
		return decleration;
	}
	public void setDecleration(String decleration) {
		this.decleration = decleration;
	}

	private void createDecleration() {
		setDecleration("for ( var "+getIndex()+ " in " + getArrayTree().getName()+") {\n");
		
	}
	
	@Override
	public String toString() {
		createDecleration();
		StringBuilder loop = new StringBuilder(getDecleration());
		for(String call : getFunctionCall()){
			loop.append(call);
			loop.append("\n");
		}
		for(AssignmentStatement assign : getAssignmentStatements()){
			loop.append(assign.getStatement());
			loop.append("\n");
		}
		loop.append("}");
		return loop.toString();
	}
	
}
