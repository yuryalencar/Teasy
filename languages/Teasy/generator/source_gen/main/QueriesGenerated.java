package main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.impl.query.QueryProviderBase;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import java.util.Map;
import jetbrains.mps.generator.impl.query.SourceNodesQuery;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.impl.query.QueryKey;
import jetbrains.mps.generator.impl.query.QueryKeyImpl;
import java.util.Collection;
import jetbrains.mps.generator.impl.GenerationFailureException;
import jetbrains.mps.util.IterableUtil;
import jetbrains.mps.generator.impl.query.PropertyValueQuery;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SProperty;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.generator.impl.query.IfMacroCondition;
import org.jetbrains.mps.openapi.language.SConcept;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import org.jetbrains.mps.openapi.language.SContainmentLink;

@Generated
public class QueriesGenerated extends QueryProviderBase {
  public QueriesGenerated() {
    super(1);
  }
  public static Object propertyMacro_GetValue_1_0(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.name$tAp1);
  }
  public static Object propertyMacro_GetValue_1_1(final PropertyMacroContext _context) {
    return SPropertyOperations.getEnum(_context.getNode(), PROPS.selector$aYou).getName();
  }
  public static Object propertyMacro_GetValue_1_2(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.selector_value$aYRu);
  }
  public static Object propertyMacro_GetValue_2_0(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.url_root_page$w01Y);
  }
  public static Object propertyMacro_GetValue_2_1(final PropertyMacroContext _context) {
    return SPropertyOperations.getEnum(_context.getNode(), PROPS.browser$vZLw).getName();
  }
  public static Object propertyMacro_GetValue_2_2(final PropertyMacroContext _context) {
    return String.valueOf(SPropertyOperations.getInteger(_context.getNode(), PROPS.time_to_wait$w0dA));
  }
  public static Object propertyMacro_GetValue_2_3(final PropertyMacroContext _context) {
    return String.valueOf(SPropertyOperations.getInteger(_context.getNode(), PROPS.max_test_to_generate$w0fy));
  }
  public static Object propertyMacro_GetValue_3_0(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.url_root_page$w01Y);
  }
  public static Object propertyMacro_GetValue_3_1(final PropertyMacroContext _context) {
    return SPropertyOperations.getEnum(_context.getNode(), PROPS.browser$vZLw).getName();
  }
  public static Object propertyMacro_GetValue_3_2(final PropertyMacroContext _context) {
    return String.valueOf(SPropertyOperations.getInteger(_context.getNode(), PROPS.screen_width$Kg7K));
  }
  public static Object propertyMacro_GetValue_3_3(final PropertyMacroContext _context) {
    return String.valueOf(SPropertyOperations.getInteger(_context.getNode(), PROPS.screen_height$Kgb9));
  }
  public static Object propertyMacro_GetValue_3_4(final PropertyMacroContext _context) {
    return String.valueOf(SPropertyOperations.getInteger(_context.getNode(), PROPS.time_to_wait$w0dA));
  }
  public static Object propertyMacro_GetValue_4_0(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.name$tAp1);
  }
  public static Object propertyMacro_GetValue_4_1(final PropertyMacroContext _context) {
    String componentName = "";
    {
      final SNode clickElement = _context.getNode();
      if (SNodeOperations.isInstanceOf(clickElement, CONCEPTS.ClickElement$i8)) {
        return SPropertyOperations.getString(SLinkOperations.getTarget(clickElement, LINKS.component$hkWY), PROPS.name$tAp1);
      }
    }
    return componentName;
  }
  public static Object propertyMacro_GetValue_4_2(final PropertyMacroContext _context) {
    String componentName = "";
    {
      final SNode inputText = _context.getNode();
      if (SNodeOperations.isInstanceOf(inputText, CONCEPTS.InputText$4u)) {
        return SPropertyOperations.getString(SLinkOperations.getTarget(inputText, LINKS.component$cAh0), PROPS.name$tAp1);
      }
    }
    return componentName;
  }
  public static Object propertyMacro_GetValue_4_3(final PropertyMacroContext _context) {
    String textToInsert = "";
    {
      final SNode inputText = _context.getNode();
      if (SNodeOperations.isInstanceOf(inputText, CONCEPTS.InputText$4u)) {
        return SPropertyOperations.getString(inputText, PROPS.text$cAhY);
      }
    }
    return textToInsert;
  }
  public static Object propertyMacro_GetValue_4_4(final PropertyMacroContext _context) {
    String clear = "True";
    {
      final SNode inputText = _context.getNode();
      if (SNodeOperations.isInstanceOf(inputText, CONCEPTS.InputText$4u)) {
        if (SPropertyOperations.getBoolean(inputText, PROPS.clear$bLam)) {
          return "True";
        }
        return "False";
      }
    }
    return clear;
  }
  public static Object propertyMacro_GetValue_4_5(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.name$tAp1);
  }
  public static boolean ifMacro_Condition_4_0(final IfMacroContext _context) {
    return SNodeOperations.isInstanceOf(_context.getNode(), CONCEPTS.ClickElement$i8);
  }
  public static boolean ifMacro_Condition_4_1(final IfMacroContext _context) {
    return SNodeOperations.isInstanceOf(_context.getNode(), CONCEPTS.InputText$4u);
  }
  public static Iterable<SNode> sourceNodesQuery_1_0(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), LINKS.components$a9k0);
  }
  public static Iterable<SNode> sourceNodesQuery_4_0(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), LINKS.step$40vG);
  }
  public static Iterable<SNode> sourceNodesQuery_4_1(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), LINKS.keyword$40jY);
  }
  private final Map<String, SourceNodesQuery> snsqMethods = new HashMap<String, SourceNodesQuery>();
  {
    int i = 0;
    snsqMethods.put("9061110883749484980", new SNsQ(i++));
    snsqMethods.put("4179187130014246931", new SNsQ(i++));
    snsqMethods.put("4179187130014076254", new SNsQ(i++));
  }
  @NotNull
  @Override
  public SourceNodesQuery getSourceNodesQuery(@NotNull QueryKey identity) {
    final String id = ((QueryKeyImpl) identity).getQueryNodeId().toString();
    if (!(snsqMethods.containsKey(id))) {
      return super.getSourceNodesQuery(identity);
    }
    return snsqMethods.get(id);
  }
  private static class SNsQ implements SourceNodesQuery {
    private final int methodKey;
    public SNsQ(int methodKey) {
      this.methodKey = methodKey;
    }
    @NotNull
    public Collection<SNode> evaluate(@NotNull SourceSubstituteMacroNodesContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_1_0(ctx));
        case 1:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_4_0(ctx));
        case 2:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_4_1(ctx));
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, PropertyValueQuery> pvqMethods = new HashMap<String, PropertyValueQuery>();
  {
    int i = 0;
    pvqMethods.put("9061110883749485840", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "[COMPONENT VALUE]"));
    pvqMethods.put("9061110883749489918", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "[SELECTOR]"));
    pvqMethods.put("9061110883749489351", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "[SELECTOR VALUE]"));
    pvqMethods.put("9061110883749692092", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "[URL TO TEST]"));
    pvqMethods.put("9061110883749692703", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "VALUE TO BROWSER]"));
    pvqMethods.put("9061110883749693588", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "TIME TO WAIT"));
    pvqMethods.put("9061110883749724039", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "[MAX TEST TO GENERATE]"));
    pvqMethods.put("7812698795137470449", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "BASE_URL"));
    pvqMethods.put("7812698795137472872", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "BROWSER"));
    pvqMethods.put("7812698795137456352", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "WIDTH"));
    pvqMethods.put("7812698795137456508", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "HEIGHT"));
    pvqMethods.put("7812698795137326150", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "[TIME]"));
    pvqMethods.put("4179187130014079323", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "KEYWORD NAME"));
    pvqMethods.put("4179187130015170447", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "RADAR_DASHBOARD_GRID"));
    pvqMethods.put("4179187130014728606", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "COMPONENT_NAME"));
    pvqMethods.put("4179187130015020170", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "TEXT_TO INSERT"));
    pvqMethods.put("4179187130015026680", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "CLEAR_FIELD"));
    pvqMethods.put("4179187130014074294", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "page_name"));
  }
  @NotNull
  @Override
  public PropertyValueQuery getPropertyValueQuery(@NotNull QueryKey identity) {
    final String id = identity.getTemplateNode().getNodeId().toString();
    if (!(pvqMethods.containsKey(id))) {
      return super.getPropertyValueQuery(identity);
    }
    return pvqMethods.get(id);
  }
  private static class PVQ extends PropertyValueQuery.Base {
    private final int methodKey;
    /*package*/ PVQ(int methodKey, SProperty property, String templateValue) {
      super(property, templateValue);
      this.methodKey = methodKey;
    }
    @Nullable
    public Object evaluate(@NotNull PropertyMacroContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.propertyMacro_GetValue_1_0(ctx);
        case 1:
          return QueriesGenerated.propertyMacro_GetValue_1_1(ctx);
        case 2:
          return QueriesGenerated.propertyMacro_GetValue_1_2(ctx);
        case 3:
          return QueriesGenerated.propertyMacro_GetValue_2_0(ctx);
        case 4:
          return QueriesGenerated.propertyMacro_GetValue_2_1(ctx);
        case 5:
          return QueriesGenerated.propertyMacro_GetValue_2_2(ctx);
        case 6:
          return QueriesGenerated.propertyMacro_GetValue_2_3(ctx);
        case 7:
          return QueriesGenerated.propertyMacro_GetValue_3_0(ctx);
        case 8:
          return QueriesGenerated.propertyMacro_GetValue_3_1(ctx);
        case 9:
          return QueriesGenerated.propertyMacro_GetValue_3_2(ctx);
        case 10:
          return QueriesGenerated.propertyMacro_GetValue_3_3(ctx);
        case 11:
          return QueriesGenerated.propertyMacro_GetValue_3_4(ctx);
        case 12:
          return QueriesGenerated.propertyMacro_GetValue_4_0(ctx);
        case 13:
          return QueriesGenerated.propertyMacro_GetValue_4_1(ctx);
        case 14:
          return QueriesGenerated.propertyMacro_GetValue_4_2(ctx);
        case 15:
          return QueriesGenerated.propertyMacro_GetValue_4_3(ctx);
        case 16:
          return QueriesGenerated.propertyMacro_GetValue_4_4(ctx);
        case 17:
          return QueriesGenerated.propertyMacro_GetValue_4_5(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, IfMacroCondition> imcMethods = new HashMap<String, IfMacroCondition>();
  {
    int i = 0;
    imcMethods.put("4179187130014248076", new IfMC(i++));
    imcMethods.put("4179187130014251110", new IfMC(i++));
  }
  @NotNull
  @Override
  public IfMacroCondition getIfMacroCondition(@NotNull QueryKey identity) {
    final String id = identity.getTemplateNode().getNodeId().toString();
    if (!(imcMethods.containsKey(id))) {
      return super.getIfMacroCondition(identity);
    }
    return imcMethods.get(id);
  }
  private static class IfMC implements IfMacroCondition {
    private final int methodKey;
    public IfMC(int methodKey) {
      this.methodKey = methodKey;
    }
    @Override
    public boolean check(@NotNull IfMacroContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.ifMacro_Condition_4_0(ctx);
        case 1:
          return QueriesGenerated.ifMacro_Condition_4_1(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no condition method for if macro %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }

  private static final class PROPS {
    /*package*/ static final SProperty name$tAp1 = MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
    /*package*/ static final SProperty selector$aYou = MetaAdapterFactory.getProperty(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x637c9747e118846bL, 0x637c9747e118846eL, "selector");
    /*package*/ static final SProperty selector_value$aYRu = MetaAdapterFactory.getProperty(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x637c9747e118846bL, 0x637c9747e1188484L, "selector_value");
    /*package*/ static final SProperty url_root_page$w01Y = MetaAdapterFactory.getProperty(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x637c9747e115f171L, 0x637c9747e115f17fL, "url_root_page");
    /*package*/ static final SProperty browser$vZLw = MetaAdapterFactory.getProperty(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x637c9747e115f171L, 0x637c9747e115f172L, "browser");
    /*package*/ static final SProperty time_to_wait$w0dA = MetaAdapterFactory.getProperty(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x637c9747e115f171L, 0x637c9747e115f182L, "time_to_wait");
    /*package*/ static final SProperty max_test_to_generate$w0fy = MetaAdapterFactory.getProperty(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x637c9747e115f171L, 0x637c9747e115f186L, "max_test_to_generate");
    /*package*/ static final SProperty screen_width$Kg7K = MetaAdapterFactory.getProperty(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x637c9747e115f171L, 0x6c6c48292536ecb9L, "screen_width");
    /*package*/ static final SProperty screen_height$Kgb9 = MetaAdapterFactory.getProperty(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x637c9747e115f171L, 0x6c6c48292536ecc0L, "screen_height");
    /*package*/ static final SProperty text$cAhY = MetaAdapterFactory.getProperty(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80c7b56fL, 0x29b0fffc80c7b572L, "text");
    /*package*/ static final SProperty clear$bLam = MetaAdapterFactory.getProperty(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80c7b56fL, 0x1afad254c1ec9729L, "clear");
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept ClickElement$i8 = MetaAdapterFactory.getConcept(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x1afad254c1f432adL, "Teasy.structure.ClickElement");
    /*package*/ static final SConcept InputText$4u = MetaAdapterFactory.getConcept(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80c7b56fL, "Teasy.structure.InputText");
  }

  private static final class LINKS {
    /*package*/ static final SReferenceLink component$hkWY = MetaAdapterFactory.getReferenceLink(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x1afad254c1f432adL, 0x1afad254c1f432b0L, "component");
    /*package*/ static final SReferenceLink component$cAh0 = MetaAdapterFactory.getReferenceLink(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80c7b56fL, 0x29b0fffc80c7b570L, "component");
    /*package*/ static final SContainmentLink components$a9k0 = MetaAdapterFactory.getContainmentLink(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x7dbf8857483dd032L, 0x7dbf8857483dd033L, "components");
    /*package*/ static final SContainmentLink step$40vG = MetaAdapterFactory.getContainmentLink(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80bf369dL, 0x29b0fffc80bf36a8L, "step");
    /*package*/ static final SContainmentLink keyword$40jY = MetaAdapterFactory.getContainmentLink(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80bf36a1L, 0x29b0fffc80bf36a4L, "keyword");
  }
}
