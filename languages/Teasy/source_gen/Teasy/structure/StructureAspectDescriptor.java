package Teasy.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import jetbrains.mps.smodel.runtime.DataTypeDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;
import jetbrains.mps.smodel.adapter.ids.PrimitiveTypeId;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptAction = createDescriptorForAction();
  /*package*/ final ConceptDescriptor myConceptActionItemList = createDescriptorForActionItemList();
  /*package*/ final ConceptDescriptor myConceptActionListToImplement = createDescriptorForActionListToImplement();
  /*package*/ final ConceptDescriptor myConceptActionListToReferences = createDescriptorForActionListToReferences();
  /*package*/ final ConceptDescriptor myConceptActiveActionElement = createDescriptorForActiveActionElement();
  /*package*/ final ConceptDescriptor myConceptActor = createDescriptorForActor();
  /*package*/ final ConceptDescriptor myConceptActorItemList = createDescriptorForActorItemList();
  /*package*/ final ConceptDescriptor myConceptActorListToImplement = createDescriptorForActorListToImplement();
  /*package*/ final ConceptDescriptor myConceptActorListToReferences = createDescriptorForActorListToReferences();
  /*package*/ final ConceptDescriptor myConceptBlockAction = createDescriptorForBlockAction();
  /*package*/ final ConceptDescriptor myConceptBlockActionItemList = createDescriptorForBlockActionItemList();
  /*package*/ final ConceptDescriptor myConceptBlockActionListToImplement = createDescriptorForBlockActionListToImplement();
  /*package*/ final ConceptDescriptor myConceptBlockActionListToReferences = createDescriptorForBlockActionListToReferences();
  /*package*/ final ConceptDescriptor myConceptConfiguration = createDescriptorForConfiguration();
  /*package*/ final ConceptDescriptor myConceptConfigurationOld = createDescriptorForConfigurationOld();
  /*package*/ final ConceptDescriptor myConceptDataForAction = createDescriptorForDataForAction();
  /*package*/ final ConceptDescriptor myConceptDefaultElement = createDescriptorForDefaultElement();
  /*package*/ final ConceptDescriptor myConceptElementToReceiveData = createDescriptorForElementToReceiveData();
  /*package*/ final ConceptDescriptor myConceptElementToReceiveDataItemList = createDescriptorForElementToReceiveDataItemList();
  /*package*/ final ConceptDescriptor myConceptElementToReceiveDataListToImplement = createDescriptorForElementToReceiveDataListToImplement();
  /*package*/ final ConceptDescriptor myConceptElementToReceiveDataListToReferences = createDescriptorForElementToReceiveDataListToReferences();
  /*package*/ final ConceptDescriptor myConceptFlow = createDescriptorForFlow();
  /*package*/ final ConceptDescriptor myConceptFlowListToImplement = createDescriptorForFlowListToImplement();
  /*package*/ final ConceptDescriptor myConceptInvalidData = createDescriptorForInvalidData();
  /*package*/ final ConceptDescriptor myConceptPage = createDescriptorForPage();
  /*package*/ final ConceptDescriptor myConceptPageListToImplement = createDescriptorForPageListToImplement();
  /*package*/ final ConceptDescriptor myConceptValidData = createDescriptorForValidData();
  /*package*/ final ConceptDescriptor myConceptVerifierElement = createDescriptorForVerifierElement();
  /*package*/ final ConceptDescriptor myConceptVerifierElementItemList = createDescriptorForVerifierElementItemList();
  /*package*/ final ConceptDescriptor myConceptVerifierElementListToImplement = createDescriptorForVerifierElementListToImplement();
  /*package*/ final ConceptDescriptor myConceptVerifierElementListToReferences = createDescriptorForVerifierElementListToReferences();
  /*package*/ final EnumerationDescriptor myEnumerationbrowsers = new EnumerationDescriptor_browsers();
  /*package*/ final EnumerationDescriptor myEnumerationidentifier = new EnumerationDescriptor_identifier();
  private final LanguageConceptSwitch myIndexSwitch;

  public StructureAspectDescriptor() {
    myIndexSwitch = new LanguageConceptSwitch();
  }


  @Override
  public void reportDependencies(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.Dependencies deps) {
    deps.extendedLanguage(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, "jetbrains.mps.lang.core");
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptAction, myConceptActionItemList, myConceptActionListToImplement, myConceptActionListToReferences, myConceptActiveActionElement, myConceptActor, myConceptActorItemList, myConceptActorListToImplement, myConceptActorListToReferences, myConceptBlockAction, myConceptBlockActionItemList, myConceptBlockActionListToImplement, myConceptBlockActionListToReferences, myConceptConfiguration, myConceptConfigurationOld, myConceptDataForAction, myConceptDefaultElement, myConceptElementToReceiveData, myConceptElementToReceiveDataItemList, myConceptElementToReceiveDataListToImplement, myConceptElementToReceiveDataListToReferences, myConceptFlow, myConceptFlowListToImplement, myConceptInvalidData, myConceptPage, myConceptPageListToImplement, myConceptValidData, myConceptVerifierElement, myConceptVerifierElementItemList, myConceptVerifierElementListToImplement, myConceptVerifierElementListToReferences);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myIndexSwitch.index(id)) {
      case LanguageConceptSwitch.Action:
        return myConceptAction;
      case LanguageConceptSwitch.ActionItemList:
        return myConceptActionItemList;
      case LanguageConceptSwitch.ActionListToImplement:
        return myConceptActionListToImplement;
      case LanguageConceptSwitch.ActionListToReferences:
        return myConceptActionListToReferences;
      case LanguageConceptSwitch.ActiveActionElement:
        return myConceptActiveActionElement;
      case LanguageConceptSwitch.Actor:
        return myConceptActor;
      case LanguageConceptSwitch.ActorItemList:
        return myConceptActorItemList;
      case LanguageConceptSwitch.ActorListToImplement:
        return myConceptActorListToImplement;
      case LanguageConceptSwitch.ActorListToReferences:
        return myConceptActorListToReferences;
      case LanguageConceptSwitch.BlockAction:
        return myConceptBlockAction;
      case LanguageConceptSwitch.BlockActionItemList:
        return myConceptBlockActionItemList;
      case LanguageConceptSwitch.BlockActionListToImplement:
        return myConceptBlockActionListToImplement;
      case LanguageConceptSwitch.BlockActionListToReferences:
        return myConceptBlockActionListToReferences;
      case LanguageConceptSwitch.Configuration:
        return myConceptConfiguration;
      case LanguageConceptSwitch.ConfigurationOld:
        return myConceptConfigurationOld;
      case LanguageConceptSwitch.DataForAction:
        return myConceptDataForAction;
      case LanguageConceptSwitch.DefaultElement:
        return myConceptDefaultElement;
      case LanguageConceptSwitch.ElementToReceiveData:
        return myConceptElementToReceiveData;
      case LanguageConceptSwitch.ElementToReceiveDataItemList:
        return myConceptElementToReceiveDataItemList;
      case LanguageConceptSwitch.ElementToReceiveDataListToImplement:
        return myConceptElementToReceiveDataListToImplement;
      case LanguageConceptSwitch.ElementToReceiveDataListToReferences:
        return myConceptElementToReceiveDataListToReferences;
      case LanguageConceptSwitch.Flow:
        return myConceptFlow;
      case LanguageConceptSwitch.FlowListToImplement:
        return myConceptFlowListToImplement;
      case LanguageConceptSwitch.InvalidData:
        return myConceptInvalidData;
      case LanguageConceptSwitch.Page:
        return myConceptPage;
      case LanguageConceptSwitch.PageListToImplement:
        return myConceptPageListToImplement;
      case LanguageConceptSwitch.ValidData:
        return myConceptValidData;
      case LanguageConceptSwitch.VerifierElement:
        return myConceptVerifierElement;
      case LanguageConceptSwitch.VerifierElementItemList:
        return myConceptVerifierElementItemList;
      case LanguageConceptSwitch.VerifierElementListToImplement:
        return myConceptVerifierElementListToImplement;
      case LanguageConceptSwitch.VerifierElementListToReferences:
        return myConceptVerifierElementListToReferences;
      default:
        return null;
    }
  }

  @Override
  public Collection<DataTypeDescriptor> getDataTypeDescriptors() {
    return Arrays.asList(myEnumerationbrowsers, myEnumerationidentifier);
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myIndexSwitch.index(c);
  }

  private static ConceptDescriptor createDescriptorForAction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "Action", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4c03L);
    b.class_(false, false, false);
    b.super_("Teasy.structure.DefaultElement", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x61de6d20174a9e7cL);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/804515601402514435");
    b.version(2);
    b.property("OBJECTIVE", 0xb2a36ad4ddb5c1eL).type(PrimitiveTypeId.STRING).origin("804515601402518558").done();
    b.associate("NEXT_PAGE_AFTER_ACTION_VALID_CASE", 0x4ce181543f5527b2L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4bfcL).optional(false).origin("5539851215482202034").done();
    b.associate("NEXT_PAGE_AFTER_ACTION_INVALID_CASE", 0x4ce181543f552cecL).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4bfcL).optional(false).origin("5539851215482203372").done();
    b.associate("ELEMENT_TO_VERIFY_VALID_CASE", 0x4ce181543f552833L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4c02L).optional(false).origin("5539851215482202163").done();
    b.associate("ELEMENT_TO_VERIFY_INVALID_CASE", 0x4ce181543f552b02L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4c02L).optional(false).origin("5539851215482202882").done();
    b.aggregate("ELEMENT_TO_ACTIVE_ACTION", 0xb2a36ad4ddb5c2cL).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4c10L).optional(false).ordered(true).multiple(false).origin("804515601402518572").done();
    b.aggregate("DATA_FOR_ACTION", 0x5862803877ab78baL).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4c0dL).optional(true).ordered(true).multiple(false).origin("6368793803069552826").done();
    b.aggregate("ACTOR_CAN_EXECUTE_ACTION", 0x4ce181543f5c822cL).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f3b1676L).optional(true).ordered(true).multiple(false).origin("5539851215482683948").done();
    b.alias("Action");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForActionItemList() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "ActionItemList", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f2b945cL);
    b.class_(false, false, false);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/5539851215479477340");
    b.version(2);
    b.associate("ACTION_ITEM", 0x4ce181543f2b945dL).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4c03L).optional(false).origin("5539851215479477341").done();
    b.alias("Action Item List");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForActionListToImplement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "ActionListToImplement", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f2b945fL);
    b.class_(false, false, true);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/5539851215479477343");
    b.version(2);
    b.aggregate("ACTIONS", 0x4ce181543f2b9460L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4c03L).optional(true).ordered(true).multiple(true).origin("5539851215479477344").done();
    b.alias("Action List");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForActionListToReferences() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "ActionListToReferences", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f327511L);
    b.class_(false, false, false);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/5539851215479928081");
    b.version(2);
    b.aggregate("ACTION_ITEMS", 0x4ce181543f327512L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f2b945cL).optional(true).ordered(true).multiple(true).origin("5539851215479928082").done();
    b.alias("Action List to References");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForActiveActionElement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "ActiveActionElement", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4c10L);
    b.class_(false, false, false);
    b.super_("Teasy.structure.DefaultElement", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x61de6d20174a9e7cL);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/804515601402514448");
    b.version(2);
    b.property("IS_CLICKABLE", 0xb2a36ad4ddb5c40L).type(PrimitiveTypeId.BOOLEAN).origin("804515601402518592").done();
    b.alias("Active Action Element");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForActor() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "Actor", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4bffL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/804515601402514431");
    b.version(2);
    b.property("USERNAME", 0x5862803877aadf90L).type(PrimitiveTypeId.STRING).origin("6368793803069513616").done();
    b.property("PASSWORD", 0x5862803877aadf95L).type(PrimitiveTypeId.STRING).origin("6368793803069513621").done();
    b.associate("ELEMENT_TO_RECEIVE_DATA_USERNAME", 0x4ce181543f7e3b90L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x5862803877ab78b1L).optional(false).origin("5539851215484894096").done();
    b.associate("ELEMENT_TO_RECEIVE_DATA_PASSWORD", 0x4ce181543f7e3b92L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x5862803877ab78b1L).optional(false).origin("5539851215484894098").done();
    b.alias("Actor");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForActorItemList() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "ActorItemList", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f3b1678L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/5539851215480493688");
    b.version(2);
    b.associate("ACTOR_ITEM", 0x4ce181543f3b167dL).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4bffL).optional(false).origin("5539851215480493693").done();
    b.alias("Actor");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForActorListToImplement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "ActorListToImplement", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x339c4c2c735cc22dL);
    b.class_(false, false, true);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/3718931146098917933");
    b.version(2);
    b.aggregate("ACTORS", 0x339c4c2c735cc230L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4bffL).optional(true).ordered(true).multiple(true).origin("3718931146098917936").done();
    b.alias("Actor List");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForActorListToReferences() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "ActorListToReferences", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f3b1676L);
    b.class_(false, false, false);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/5539851215480493686");
    b.version(2);
    b.aggregate("ACTORS_ITEMS", 0x4ce181543f3b1677L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f3b1678L).optional(true).ordered(true).multiple(true).origin("5539851215480493687").done();
    b.alias("Actor List to References");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBlockAction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "BlockAction", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4c0aL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/804515601402514442");
    b.version(2);
    b.aggregate("ACTIONS", 0xb2a36ad4ddb5c3cL).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f327511L).optional(false).ordered(true).multiple(false).origin("804515601402518588").done();
    b.alias("Block Action");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBlockActionItemList() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "BlockActionItemList", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f3db376L);
    b.class_(false, false, false);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/5539851215480664950");
    b.version(2);
    b.associate("BLOCK_ACTION_ITEM", 0x4ce181543f3db377L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4c0aL).optional(false).origin("5539851215480664951").done();
    b.alias("Item of the Block Action");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBlockActionListToImplement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "BlockActionListToImplement", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f3db372L);
    b.class_(false, false, true);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/5539851215480664946");
    b.version(2);
    b.aggregate("BLOCK_ACTIONS", 0x4ce181543f3db373L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4c0aL).optional(true).ordered(true).multiple(true).origin("5539851215480664947").done();
    b.alias("Block Action List");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBlockActionListToReferences() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "BlockActionListToReferences", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f3db375L);
    b.class_(false, false, false);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/5539851215480664949");
    b.version(2);
    b.aggregate("BLOCK_ACTIONS_ITEM", 0x4ce181543f3db70cL).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f3db376L).optional(true).ordered(true).multiple(true).origin("5539851215480665868").done();
    b.alias("Block Action List to References");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForConfiguration() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "Configuration", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x637c9747e115f171L);
    b.class_(false, false, true);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/7168771041841770865");
    b.version(2);
    b.property("browser", 0x637c9747e115f172L).type(MetaIdFactory.dataTypeId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x637c9747e115f174L)).origin("7168771041841770866").done();
    b.property("url_root_page", 0x637c9747e115f17fL).type(PrimitiveTypeId.STRING).origin("7168771041841770879").done();
    b.property("time_to_wait", 0x637c9747e115f182L).type(PrimitiveTypeId.INTEGER).origin("7168771041841770882").done();
    b.property("max_test_to_generate", 0x637c9747e115f186L).type(PrimitiveTypeId.INTEGER).origin("7168771041841770886").done();
    b.alias("Configuration");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForConfigurationOld() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "ConfigurationOld", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4bfbL);
    b.class_(false, false, false);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/804515601402514427");
    b.version(2);
    b.property("GENERATION_USE_SPECIFIED_FLOWS", 0xb2a36ad4ddb533eL).type(PrimitiveTypeId.BOOLEAN).origin("804515601402516286").done();
    b.property("GENERATION_USE_GENERATED_FLOWS", 0xb2a36ad4ddb5340L).type(PrimitiveTypeId.BOOLEAN).origin("804515601402516288").done();
    b.property("TIME_IN_MILISECONDS_FOR_PAGE_RENDERING", 0xb2a36ad4ddb5343L).type(PrimitiveTypeId.INTEGER).origin("804515601402516291").done();
    b.property("GENERATE_TEST_SCRIPTS", 0xb2a36ad4ddb5347L).type(PrimitiveTypeId.BOOLEAN).origin("804515601402516295").done();
    b.property("MAXIMUM_TEST_SCRIPTS", 0xb2a36ad4ddb534cL).type(PrimitiveTypeId.INTEGER).origin("804515601402516300").done();
    b.property("GENERATE_TEST_SEQUENCES", 0xb2a36ad4ddb5352L).type(PrimitiveTypeId.BOOLEAN).origin("804515601402516306").done();
    b.property("MAXIMUM_TEST_SEQUENCES", 0xb2a36ad4ddb5359L).type(PrimitiveTypeId.INTEGER).origin("804515601402516313").done();
    b.property("URL_ROOT_PAGE", 0x1baae46d0b7cbfb1L).type(PrimitiveTypeId.STRING).origin("1993656942060158897").done();
    b.associate("LOGIN_PAGE", 0x1baae46d0b7b4e69L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4bfcL).optional(true).origin("1993656942060064361").done();
    b.associate("ROOT_PAGE_SYSTEM", 0x1baae46d0b7e2b47L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4bfcL).optional(false).origin("1993656942060251975").done();
    b.alias("Configuration");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDataForAction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "DataForAction", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4c0dL);
    b.class_(false, false, false);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/804515601402514445");
    b.version(2);
    b.aggregate("ELEMENT_TO_RECEIVE_DATA", 0x5862803877ab78adL).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f46f9b4L).optional(false).ordered(true).multiple(true).origin("6368793803069552813").done();
    b.alias("Data For Action");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDefaultElement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "DefaultElement", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x61de6d20174a9e7cL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/7052194051105922684");
    b.version(2);
    b.property("IDENTIFIER_TYPE", 0x61de6d20174a9e7fL).type(MetaIdFactory.dataTypeId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb5374L)).origin("7104666410623122226").done();
    b.property("TEXT_TO_IDENTIFY", 0x339c4c2c735d6509L).type(PrimitiveTypeId.STRING).origin("3718931146098959625").done();
    b.alias("DefaultElement");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForElementToReceiveData() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "ElementToReceiveData", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x5862803877ab78b1L);
    b.class_(false, false, false);
    b.super_("Teasy.structure.DefaultElement", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x61de6d20174a9e7cL);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/6368793803069552817");
    b.version(2);
    b.property("IS_A_SELECT_ELEMENT", 0x1baae46d0b828af4L).type(PrimitiveTypeId.BOOLEAN).origin("1993656942060538612").done();
    b.aggregate("VALID_DATA", 0x5862803877ab78b2L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x5862803877ab78a2L).optional(true).ordered(true).multiple(true).origin("6368793803069552818").done();
    b.aggregate("INVALID_DATA", 0x5862803877ab78b4L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x5862803877ab78a5L).optional(true).ordered(true).multiple(true).origin("6368793803069552820").done();
    b.alias("Element to receive data");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForElementToReceiveDataItemList() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "ElementToReceiveDataItemList", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f46f9b5L);
    b.class_(false, false, false);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/5539851215481272757");
    b.version(2);
    b.associate("ELEMENT_TO_RECEIVE_DATA_ITEM", 0x4ce181543f46f9b6L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x5862803877ab78b1L).optional(false).origin("5539851215481272758").done();
    b.alias("Element to receive data item list");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForElementToReceiveDataListToImplement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "ElementToReceiveDataListToImplement", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f46f9b3L);
    b.class_(false, false, true);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/5539851215481272755");
    b.version(2);
    b.aggregate("ELEMENTS_TO_RECEIVE_DATA", 0x4ce181543f46fa09L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x5862803877ab78b1L).optional(false).ordered(true).multiple(true).origin("5539851215481272841").done();
    b.alias("Element to Receive Data List");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForElementToReceiveDataListToReferences() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "ElementToReceiveDataListToReferences", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f46f9b4L);
    b.class_(false, false, false);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/5539851215481272756");
    b.version(2);
    b.aggregate("ELEMENTS_TO_RECEIVE_DATA", 0x4ce181543f46f9b8L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f46f9b5L).optional(false).ordered(true).multiple(true).origin("5539851215481272760").done();
    b.alias("Element to receive data list references");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForFlow() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "Flow", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4c16L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/804515601402514454");
    b.version(2);
    b.associate("PAGES", 0x4ce181543f73c32fL).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4bfcL).optional(false).origin("5539851215484207919").done();
    b.associate("ACTOR", 0x4ce181543f73c337L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4bffL).optional(true).origin("5539851215484207927").done();
    b.associate("ACTION", 0x4ce181543f73c33cL).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4c03L).optional(true).origin("5539851215484207932").done();
    b.associate("BLOCK_ACTION", 0x4ce181543f73c342L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4c0aL).optional(true).origin("5539851215484207938").done();
    b.alias("Flow");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForFlowListToImplement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "FlowListToImplement", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f75d2a8L);
    b.class_(false, false, true);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/5539851215484342952");
    b.version(2);
    b.aggregate("FLOWS", 0x4ce181543f75d2a9L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4c16L).optional(false).ordered(true).multiple(true).origin("5539851215484342953").done();
    b.alias("Flow List");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForInvalidData() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "InvalidData", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x5862803877ab78a5L);
    b.class_(false, false, false);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/6368793803069552805");
    b.version(2);
    b.property("DATA", 0x5862803877ab78a6L).type(PrimitiveTypeId.STRING).origin("6368793803069552806").done();
    b.alias("Invalid data");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPage() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "Page", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4bfcL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/804515601402514428");
    b.version(2);
    b.aggregate("ACTIONS", 0xb2a36ad4ddb5363L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f327511L).optional(true).ordered(true).multiple(false).origin("804515601402516323").done();
    b.aggregate("BLOCK_ACTION", 0xb2a36ad4ddb5366L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f3db375L).optional(true).ordered(true).multiple(false).origin("804515601402516326").done();
    b.alias("Page File");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPageListToImplement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "PageListToImplement", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x339c4c2c735d64ffL);
    b.class_(false, false, true);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/3718931146098959615");
    b.version(2);
    b.aggregate("PAGES", 0x339c4c2c735d6500L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4bfcL).optional(true).ordered(true).multiple(true).origin("3718931146098959616").done();
    b.alias("Page List");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForValidData() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "ValidData", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x5862803877ab78a2L);
    b.class_(false, false, false);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/6368793803069552802");
    b.version(2);
    b.property("DATA", 0x5862803877ab78a3L).type(PrimitiveTypeId.STRING).origin("6368793803069552803").done();
    b.alias("Valid data");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForVerifierElement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "VerifierElement", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4c02L);
    b.class_(false, false, false);
    b.super_("Teasy.structure.DefaultElement", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x61de6d20174a9e7cL);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/804515601402514434");
    b.version(2);
    b.property("TEMPORARY_ELEMENT", 0xb2a36ad4ddb536fL).type(PrimitiveTypeId.BOOLEAN).origin("804515601402516335").done();
    b.property("TEXT_PRESENT_IN_ELEMENT", 0xb2a36ad4ddb5371L).type(PrimitiveTypeId.STRING).origin("804515601402516337").done();
    b.alias("Verifier Element");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForVerifierElementItemList() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "VerifierElementItemList", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f4fb299L);
    b.class_(false, false, false);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/5539851215481844377");
    b.version(2);
    b.associate("VERIFIER_ELEMENT_ITEM", 0x4ce181543f4fb29aL).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4c02L).optional(false).origin("5539851215481844378").done();
    b.alias("Verifier Element item list to references");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForVerifierElementListToImplement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "VerifierElementListToImplement", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x339c4c2c735d6641L);
    b.class_(false, false, true);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/3718931146098959937");
    b.version(2);
    b.aggregate("VERIFIERS", 0x339c4c2c735d6642L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4c02L).optional(true).ordered(true).multiple(true).origin("3718931146098959938").done();
    b.alias("Verifier Element List");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForVerifierElementListToReferences() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "VerifierElementListToReferences", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f4fb298L);
    b.class_(false, false, false);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/5539851215481844376");
    b.version(2);
    b.aggregate("VERIFIER_ELEMENTS_ITEMS", 0x4ce181543f4fb2d9L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f4fb299L).optional(true).ordered(true).multiple(true).origin("5539851215481844441").done();
    b.alias("Verifier element list to references");
    return b.create();
  }
}
