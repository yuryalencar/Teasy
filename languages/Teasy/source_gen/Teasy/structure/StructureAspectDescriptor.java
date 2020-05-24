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
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import jetbrains.mps.smodel.adapter.ids.PrimitiveTypeId;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptClickElement = createDescriptorForClickElement();
  /*package*/ final ConceptDescriptor myConceptComponent = createDescriptorForComponent();
  /*package*/ final ConceptDescriptor myConceptComponents = createDescriptorForComponents();
  /*package*/ final ConceptDescriptor myConceptConfiguration = createDescriptorForConfiguration();
  /*package*/ final ConceptDescriptor myConceptExecuteJavascript = createDescriptorForExecuteJavascript();
  /*package*/ final ConceptDescriptor myConceptFlow = createDescriptorForFlow();
  /*package*/ final ConceptDescriptor myConceptFlowItem = createDescriptorForFlowItem();
  /*package*/ final ConceptDescriptor myConceptFlows = createDescriptorForFlows();
  /*package*/ final ConceptDescriptor myConceptInputText = createDescriptorForInputText();
  /*package*/ final ConceptDescriptor myConceptKeyword = createDescriptorForKeyword();
  /*package*/ final ConceptDescriptor myConceptPage = createDescriptorForPage();
  /*package*/ final ConceptDescriptor myConceptPageRegisterConfig = createDescriptorForPageRegisterConfig();
  /*package*/ final ConceptDescriptor myConceptPageShouldContain = createDescriptorForPageShouldContain();
  /*package*/ final ConceptDescriptor myConceptPageShouldContainElement = createDescriptorForPageShouldContainElement();
  /*package*/ final ConceptDescriptor myConceptPageShouldNotContain = createDescriptorForPageShouldNotContain();
  /*package*/ final ConceptDescriptor myConceptPageShouldNotContainElement = createDescriptorForPageShouldNotContainElement();
  /*package*/ final ConceptDescriptor myConceptPageToRegister = createDescriptorForPageToRegister();
  /*package*/ final ConceptDescriptor myConceptStep = createDescriptorForStep();
  /*package*/ final ConceptDescriptor myConceptWaitForCondition = createDescriptorForWaitForCondition();
  /*package*/ final ConceptDescriptor myConceptWaitUntilElementIsEnabled = createDescriptorForWaitUntilElementIsEnabled();
  /*package*/ final ConceptDescriptor myConceptWaitUntilElementIsNotVisible = createDescriptorForWaitUntilElementIsNotVisible();
  /*package*/ final ConceptDescriptor myConceptWaitUntilElementIsVisible = createDescriptorForWaitUntilElementIsVisible();
  /*package*/ final ConceptDescriptor myConceptWaitUntilPageContains = createDescriptorForWaitUntilPageContains();
  /*package*/ final ConceptDescriptor myConceptWaitUntilPageContainsElement = createDescriptorForWaitUntilPageContainsElement();
  /*package*/ final ConceptDescriptor myConceptWaitUntilPageDoesNotContain = createDescriptorForWaitUntilPageDoesNotContain();
  /*package*/ final ConceptDescriptor myConceptWaitUntilPageDoesNotContainElement = createDescriptorForWaitUntilPageDoesNotContainElement();
  /*package*/ final EnumerationDescriptor myEnumerationbrowsers = new EnumerationDescriptor_browsers();
  /*package*/ final EnumerationDescriptor myEnumerationselectors = new EnumerationDescriptor_selectors();
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
    return Arrays.asList(myConceptClickElement, myConceptComponent, myConceptComponents, myConceptConfiguration, myConceptExecuteJavascript, myConceptFlow, myConceptFlowItem, myConceptFlows, myConceptInputText, myConceptKeyword, myConceptPage, myConceptPageRegisterConfig, myConceptPageShouldContain, myConceptPageShouldContainElement, myConceptPageShouldNotContain, myConceptPageShouldNotContainElement, myConceptPageToRegister, myConceptStep, myConceptWaitForCondition, myConceptWaitUntilElementIsEnabled, myConceptWaitUntilElementIsNotVisible, myConceptWaitUntilElementIsVisible, myConceptWaitUntilPageContains, myConceptWaitUntilPageContainsElement, myConceptWaitUntilPageDoesNotContain, myConceptWaitUntilPageDoesNotContainElement);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myIndexSwitch.index(id)) {
      case LanguageConceptSwitch.ClickElement:
        return myConceptClickElement;
      case LanguageConceptSwitch.Component:
        return myConceptComponent;
      case LanguageConceptSwitch.Components:
        return myConceptComponents;
      case LanguageConceptSwitch.Configuration:
        return myConceptConfiguration;
      case LanguageConceptSwitch.ExecuteJavascript:
        return myConceptExecuteJavascript;
      case LanguageConceptSwitch.Flow:
        return myConceptFlow;
      case LanguageConceptSwitch.FlowItem:
        return myConceptFlowItem;
      case LanguageConceptSwitch.Flows:
        return myConceptFlows;
      case LanguageConceptSwitch.InputText:
        return myConceptInputText;
      case LanguageConceptSwitch.Keyword:
        return myConceptKeyword;
      case LanguageConceptSwitch.Page:
        return myConceptPage;
      case LanguageConceptSwitch.PageRegisterConfig:
        return myConceptPageRegisterConfig;
      case LanguageConceptSwitch.PageShouldContain:
        return myConceptPageShouldContain;
      case LanguageConceptSwitch.PageShouldContainElement:
        return myConceptPageShouldContainElement;
      case LanguageConceptSwitch.PageShouldNotContain:
        return myConceptPageShouldNotContain;
      case LanguageConceptSwitch.PageShouldNotContainElement:
        return myConceptPageShouldNotContainElement;
      case LanguageConceptSwitch.PageToRegister:
        return myConceptPageToRegister;
      case LanguageConceptSwitch.Step:
        return myConceptStep;
      case LanguageConceptSwitch.WaitForCondition:
        return myConceptWaitForCondition;
      case LanguageConceptSwitch.WaitUntilElementIsEnabled:
        return myConceptWaitUntilElementIsEnabled;
      case LanguageConceptSwitch.WaitUntilElementIsNotVisible:
        return myConceptWaitUntilElementIsNotVisible;
      case LanguageConceptSwitch.WaitUntilElementIsVisible:
        return myConceptWaitUntilElementIsVisible;
      case LanguageConceptSwitch.WaitUntilPageContains:
        return myConceptWaitUntilPageContains;
      case LanguageConceptSwitch.WaitUntilPageContainsElement:
        return myConceptWaitUntilPageContainsElement;
      case LanguageConceptSwitch.WaitUntilPageDoesNotContain:
        return myConceptWaitUntilPageDoesNotContain;
      case LanguageConceptSwitch.WaitUntilPageDoesNotContainElement:
        return myConceptWaitUntilPageDoesNotContainElement;
      default:
        return null;
    }
  }

  @Override
  public Collection<DataTypeDescriptor> getDataTypeDescriptors() {
    return Arrays.asList(myEnumerationbrowsers, myEnumerationselectors);
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myIndexSwitch.index(c);
  }

  private static ConceptDescriptor createDescriptorForClickElement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "ClickElement", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x1afad254c1f432adL);
    b.class_(false, false, false);
    b.super_("Teasy.structure.Step", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80bf36a0L);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/1944097450636882605");
    b.version(2);
    b.associate("component", 0x1afad254c1f432b0L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x637c9747e118846bL).optional(false).origin("1944097450636882608").done();
    b.alias("Click Element");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForComponent() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "Component", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x637c9747e118846bL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/7168771041841939563");
    b.version(2);
    b.property("selector", 0x637c9747e118846eL).type(MetaIdFactory.dataTypeId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x637c9747e1188470L)).origin("7168771041841939566").done();
    b.property("selector_value", 0x637c9747e1188484L).type(PrimitiveTypeId.STRING).origin("7168771041841939588").done();
    b.alias("Component");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForComponents() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "Components", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x7dbf8857483dd032L);
    b.class_(false, false, true);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/9061110883748270130");
    b.version(2);
    b.aggregate("components", 0x7dbf8857483dd033L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x637c9747e118846bL).optional(true).ordered(true).multiple(true).origin("9061110883748270131").done();
    b.alias("Components");
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
    b.property("screen_width", 0x6c6c48292536ecb9L).type(PrimitiveTypeId.INTEGER).origin("7812698795136183481").done();
    b.property("screen_height", 0x6c6c48292536ecc0L).type(PrimitiveTypeId.INTEGER).origin("7812698795136183488").done();
    b.alias("Configuration");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForExecuteJavascript() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "ExecuteJavascript", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x1afad254c1f432fbL);
    b.class_(false, false, false);
    b.super_("Teasy.structure.Step", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80bf36a0L);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/1944097450636882683");
    b.version(2);
    b.property("function", 0x1afad254c1f432fcL).type(PrimitiveTypeId.STRING).origin("1944097450636882684").done();
    b.alias("Execute JavaScript");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForFlow() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "Flow", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4326e26a2123e15dL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/4838803795106586973");
    b.version(2);
    b.aggregate("flow_item", 0x4326e26a2123e162L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4326e26a2123e121L).optional(false).ordered(true).multiple(true).origin("4838803795106586978").done();
    b.alias("Flow");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForFlowItem() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "FlowItem", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4326e26a2123e121L);
    b.class_(false, false, false);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/4838803795106586913");
    b.version(2);
    b.associate("action", 0x4326e26a2123e128L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80bf369dL).optional(false).origin("4838803795106586920").done();
    b.alias("Action To Execute");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForFlows() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "Flows", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4326e26a2135e169L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/4838803795107766633");
    b.version(2);
    b.aggregate("flow", 0x4326e26a2135e16aL).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4326e26a2123e15dL).optional(false).ordered(true).multiple(true).origin("4838803795107766634").done();
    b.alias("Flows");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForInputText() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "InputText", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80c7b56fL);
    b.class_(false, false, false);
    b.super_("Teasy.structure.Step", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80bf36a0L);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/3004182411413534063");
    b.version(2);
    b.property("text", 0x29b0fffc80c7b572L).type(PrimitiveTypeId.STRING).origin("3004182411413534066").done();
    b.property("clear", 0x1afad254c1ec9729L).type(PrimitiveTypeId.BOOLEAN).origin("1944097450636384041").done();
    b.associate("component", 0x29b0fffc80c7b570L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x637c9747e118846bL).optional(false).origin("3004182411413534064").done();
    b.alias("Input Text");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForKeyword() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "Keyword", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80bf369dL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/3004182411412977309");
    b.version(2);
    b.aggregate("step", 0x29b0fffc80bf36a8L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80bf36a0L).optional(false).ordered(true).multiple(true).origin("3004182411412977320").done();
    b.alias("Keyword");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPage() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "Page", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80bf36a1L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/3004182411412977313");
    b.version(2);
    b.aggregate("keyword", 0x29b0fffc80bf36a4L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80bf369dL).optional(false).ordered(true).multiple(true).origin("3004182411412977316").done();
    b.alias("Page");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPageRegisterConfig() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "PageRegisterConfig", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4b2c28ff7a1373d5L);
    b.class_(false, false, true);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/5416749529549730773");
    b.version(2);
    b.aggregate("pages", 0x4b2c28ff7a1373d6L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4b2c28ff7a1373d8L).optional(false).ordered(true).multiple(true).origin("5416749529549730774").done();
    b.alias("PageRegisterConfig");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPageShouldContain() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "PageShouldContain", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x1afad254c1f4341dL);
    b.class_(false, false, false);
    b.super_("Teasy.structure.Step", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80bf36a0L);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/1944097450636882973");
    b.version(2);
    b.property("text", 0x1afad254c1f4341eL).type(PrimitiveTypeId.STRING).origin("1944097450636882974").done();
    b.alias("Page Should Contain");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPageShouldContainElement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "PageShouldContainElement", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x1afad254c1f4345eL);
    b.class_(false, false, false);
    b.super_("Teasy.structure.Step", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80bf36a0L);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/1944097450636883038");
    b.version(2);
    b.associate("component", 0x1afad254c1f4345fL).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x637c9747e118846bL).optional(false).origin("1944097450636883039").done();
    b.alias("Page Should Contain Element");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPageShouldNotContain() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "PageShouldNotContain", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x1afad254c1f434aaL);
    b.class_(false, false, false);
    b.super_("Teasy.structure.Step", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80bf36a0L);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/1944097450636883114");
    b.version(2);
    b.property("text", 0x1afad254c1f434abL).type(PrimitiveTypeId.STRING).origin("1944097450636883115").done();
    b.alias("Page Should Not Contain");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPageShouldNotContainElement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "PageShouldNotContainElement", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x1afad254c1f434acL);
    b.class_(false, false, false);
    b.super_("Teasy.structure.Step", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80bf36a0L);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/1944097450636883116");
    b.version(2);
    b.associate("component", 0x1afad254c1f434adL).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x637c9747e118846bL).optional(false).origin("1944097450636883117").done();
    b.alias("Page Should Not Contain Element");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPageToRegister() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "PageToRegister", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4b2c28ff7a1373d8L);
    b.class_(false, false, false);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/5416749529549730776");
    b.version(2);
    b.associate("page_name", 0x4b2c28ff7a1373daL).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80bf36a1L).optional(true).origin("5416749529549730778").done();
    b.alias("PageRegister");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForStep() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "Step", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80bf36a0L);
    b.class_(false, true, false);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/3004182411412977312");
    b.version(2);
    b.alias("Step");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForWaitForCondition() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "WaitForCondition", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x1afad254c1f4336bL);
    b.class_(false, false, false);
    b.super_("Teasy.structure.Step", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80bf36a0L);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/1944097450636882795");
    b.version(2);
    b.property("condition", 0x1afad254c1f4336cL).type(PrimitiveTypeId.STRING).origin("1944097450636882796").done();
    b.property("timeout", 0x1afad254c1f4336eL).type(PrimitiveTypeId.INTEGER).origin("1944097450636882798").done();
    b.alias("Wait For Condition");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForWaitUntilElementIsEnabled() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "WaitUntilElementIsEnabled", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x1afad254c1f448f8L);
    b.class_(false, false, false);
    b.super_("Teasy.structure.Step", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80bf36a0L);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/1944097450636888312");
    b.version(2);
    b.property("timeout", 0x1afad254c1f4494eL).type(PrimitiveTypeId.INTEGER).origin("1944097450636888398").done();
    b.associate("component", 0x1afad254c1f448f9L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x637c9747e118846bL).optional(true).origin("1944097450636888313").done();
    b.alias("Wait Until Element Is Enabled");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForWaitUntilElementIsNotVisible() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "WaitUntilElementIsNotVisible", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x1afad254c1f4486aL);
    b.class_(false, false, false);
    b.super_("Teasy.structure.Step", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80bf36a0L);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/1944097450636888170");
    b.version(2);
    b.property("timeout", 0x1afad254c1f44950L).type(PrimitiveTypeId.INTEGER).origin("1944097450636888400").done();
    b.associate("component", 0x1afad254c1f4486dL).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x637c9747e118846bL).optional(true).origin("1944097450636888173").done();
    b.alias("Wait Until Element Is Not Visible");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForWaitUntilElementIsVisible() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "WaitUntilElementIsVisible", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x1afad254c1f44869L);
    b.class_(false, false, false);
    b.super_("Teasy.structure.Step", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80bf36a0L);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/1944097450636888169");
    b.version(2);
    b.property("timeout", 0x1afad254c1f44952L).type(PrimitiveTypeId.INTEGER).origin("1944097450636888402").done();
    b.associate("component", 0x1afad254c1f4486bL).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x637c9747e118846bL).optional(true).origin("1944097450636888171").done();
    b.alias("Wait Until Element Is Visible");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForWaitUntilPageContains() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "WaitUntilPageContains", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4f2a0581122bf7e4L);
    b.class_(false, false, false);
    b.super_("Teasy.structure.Step", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80bf36a0L);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/5704377929931945956");
    b.version(2);
    b.property("text", 0x4f2a0581122bf7f7L).type(PrimitiveTypeId.STRING).origin("5704377929931945975").done();
    b.property("timeout", 0x4f2a0581122bf7f9L).type(PrimitiveTypeId.INTEGER).origin("5704377929931945977").done();
    b.alias("Wait Until Page Contains");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForWaitUntilPageContainsElement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "WaitUntilPageContainsElement", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4f2a0581122bf8e8L);
    b.class_(false, false, false);
    b.super_("Teasy.structure.Step", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80bf36a0L);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/5704377929931946216");
    b.version(2);
    b.property("timeout", 0x4f2a0581122bf8eaL).type(PrimitiveTypeId.INTEGER).origin("5704377929931946218").done();
    b.associate("component", 0x4f2a0581122bf8ecL).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x637c9747e118846bL).optional(false).origin("5704377929931946220").done();
    b.alias("Wait Until Page Contains Element");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForWaitUntilPageDoesNotContain() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "WaitUntilPageDoesNotContain", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4f2a0581122bf96dL);
    b.class_(false, false, false);
    b.super_("Teasy.structure.Step", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80bf36a0L);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/5704377929931946349");
    b.version(2);
    b.property("timeout", 0x4f2a0581122bf96fL).type(PrimitiveTypeId.INTEGER).origin("5704377929931946351").done();
    b.property("text", 0x4f2a0581122bf99cL).type(PrimitiveTypeId.STRING).origin("5704377929931946396").done();
    b.alias("Wait Until Page Does Not Contain");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForWaitUntilPageDoesNotContainElement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Teasy", "WaitUntilPageDoesNotContainElement", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4f2a0581122bf99fL);
    b.class_(false, false, false);
    b.super_("Teasy.structure.Step", 0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80bf36a0L);
    b.origin("r:fa4deac7-a8d4-4bef-9b2d-db266658ed18(Teasy.structure)/5704377929931946399");
    b.version(2);
    b.property("timeout", 0x4f2a0581122bf9a1L).type(PrimitiveTypeId.INTEGER).origin("5704377929931946401").done();
    b.associate("component", 0x4f2a0581122bf9a0L).target(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x637c9747e118846bL).optional(false).origin("5704377929931946400").done();
    b.alias("Wait Until Page Does Not Contain Element");
    return b.create();
  }
}
