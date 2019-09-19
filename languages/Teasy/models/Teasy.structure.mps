<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)">
  <persistence version="9" />
  <languages>
    <use id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure" version="7" />
    <devkit ref="78434eb8-b0e5-444b-850d-e7c4ad2da9ab(jetbrains.mps.devkit.aspect.structure)" />
  </languages>
  <imports>
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure">
      <concept id="1169125787135" name="jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration" flags="ig" index="PkWjJ">
        <property id="6714410169261853888" name="conceptId" index="EcuMT" />
        <property id="4628067390765907488" name="conceptShortDescription" index="R4oN_" />
        <property id="5092175715804935370" name="conceptAlias" index="34LRSv" />
        <child id="1071489727083" name="linkDeclaration" index="1TKVEi" />
        <child id="1071489727084" name="propertyDeclaration" index="1TKVEl" />
      </concept>
      <concept id="1169127622168" name="jetbrains.mps.lang.structure.structure.InterfaceConceptReference" flags="ig" index="PrWs8">
        <reference id="1169127628841" name="intfc" index="PrY4T" />
      </concept>
      <concept id="1071489090640" name="jetbrains.mps.lang.structure.structure.ConceptDeclaration" flags="ig" index="1TIwiD">
        <property id="1096454100552" name="rootable" index="19KtqR" />
        <reference id="1071489389519" name="extends" index="1TJDcQ" />
        <child id="1169129564478" name="implements" index="PzmwI" />
      </concept>
      <concept id="1071489288299" name="jetbrains.mps.lang.structure.structure.PropertyDeclaration" flags="ig" index="1TJgyi">
        <property id="241647608299431129" name="propertyId" index="IQ2nx" />
        <reference id="1082985295845" name="dataType" index="AX2Wp" />
      </concept>
      <concept id="1071489288298" name="jetbrains.mps.lang.structure.structure.LinkDeclaration" flags="ig" index="1TJgyj">
        <property id="1071599776563" name="role" index="20kJfa" />
        <property id="1071599893252" name="sourceCardinality" index="20lbJX" />
        <property id="1071599937831" name="metaClass" index="20lmBu" />
        <property id="241647608299431140" name="linkId" index="IQ2ns" />
        <reference id="1071599976176" name="target" index="20lvS9" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="1TIwiD" id="GEdEPdQOJV">
    <property role="EcuMT" value="804515601402514427" />
    <property role="TrG5h" value="Configuration" />
    <property role="19KtqR" value="true" />
    <property role="34LRSv" value="Configuration File" />
    <property role="R4oN_" value="This file is for configuration test" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyi" id="GEdEPdQPcY" role="1TKVEl">
      <property role="IQ2nx" value="804515601402516286" />
      <property role="TrG5h" value="GENERATION_USE_SPECIFIED_FLOWS" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
    <node concept="1TJgyi" id="GEdEPdQPd0" role="1TKVEl">
      <property role="IQ2nx" value="804515601402516288" />
      <property role="TrG5h" value="GENERATION_USE_GENERATED_FLOWS" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
    <node concept="1TJgyi" id="GEdEPdQPd3" role="1TKVEl">
      <property role="IQ2nx" value="804515601402516291" />
      <property role="TrG5h" value="TIME_IN_MILISECONDS_FOR_PAGE_RENDERING" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyi" id="GEdEPdQPd7" role="1TKVEl">
      <property role="IQ2nx" value="804515601402516295" />
      <property role="TrG5h" value="GENERATE_TEST_SCRIPTS" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
    <node concept="1TJgyi" id="GEdEPdQPdc" role="1TKVEl">
      <property role="IQ2nx" value="804515601402516300" />
      <property role="TrG5h" value="MAXIMUM_TEST_SCRIPTS" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyi" id="GEdEPdQPdi" role="1TKVEl">
      <property role="IQ2nx" value="804515601402516306" />
      <property role="TrG5h" value="GENERATE_TEST_SEQUENCES" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
    <node concept="1TJgyi" id="GEdEPdQPdp" role="1TKVEl">
      <property role="IQ2nx" value="804515601402516313" />
      <property role="TrG5h" value="MAXIMUM_TEST_SEQUENCES" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyj" id="GEdEPdQPcT" role="1TKVEi">
      <property role="IQ2ns" value="804515601402516281" />
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="ROOT_PAGE_SYSTEM" />
      <property role="20lbJX" value="1" />
      <ref role="20lvS9" node="GEdEPdQOJW" resolve="Declaration" />
    </node>
    <node concept="1TJgyj" id="GEdEPdQPcV" role="1TKVEi">
      <property role="IQ2ns" value="804515601402516283" />
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="SYSTEM_ACTOR" />
      <property role="20lbJX" value="0..n" />
      <ref role="20lvS9" node="GEdEPdQOJZ" resolve="Actor" />
    </node>
  </node>
  <node concept="1TIwiD" id="GEdEPdQOJW">
    <property role="EcuMT" value="804515601402514428" />
    <property role="TrG5h" value="Declaration" />
    <property role="34LRSv" value="Declaration File" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="GEdEPdQOK6" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="GEdEPdQOJZ">
    <property role="EcuMT" value="804515601402514431" />
    <property role="TrG5h" value="Actor" />
    <property role="34LRSv" value="Actor" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="GEdEPdQOK0" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="GEdEPdQOK2">
    <property role="EcuMT" value="804515601402514434" />
    <property role="TrG5h" value="VerifierElement" />
    <property role="34LRSv" value="Verifier Element" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="GEdEPdQOK8" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="GEdEPdQOK3">
    <property role="EcuMT" value="804515601402514435" />
    <property role="TrG5h" value="Action" />
    <property role="34LRSv" value="Action" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="GEdEPdQOK4" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="GEdEPdQOKa">
    <property role="EcuMT" value="804515601402514442" />
    <property role="TrG5h" value="BlockAction" />
    <property role="34LRSv" value="Block Action" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="GEdEPdQOKb" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="GEdEPdQOKd">
    <property role="EcuMT" value="804515601402514445" />
    <property role="TrG5h" value="DataForAction" />
    <property role="34LRSv" value="Data For Action" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="GEdEPdQOKe" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="GEdEPdQOKg">
    <property role="EcuMT" value="804515601402514448" />
    <property role="TrG5h" value="DefaultElement" />
    <property role="34LRSv" value="Default Element" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="GEdEPdQOKh" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="GEdEPdQOKj">
    <property role="EcuMT" value="804515601402514451" />
    <property role="TrG5h" value="EquivalencePartition" />
    <property role="34LRSv" value="Equivalence Partition" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="GEdEPdQOKk" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="GEdEPdQOKm">
    <property role="EcuMT" value="804515601402514454" />
    <property role="TrG5h" value="Flow" />
    <property role="34LRSv" value="Flow" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="GEdEPdQOKn" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
</model>

