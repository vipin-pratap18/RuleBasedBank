package com.rule.runner;

import java.util.Collection;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.definition.KnowledgePackage;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;

public class RuleRunner {

	public RuleRunner(){}
	
	public void runRules(String [] rules, Object[] facts ) throws Exception{
		
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		
		for(int i=0; i<rules.length; i++){
			String ruleFile = rules[i];
			System.out.println("Loading file : " + ruleFile);
			kbuilder.add(ResourceFactory.newClassPathResource(ruleFile, RuleRunner.class), ResourceType.DRL);
		}
		
		Collection<KnowledgePackage> pkgs = kbuilder.getKnowledgePackages();
		kbase.addKnowledgePackages(pkgs);
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		
		for(int i=0; i<facts.length; i++){
			Object fact = facts[i];
			System.out.println(" inserting fact : "+fact);
			ksession.insert(fact);
		}
		
		ksession.fireAllRules();
		
	}
}
