// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.intelliTtcn3.psi.TtcnTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class TtcnParser implements PsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ACTION_TEXT) {
      r = ActionText(b, 0);
    }
    else if (t == ACTIVATE_OP) {
      r = ActivateOp(b, 0);
    }
    else if (t == ADD_OP) {
      r = AddOp(b, 0);
    }
    else if (t == ADDRESS_DECL) {
      r = AddressDecl(b, 0);
    }
    else if (t == ADDRESS_REF_LIST) {
      r = AddressRefList(b, 0);
    }
    else if (t == ALIVE_OP) {
      r = AliveOp(b, 0);
    }
    else if (t == ALL_COMPS_ALL_PORTS_SPEC) {
      r = AllCompsAllPortsSpec(b, 0);
    }
    else if (t == ALL_CONNECTIONS_SPEC) {
      r = AllConnectionsSpec(b, 0);
    }
    else if (t == ALL_ELEMENTS_FROM) {
      r = AllElementsFrom(b, 0);
    }
    else if (t == ALL_GROUPS_WITH_EXCEPT) {
      r = AllGroupsWithExcept(b, 0);
    }
    else if (t == ALL_OR_SIGNATURE_LIST) {
      r = AllOrSignatureList(b, 0);
    }
    else if (t == ALL_OR_TYPE_LIST) {
      r = AllOrTypeList(b, 0);
    }
    else if (t == ALL_PORTS_SPEC) {
      r = AllPortsSpec(b, 0);
    }
    else if (t == ALL_REF) {
      r = AllRef(b, 0);
    }
    else if (t == ALL_WITH_EXCEPT) {
      r = AllWithExcept(b, 0);
    }
    else if (t == ALL_WITH_EXCEPTS) {
      r = AllWithExcepts(b, 0);
    }
    else if (t == ALLOWED_VALUES_SPEC) {
      r = AllowedValuesSpec(b, 0);
    }
    else if (t == ALT_CONSTRUCT) {
      r = AltConstruct(b, 0);
    }
    else if (t == ALT_GUARD_CHAR) {
      r = AltGuardChar(b, 0);
    }
    else if (t == ALT_GUARD_LIST) {
      r = AltGuardList(b, 0);
    }
    else if (t == ALTSTEP_DEF) {
      r = AltstepDef(b, 0);
    }
    else if (t == ALTSTEP_INSTANCE) {
      r = AltstepInstance(b, 0);
    }
    else if (t == ALTSTEP_LOCAL_DEF) {
      r = AltstepLocalDef(b, 0);
    }
    else if (t == ALTSTEP_LOCAL_DEF_LIST) {
      r = AltstepLocalDefList(b, 0);
    }
    else if (t == ARRAY_CONST_EXPRESSION) {
      r = ArrayConstExpression(b, 0);
    }
    else if (t == ARRAY_DEF) {
      r = ArrayDef(b, 0);
    }
    else if (t == ARRAY_ELEMENT_CONST_EXPRESSION_LIST) {
      r = ArrayElementConstExpressionList(b, 0);
    }
    else if (t == ARRAY_ELEMENT_EXPRESSION_LIST) {
      r = ArrayElementExpressionList(b, 0);
    }
    else if (t == ARRAY_ELEMENT_SPEC) {
      r = ArrayElementSpec(b, 0);
    }
    else if (t == ARRAY_ELEMENT_SPEC_LIST) {
      r = ArrayElementSpecList(b, 0);
    }
    else if (t == ARRAY_EXPRESSION) {
      r = ArrayExpression(b, 0);
    }
    else if (t == ARRAY_IDENTIFIER_REF_ASSIGNMENT) {
      r = ArrayIdentifierRefAssignment(b, 0);
    }
    else if (t == ARRAY_VALUE_OR_ATTRIB) {
      r = ArrayValueOrAttrib(b, 0);
    }
    else if (t == ASSIGNMENT) {
      r = Assignment(b, 0);
    }
    else if (t == ASSIGNMENT_LIST) {
      r = AssignmentList(b, 0);
    }
    else if (t == ATTRIB_KEYWORD) {
      r = AttribKeyword(b, 0);
    }
    else if (t == ATTRIB_QUALIFIER) {
      r = AttribQualifier(b, 0);
    }
    else if (t == BASE_TEMPLATE) {
      r = BaseTemplate(b, 0);
    }
    else if (t == BASIC_STATEMENTS) {
      r = BasicStatements(b, 0);
    }
    else if (t == BEHAVIOUR_STATEMENTS) {
      r = BehaviourStatements(b, 0);
    }
    else if (t == BIN_OR_MATCH) {
      r = BinOrMatch(b, 0);
    }
    else if (t == BIT_STRING_MATCH) {
      r = BitStringMatch(b, 0);
    }
    else if (t == BOOLEAN_VALUE) {
      r = BooleanValue(b, 0);
    }
    else if (t == BOUND) {
      r = Bound(b, 0);
    }
    else if (t == CALL_BODY_GUARD) {
      r = CallBodyGuard(b, 0);
    }
    else if (t == CALL_BODY_OPS) {
      r = CallBodyOps(b, 0);
    }
    else if (t == CALL_BODY_STATEMENT) {
      r = CallBodyStatement(b, 0);
    }
    else if (t == CALL_BODY_STATEMENT_LIST) {
      r = CallBodyStatementList(b, 0);
    }
    else if (t == CALL_PARAMETERS) {
      r = CallParameters(b, 0);
    }
    else if (t == CALL_STATEMENT) {
      r = CallStatement(b, 0);
    }
    else if (t == CALL_TIMER_VALUE) {
      r = CallTimerValue(b, 0);
    }
    else if (t == CATCH_OP_PARAMETER) {
      r = CatchOpParameter(b, 0);
    }
    else if (t == CATCH_STATEMENT) {
      r = CatchStatement(b, 0);
    }
    else if (t == CHAR_KEYWORD) {
      r = CharKeyword(b, 0);
    }
    else if (t == CHAR_STRING_MATCH) {
      r = CharStringMatch(b, 0);
    }
    else if (t == CHAR_STRING_VALUE) {
      r = CharStringValue(b, 0);
    }
    else if (t == CHECK_PARAMETER) {
      r = CheckParameter(b, 0);
    }
    else if (t == CHECK_PORT_OPS_PRESENT) {
      r = CheckPortOpsPresent(b, 0);
    }
    else if (t == CHECK_STATE_STATEMENT) {
      r = CheckStateStatement(b, 0);
    }
    else if (t == CHECK_STATEMENT) {
      r = CheckStatement(b, 0);
    }
    else if (t == CLEAR_STATEMENT) {
      r = ClearStatement(b, 0);
    }
    else if (t == COMMUNICATION_STATEMENTS) {
      r = CommunicationStatements(b, 0);
    }
    else if (t == COMPLEMENT) {
      r = Complement(b, 0);
    }
    else if (t == COMPONENT_DEF) {
      r = ComponentDef(b, 0);
    }
    else if (t == COMPONENT_DEF_LIST) {
      r = ComponentDefList(b, 0);
    }
    else if (t == COMPONENT_ELEMENT_DEF) {
      r = ComponentElementDef(b, 0);
    }
    else if (t == COMPONENT_OR_ANY) {
      r = ComponentOrAny(b, 0);
    }
    else if (t == COMPONENT_OR_DEFAULT_REFERENCE) {
      r = ComponentOrDefaultReference(b, 0);
    }
    else if (t == COMPONENT_REF_ASSIGNMENT) {
      r = ComponentRefAssignment(b, 0);
    }
    else if (t == COMPONENT_REFERENCE_OR_LITERAL) {
      r = ComponentReferenceOrLiteral(b, 0);
    }
    else if (t == COMPOUND_CONST_EXPRESSION) {
      r = CompoundConstExpression(b, 0);
    }
    else if (t == COMPOUND_EXPRESSION) {
      r = CompoundExpression(b, 0);
    }
    else if (t == CONDITIONAL_CONSTRUCT) {
      r = ConditionalConstruct(b, 0);
    }
    else if (t == CONFIG_PARAM_DEF) {
      r = ConfigParamDef(b, 0);
    }
    else if (t == CONFIG_SPEC) {
      r = ConfigSpec(b, 0);
    }
    else if (t == CONFIGURATION_OPS) {
      r = ConfigurationOps(b, 0);
    }
    else if (t == CONNECT_STATEMENT) {
      r = ConnectStatement(b, 0);
    }
    else if (t == CONST_DEF) {
      r = ConstDef(b, 0);
    }
    else if (t == CONSTANT_EXPRESSION) {
      r = ConstantExpression(b, 0);
    }
    else if (t == CONTROL_STATEMENT) {
      r = ControlStatement(b, 0);
    }
    else if (t == CONTROL_STATEMENT_OR_DEF) {
      r = ControlStatementOrDef(b, 0);
    }
    else if (t == CONTROL_STATEMENT_OR_DEF_LIST) {
      r = ControlStatementOrDefList(b, 0);
    }
    else if (t == CREATE_OP) {
      r = CreateOp(b, 0);
    }
    else if (t == DEACTIVATE_STATEMENT) {
      r = DeactivateStatement(b, 0);
    }
    else if (t == DEF_OR_FIELD_REF) {
      r = DefOrFieldRef(b, 0);
    }
    else if (t == DEF_OR_FIELD_REF_LIST) {
      r = DefOrFieldRefList(b, 0);
    }
    else if (t == DERIVED_DEF) {
      r = DerivedDef(b, 0);
    }
    else if (t == DERIVED_REF_WITH_PAR_LIST) {
      r = DerivedRefWithParList(b, 0);
    }
    else if (t == DIRECTION) {
      r = Direction(b, 0);
    }
    else if (t == DISCONNECT_STATEMENT) {
      r = DisconnectStatement(b, 0);
    }
    else if (t == DO_WHILE_STATEMENT) {
      r = DoWhileStatement(b, 0);
    }
    else if (t == DONE_STATEMENT) {
      r = DoneStatement(b, 0);
    }
    else if (t == ELSE_CLAUSE) {
      r = ElseClause(b, 0);
    }
    else if (t == ELSE_IF_CLAUSE) {
      r = ElseIfClause(b, 0);
    }
    else if (t == ELSE_STATEMENT) {
      r = ElseStatement(b, 0);
    }
    else if (t == ENUM_DEF) {
      r = EnumDef(b, 0);
    }
    else if (t == ENUMERATION) {
      r = Enumeration(b, 0);
    }
    else if (t == EQUAL_OP) {
      r = EqualOp(b, 0);
    }
    else if (t == EXCEPT_ALTSTEP_SPEC) {
      r = ExceptAltstepSpec(b, 0);
    }
    else if (t == EXCEPT_CONST_SPEC) {
      r = ExceptConstSpec(b, 0);
    }
    else if (t == EXCEPT_ELEMENT) {
      r = ExceptElement(b, 0);
    }
    else if (t == EXCEPT_FUNCTION_SPEC) {
      r = ExceptFunctionSpec(b, 0);
    }
    else if (t == EXCEPT_GROUP_SPEC) {
      r = ExceptGroupSpec(b, 0);
    }
    else if (t == EXCEPT_MODULE_PAR_SPEC) {
      r = ExceptModuleParSpec(b, 0);
    }
    else if (t == EXCEPT_SIGNATURE_SPEC) {
      r = ExceptSignatureSpec(b, 0);
    }
    else if (t == EXCEPT_SPEC) {
      r = ExceptSpec(b, 0);
    }
    else if (t == EXCEPT_TEMPLATE_SPEC) {
      r = ExceptTemplateSpec(b, 0);
    }
    else if (t == EXCEPT_TESTCASE_SPEC) {
      r = ExceptTestcaseSpec(b, 0);
    }
    else if (t == EXCEPT_TYPE_DEF_SPEC) {
      r = ExceptTypeDefSpec(b, 0);
    }
    else if (t == EXCEPTION_SPEC) {
      r = ExceptionSpec(b, 0);
    }
    else if (t == EXCEPTS_DEF) {
      r = ExceptsDef(b, 0);
    }
    else if (t == EXPONENTIAL) {
      r = Exponential(b, 0);
    }
    else if (t == EXPRESSION) {
      r = Expression(b, 0);
    }
    else if (t == EXT_CONST_DEF) {
      r = ExtConstDef(b, 0);
    }
    else if (t == EXT_FUNCTION_DEF) {
      r = ExtFunctionDef(b, 0);
    }
    else if (t == EXTENDED_FIELD_REFERENCE) {
      r = ExtendedFieldReference(b, 0);
    }
    else if (t == EXTRA_MATCHING_ATTRIBUTES) {
      r = ExtraMatchingAttributes(b, 0);
    }
    else if (t == FIELD_CONST_EXPRESSION_LIST) {
      r = FieldConstExpressionList(b, 0);
    }
    else if (t == FIELD_CONST_EXPRESSION_SPEC) {
      r = FieldConstExpressionSpec(b, 0);
    }
    else if (t == FIELD_EXPRESSION_LIST) {
      r = FieldExpressionList(b, 0);
    }
    else if (t == FIELD_EXPRESSION_SPEC) {
      r = FieldExpressionSpec(b, 0);
    }
    else if (t == FIELD_OR_BIT_NUMBER) {
      r = FieldOrBitNumber(b, 0);
    }
    else if (t == FIELD_REFERENCE) {
      r = FieldReference(b, 0);
    }
    else if (t == FIELD_SPEC) {
      r = FieldSpec(b, 0);
    }
    else if (t == FIELD_SPEC_LIST) {
      r = FieldSpecList(b, 0);
    }
    else if (t == FLOAT_DOT_NOTATION) {
      r = FloatDotNotation(b, 0);
    }
    else if (t == FLOAT_E_NOTATION) {
      r = FloatENotation(b, 0);
    }
    else if (t == FLOAT_VALUE) {
      r = FloatValue(b, 0);
    }
    else if (t == FOR_STATEMENT) {
      r = ForStatement(b, 0);
    }
    else if (t == FREE_TEXT) {
      r = FreeText(b, 0);
    }
    else if (t == FRIEND_MODULE_DEF) {
      r = FriendModuleDef(b, 0);
    }
    else if (t == FROM_CLAUSE) {
      r = FromClause(b, 0);
    }
    else if (t == FROM_CLAUSE_PRESENT) {
      r = FromClausePresent(b, 0);
    }
    else if (t == FUNCTION_DEF) {
      r = FunctionDef(b, 0);
    }
    else if (t == FUNCTION_FORMAL_PAR_LIST) {
      r = FunctionFormalParList(b, 0);
    }
    else if (t == FUNCTION_INSTANCE) {
      r = FunctionInstance(b, 0);
    }
    else if (t == FUNCTION_REF) {
      r = FunctionRef(b, 0);
    }
    else if (t == FUNCTION_STATEMENT) {
      r = FunctionStatement(b, 0);
    }
    else if (t == GET_CALL_STATEMENT) {
      r = GetCallStatement(b, 0);
    }
    else if (t == GET_REPLY_STATEMENT) {
      r = GetReplyStatement(b, 0);
    }
    else if (t == GOTO_STATEMENT) {
      r = GotoStatement(b, 0);
    }
    else if (t == GROUP_DEF) {
      r = GroupDef(b, 0);
    }
    else if (t == GROUP_REF_LIST_WITH_EXCEPT) {
      r = GroupRefListWithExcept(b, 0);
    }
    else if (t == GUARD_OP) {
      r = GuardOp(b, 0);
    }
    else if (t == GUARD_STATEMENT) {
      r = GuardStatement(b, 0);
    }
    else if (t == HALT_STATEMENT) {
      r = HaltStatement(b, 0);
    }
    else if (t == HEX_OR_MATCH) {
      r = HexOrMatch(b, 0);
    }
    else if (t == HEX_STRING_MATCH) {
      r = HexStringMatch(b, 0);
    }
    else if (t == IDENTIFIER_LIST) {
      r = IdentifierList(b, 0);
    }
    else if (t == IDENTIFIER_LIST_OR_ALL) {
      r = IdentifierListOrAll(b, 0);
    }
    else if (t == IDENTIFIER_LIST_OR_ALL_WITH_EXCEPT) {
      r = IdentifierListOrAllWithExcept(b, 0);
    }
    else if (t == IMPORT_ALTSTEP_SPEC) {
      r = ImportAltstepSpec(b, 0);
    }
    else if (t == IMPORT_CONST_SPEC) {
      r = ImportConstSpec(b, 0);
    }
    else if (t == IMPORT_CONTENT) {
      r = ImportContent(b, 0);
    }
    else if (t == IMPORT_DEF) {
      r = ImportDef(b, 0);
    }
    else if (t == IMPORT_ELEMENT) {
      r = ImportElement(b, 0);
    }
    else if (t == IMPORT_FROM_SPEC) {
      r = ImportFromSpec(b, 0);
    }
    else if (t == IMPORT_FUNCTION_SPEC) {
      r = ImportFunctionSpec(b, 0);
    }
    else if (t == IMPORT_GROUP_SPEC) {
      r = ImportGroupSpec(b, 0);
    }
    else if (t == IMPORT_IMPORT_SPEC) {
      r = ImportImportSpec(b, 0);
    }
    else if (t == IMPORT_MODULE_PAR_SPEC) {
      r = ImportModuleParSpec(b, 0);
    }
    else if (t == IMPORT_SIGNATURE_SPEC) {
      r = ImportSignatureSpec(b, 0);
    }
    else if (t == IMPORT_SPEC) {
      r = ImportSpec(b, 0);
    }
    else if (t == IMPORT_SPEC_CONTENT) {
      r = ImportSpecContent(b, 0);
    }
    else if (t == IMPORT_TEMPLATE_SPEC) {
      r = ImportTemplateSpec(b, 0);
    }
    else if (t == IMPORT_TESTCASE_SPEC) {
      r = ImportTestcaseSpec(b, 0);
    }
    else if (t == IMPORT_TYPE_DEF_SPEC) {
      r = ImportTypeDefSpec(b, 0);
    }
    else if (t == INDEX_ASSIGNMENT) {
      r = IndexAssignment(b, 0);
    }
    else if (t == INDEX_SPEC) {
      r = IndexSpec(b, 0);
    }
    else if (t == INITIAL) {
      r = Initial(b, 0);
    }
    else if (t == INTERLEAVED_CONSTRUCT) {
      r = InterleavedConstruct(b, 0);
    }
    else if (t == INTERLEAVED_GUARD) {
      r = InterleavedGuard(b, 0);
    }
    else if (t == INTERLEAVED_GUARD_ELEMENT) {
      r = InterleavedGuardElement(b, 0);
    }
    else if (t == INTERLEAVED_GUARD_LIST) {
      r = InterleavedGuardList(b, 0);
    }
    else if (t == KILL_TC_STATEMENT) {
      r = KillTCStatement(b, 0);
    }
    else if (t == KILLED_STATEMENT) {
      r = KilledStatement(b, 0);
    }
    else if (t == LABEL_STATEMENT) {
      r = LabelStatement(b, 0);
    }
    else if (t == LIST_OF_TEMPLATES) {
      r = ListOfTemplates(b, 0);
    }
    else if (t == LOG_ITEM) {
      r = LogItem(b, 0);
    }
    else if (t == LOG_STATEMENT) {
      r = LogStatement(b, 0);
    }
    else if (t == LOOP_CONSTRUCT) {
      r = LoopConstruct(b, 0);
    }
    else if (t == MAP_PARAM_DEF) {
      r = MapParamDef(b, 0);
    }
    else if (t == MAP_STATEMENT) {
      r = MapStatement(b, 0);
    }
    else if (t == MATCH_OP) {
      r = MatchOp(b, 0);
    }
    else if (t == MATCHING_SYMBOL) {
      r = MatchingSymbol(b, 0);
    }
    else if (t == MESSAGE_ATTRIBS) {
      r = MessageAttribs(b, 0);
    }
    else if (t == MESSAGE_LIST) {
      r = MessageList(b, 0);
    }
    else if (t == MIXED_ATTRIBS) {
      r = MixedAttribs(b, 0);
    }
    else if (t == MIXED_LIST) {
      r = MixedList(b, 0);
    }
    else if (t == MODULE) {
      r = Module(b, 0);
    }
    else if (t == MODULE_CONTROL_BODY) {
      r = ModuleControlBody(b, 0);
    }
    else if (t == MODULE_CONTROL_PART) {
      r = ModuleControlPart(b, 0);
    }
    else if (t == MODULE_DEFINITIONS_LIST) {
      r = ModuleDefinitionsList(b, 0);
    }
    else if (t == MODULE_PAR) {
      r = ModulePar(b, 0);
    }
    else if (t == MODULE_PAR_DEF) {
      r = ModuleParDef(b, 0);
    }
    else if (t == MTC_SPEC) {
      r = MtcSpec(b, 0);
    }
    else if (t == MULTI_WITH_ATTRIB) {
      r = MultiWithAttrib(b, 0);
    }
    else if (t == MULTIPLY_OP) {
      r = MultiplyOp(b, 0);
    }
    else if (t == MULTITYPED_MODULE_PAR_LIST) {
      r = MultitypedModuleParList(b, 0);
    }
    else if (t == NESTED_ENUM_DEF) {
      r = NestedEnumDef(b, 0);
    }
    else if (t == NESTED_RECORD_DEF) {
      r = NestedRecordDef(b, 0);
    }
    else if (t == NESTED_RECORD_OF_DEF) {
      r = NestedRecordOfDef(b, 0);
    }
    else if (t == NESTED_SET_DEF) {
      r = NestedSetDef(b, 0);
    }
    else if (t == NESTED_SET_OF_DEF) {
      r = NestedSetOfDef(b, 0);
    }
    else if (t == NESTED_TYPE_DEF) {
      r = NestedTypeDef(b, 0);
    }
    else if (t == NESTED_UNION_DEF) {
      r = NestedUnionDef(b, 0);
    }
    else if (t == NOT_USED_OR_EXPRESSION) {
      r = NotUsedOrExpression(b, 0);
    }
    else if (t == OCT_OR_MATCH) {
      r = OctOrMatch(b, 0);
    }
    else if (t == OCTET_STRING_MATCH) {
      r = OctetStringMatch(b, 0);
    }
    else if (t == OP_CALL) {
      r = OpCall(b, 0);
    }
    else if (t == PAR_REF) {
      r = ParRef(b, 0);
    }
    else if (t == PARAM_ASSIGNMENT_LIST) {
      r = ParamAssignmentList(b, 0);
    }
    else if (t == PARAM_SPEC) {
      r = ParamSpec(b, 0);
    }
    else if (t == PATTERN) {
      r = Pattern(b, 0);
    }
    else if (t == PATTERN_PARTICLE) {
      r = PatternParticle(b, 0);
    }
    else if (t == PERMUTATION_KEYWORD) {
      r = PermutationKeyword(b, 0);
    }
    else if (t == PERMUTATION_MATCH) {
      r = PermutationMatch(b, 0);
    }
    else if (t == PORT_CALL_BODY) {
      r = PortCallBody(b, 0);
    }
    else if (t == PORT_CALL_OP) {
      r = PortCallOp(b, 0);
    }
    else if (t == PORT_CATCH_OP) {
      r = PortCatchOp(b, 0);
    }
    else if (t == PORT_CHECK_OP) {
      r = PortCheckOp(b, 0);
    }
    else if (t == PORT_DEF) {
      r = PortDef(b, 0);
    }
    else if (t == PORT_ELEMENT) {
      r = PortElement(b, 0);
    }
    else if (t == PORT_GET_CALL_OP) {
      r = PortGetCallOp(b, 0);
    }
    else if (t == PORT_GET_REPLY_OP) {
      r = PortGetReplyOp(b, 0);
    }
    else if (t == PORT_INSTANCE) {
      r = PortInstance(b, 0);
    }
    else if (t == PORT_OR_ALL) {
      r = PortOrAll(b, 0);
    }
    else if (t == PORT_OR_ALL_ANY) {
      r = PortOrAllAny(b, 0);
    }
    else if (t == PORT_OR_ANY) {
      r = PortOrAny(b, 0);
    }
    else if (t == PORT_RAISE_OP) {
      r = PortRaiseOp(b, 0);
    }
    else if (t == PORT_RECEIVE_OP) {
      r = PortReceiveOp(b, 0);
    }
    else if (t == PORT_REDIRECT) {
      r = PortRedirect(b, 0);
    }
    else if (t == PORT_REDIRECT_WITH_PARAM) {
      r = PortRedirectWithParam(b, 0);
    }
    else if (t == PORT_REDIRECT_WITH_VALUE_AND_PARAM) {
      r = PortRedirectWithValueAndParam(b, 0);
    }
    else if (t == PORT_REPLY_OP) {
      r = PortReplyOp(b, 0);
    }
    else if (t == PORT_SEND_OP) {
      r = PortSendOp(b, 0);
    }
    else if (t == PORT_TRIGGER_OP) {
      r = PortTriggerOp(b, 0);
    }
    else if (t == PREDEFINED_VALUE) {
      r = PredefinedValue(b, 0);
    }
    else if (t == PRIMARY) {
      r = Primary(b, 0);
    }
    else if (t == PROC_OR_TYPE) {
      r = ProcOrType(b, 0);
    }
    else if (t == PROC_OR_TYPE_LIST) {
      r = ProcOrTypeList(b, 0);
    }
    else if (t == PROCEDURE_ATTRIBS) {
      r = ProcedureAttribs(b, 0);
    }
    else if (t == PROCEDURE_LIST) {
      r = ProcedureList(b, 0);
    }
    else if (t == QUADRUPLE) {
      r = Quadruple(b, 0);
    }
    else if (t == QUALIFIED_IDENTIFIER) {
      r = QualifiedIdentifier(b, 0);
    }
    else if (t == QUALIFIED_IDENTIFIER_LIST) {
      r = QualifiedIdentifierList(b, 0);
    }
    else if (t == QUALIFIED_IDENTIFIER_WITH_EXCEPT) {
      r = QualifiedIdentifierWithExcept(b, 0);
    }
    else if (t == RAISE_STATEMENT) {
      r = RaiseStatement(b, 0);
    }
    else if (t == RANGE) {
      r = Range(b, 0);
    }
    else if (t == RANGE_DEF) {
      r = RangeDef(b, 0);
    }
    else if (t == READ_TIMER_OP) {
      r = ReadTimerOp(b, 0);
    }
    else if (t == RECEIVE_STATEMENT) {
      r = ReceiveStatement(b, 0);
    }
    else if (t == RECORD_DEF) {
      r = RecordDef(b, 0);
    }
    else if (t == RECORD_OF_DEF) {
      r = RecordOfDef(b, 0);
    }
    else if (t == REDIRECT_PRESENT) {
      r = RedirectPresent(b, 0);
    }
    else if (t == REDIRECT_WITH_PARAM_SPEC) {
      r = RedirectWithParamSpec(b, 0);
    }
    else if (t == REDIRECT_WITH_VALUE_AND_PARAM_SPEC) {
      r = RedirectWithValueAndParamSpec(b, 0);
    }
    else if (t == REFERENCED_VALUE) {
      r = ReferencedValue(b, 0);
    }
    else if (t == REL_OP) {
      r = RelOp(b, 0);
    }
    else if (t == REPLY_STATEMENT) {
      r = ReplyStatement(b, 0);
    }
    else if (t == REPLY_VALUE) {
      r = ReplyValue(b, 0);
    }
    else if (t == RETURN_STATEMENT) {
      r = ReturnStatement(b, 0);
    }
    else if (t == RETURN_TYPE) {
      r = ReturnType(b, 0);
    }
    else if (t == RUNNING_OP) {
      r = RunningOp(b, 0);
    }
    else if (t == RUNNING_TIMER_OP) {
      r = RunningTimerOp(b, 0);
    }
    else if (t == RUNS_ON_SPEC) {
      r = RunsOnSpec(b, 0);
    }
    else if (t == SUT_STATEMENTS) {
      r = SUTStatements(b, 0);
    }
    else if (t == SELECT_CASE) {
      r = SelectCase(b, 0);
    }
    else if (t == SELECT_CASE_BODY) {
      r = SelectCaseBody(b, 0);
    }
    else if (t == SELECT_CASE_CONSTRUCT) {
      r = SelectCaseConstruct(b, 0);
    }
    else if (t == SEND_STATEMENT) {
      r = SendStatement(b, 0);
    }
    else if (t == SENDER_SPEC) {
      r = SenderSpec(b, 0);
    }
    else if (t == SET_DEF) {
      r = SetDef(b, 0);
    }
    else if (t == SET_LOCAL_VERDICT) {
      r = SetLocalVerdict(b, 0);
    }
    else if (t == SET_OF_DEF) {
      r = SetOfDef(b, 0);
    }
    else if (t == SHIFT_OP) {
      r = ShiftOp(b, 0);
    }
    else if (t == SIGNATURE) {
      r = Signature(b, 0);
    }
    else if (t == SIGNATURE_DEF) {
      r = SignatureDef(b, 0);
    }
    else if (t == SIGNATURE_FORMAL_PAR_LIST) {
      r = SignatureFormalParList(b, 0);
    }
    else if (t == SIGNATURE_LIST) {
      r = SignatureList(b, 0);
    }
    else if (t == SIMPLE_SPEC) {
      r = SimpleSpec(b, 0);
    }
    else if (t == SIMPLE_TEMPLATE_SPEC) {
      r = SimpleTemplateSpec(b, 0);
    }
    else if (t == SINGLE_CONST_DEF) {
      r = SingleConstDef(b, 0);
    }
    else if (t == SINGLE_EXPRESSION) {
      r = SingleExpression(b, 0);
    }
    else if (t == SINGLE_TEMP_VAR_INSTANCE) {
      r = SingleTempVarInstance(b, 0);
    }
    else if (t == SINGLE_TEMPLATE_EXPRESSION) {
      r = SingleTemplateExpression(b, 0);
    }
    else if (t == SINGLE_VALUE_SPEC) {
      r = SingleValueSpec(b, 0);
    }
    else if (t == SINGLE_VAR_INSTANCE) {
      r = SingleVarInstance(b, 0);
    }
    else if (t == SINGLE_WITH_ATTRIB) {
      r = SingleWithAttrib(b, 0);
    }
    else if (t == START_STATEMENT) {
      r = StartStatement(b, 0);
    }
    else if (t == START_TC_STATEMENT) {
      r = StartTCStatement(b, 0);
    }
    else if (t == START_TIMER_STATEMENT) {
      r = StartTimerStatement(b, 0);
    }
    else if (t == STATEMENT_BLOCK) {
      r = StatementBlock(b, 0);
    }
    else if (t == STOP_STATEMENT) {
      r = StopStatement(b, 0);
    }
    else if (t == STOP_TC_STATEMENT) {
      r = StopTCStatement(b, 0);
    }
    else if (t == STOP_TIMER_STATEMENT) {
      r = StopTimerStatement(b, 0);
    }
    else if (t == STRUCT_FIELD_REF) {
      r = StructFieldRef(b, 0);
    }
    else if (t == SUB_TYPE_SPEC) {
      r = SubTypeSpec(b, 0);
    }
    else if (t == SUBSET_MATCH) {
      r = SubsetMatch(b, 0);
    }
    else if (t == SUPERSET_MATCH) {
      r = SupersetMatch(b, 0);
    }
    else if (t == SYSTEM_SPEC) {
      r = SystemSpec(b, 0);
    }
    else if (t == TEMP_VAR_LIST) {
      r = TempVarList(b, 0);
    }
    else if (t == TEMPLATE_ACTUAL_PAR_LIST) {
      r = TemplateActualParList(b, 0);
    }
    else if (t == TEMPLATE_BODY) {
      r = TemplateBody(b, 0);
    }
    else if (t == TEMPLATE_DEF) {
      r = TemplateDef(b, 0);
    }
    else if (t == TEMPLATE_INSTANCE_ACTUAL_PAR) {
      r = TemplateInstanceActualPar(b, 0);
    }
    else if (t == TEMPLATE_INSTANCE_ASSIGNMENT) {
      r = TemplateInstanceAssignment(b, 0);
    }
    else if (t == TEMPLATE_LIST) {
      r = TemplateList(b, 0);
    }
    else if (t == TEMPLATE_LIST_ITEM) {
      r = TemplateListItem(b, 0);
    }
    else if (t == TEMPLATE_OPS) {
      r = TemplateOps(b, 0);
    }
    else if (t == TEMPLATE_OR_RANGE) {
      r = TemplateOrRange(b, 0);
    }
    else if (t == TEMPLATE_REF_WITH_PAR_LIST) {
      r = TemplateRefWithParList(b, 0);
    }
    else if (t == TESTCASE_ACTUAL_PAR_LIST) {
      r = TestcaseActualParList(b, 0);
    }
    else if (t == TESTCASE_DEF) {
      r = TestcaseDef(b, 0);
    }
    else if (t == TESTCASE_INSTANCE) {
      r = TestcaseInstance(b, 0);
    }
    else if (t == TESTCASE_OPERATION) {
      r = TestcaseOperation(b, 0);
    }
    else if (t == TIMEOUT_STATEMENT) {
      r = TimeoutStatement(b, 0);
    }
    else if (t == TIMER_INSTANCE) {
      r = TimerInstance(b, 0);
    }
    else if (t == TIMER_OPS) {
      r = TimerOps(b, 0);
    }
    else if (t == TIMER_REF_OR_ALL) {
      r = TimerRefOrAll(b, 0);
    }
    else if (t == TIMER_REF_OR_ANY) {
      r = TimerRefOrAny(b, 0);
    }
    else if (t == TIMER_STATEMENTS) {
      r = TimerStatements(b, 0);
    }
    else if (t == TO_CLAUSE) {
      r = ToClause(b, 0);
    }
    else if (t == TRIGGER_STATEMENT) {
      r = TriggerStatement(b, 0);
    }
    else if (t == TYPE) {
      r = Type(b, 0);
    }
    else if (t == TYPE_DEF) {
      r = TypeDef(b, 0);
    }
    else if (t == TYPE_LIST) {
      r = TypeList(b, 0);
    }
    else if (t == TYPE_REFERENCE) {
      r = TypeReference(b, 0);
    }
    else if (t == UNARY_OP) {
      r = UnaryOp(b, 0);
    }
    else if (t == UNION_DEF) {
      r = UnionDef(b, 0);
    }
    else if (t == UNMAP_PARAM_DEF) {
      r = UnmapParamDef(b, 0);
    }
    else if (t == UNMAP_STATEMENT) {
      r = UnmapStatement(b, 0);
    }
    else if (t == VALUE) {
      r = Value(b, 0);
    }
    else if (t == VALUE_MATCH_SPEC) {
      r = ValueMatchSpec(b, 0);
    }
    else if (t == VALUE_SPEC) {
      r = ValueSpec(b, 0);
    }
    else if (t == VALUEOF_OP) {
      r = ValueofOp(b, 0);
    }
    else if (t == VAR_INSTANCE) {
      r = VarInstance(b, 0);
    }
    else if (t == VAR_LIST) {
      r = VarList(b, 0);
    }
    else if (t == VARIABLE_ASSIGNMENT) {
      r = VariableAssignment(b, 0);
    }
    else if (t == VARIABLE_ENTRY) {
      r = VariableEntry(b, 0);
    }
    else if (t == VARIABLE_LIST) {
      r = VariableList(b, 0);
    }
    else if (t == VARIABLE_REF) {
      r = VariableRef(b, 0);
    }
    else if (t == VERDICT_TYPE_VALUE) {
      r = VerdictTypeValue(b, 0);
    }
    else if (t == WHILE_STATEMENT) {
      r = WhileStatement(b, 0);
    }
    else if (t == WILDCARD_LENGTH_MATCH) {
      r = WildcardLengthMatch(b, 0);
    }
    else if (t == WITH_STATEMENT) {
      r = WithStatement(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // FreeText | Expression
  public static boolean ActionText(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ActionText")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<action text>");
    r = FreeText(b, l + 1);
    if (!r) r = Expression(b, l + 1);
    exit_section_(b, l, m, ACTION_TEXT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_ACTIVTE TTCN_LP AltstepInstance TTCN_RP
  public static boolean ActivateOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ActivateOp")) return false;
    if (!nextTokenIs(b, TTCN_ACTIVTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_ACTIVTE, TTCN_LP);
    r = r && AltstepInstance(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, ACTIVATE_OP, r);
    return r;
  }

  /* ********************************************************** */
  // MulExpression ( AddOp MulExpression )*
  static boolean AddExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MulExpression(b, l + 1);
    r = r && AddExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( AddOp MulExpression )*
  private static boolean AddExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddExpression_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AddExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AddExpression_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // AddOp MulExpression
  private static boolean AddExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AddOp(b, l + 1);
    r = r && MulExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_ADD | TTCN_SUB | TTCN_CONNECT
  public static boolean AddOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<add op>");
    r = consumeToken(b, TTCN_ADD);
    if (!r) r = consumeToken(b, TTCN_SUB);
    if (!r) r = consumeToken(b, TTCN_CONNECT);
    exit_section_(b, l, m, ADD_OP, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AddressKeyword Type
  public static boolean AddressDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddressDecl")) return false;
    if (!nextTokenIs(b, TTCN_ADDRESS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AddressKeyword(b, l + 1);
    r = r && Type(b, l + 1);
    exit_section_(b, m, ADDRESS_DECL, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_ADDRESS
  static boolean AddressKeyword(PsiBuilder b, int l) {
    return consumeToken(b, TTCN_ADDRESS);
  }

  /* ********************************************************** */
  // TTCN_LP InLineTemplate ( TTCN_COMMA InLineTemplate )* TTCN_RP
  public static boolean AddressRefList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddressRefList")) return false;
    if (!nextTokenIs(b, TTCN_LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LP);
    r = r && InLineTemplate(b, l + 1);
    r = r && AddressRefList_2(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, ADDRESS_REF_LIST, r);
    return r;
  }

  // ( TTCN_COMMA InLineTemplate )*
  private static boolean AddressRefList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddressRefList_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AddressRefList_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AddressRefList_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA InLineTemplate
  private static boolean AddressRefList_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddressRefList_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && InLineTemplate(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_NULL
  static boolean AddressValue(PsiBuilder b, int l) {
    return consumeToken(b, TTCN_NULL);
  }

  /* ********************************************************** */
  // ComponentOrAny TTCN_DOT TTCN_ALIVE IndexAssignment?
  public static boolean AliveOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliveOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<alive op>");
    r = ComponentOrAny(b, l + 1);
    r = r && consumeTokens(b, 0, TTCN_DOT, TTCN_ALIVE);
    r = r && AliveOp_3(b, l + 1);
    exit_section_(b, l, m, ALIVE_OP, r, false, null);
    return r;
  }

  // IndexAssignment?
  private static boolean AliveOp_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliveOp_3")) return false;
    IndexAssignment(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TTCN_LP TTCN_ALL TTCN_COMPONENT TTCN_COLON TTCN_ALL TTCN_PORT TTCN_RP
  public static boolean AllCompsAllPortsSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllCompsAllPortsSpec")) return false;
    if (!nextTokenIs(b, TTCN_LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_LP, TTCN_ALL, TTCN_COMPONENT, TTCN_COLON, TTCN_ALL, TTCN_PORT, TTCN_RP);
    exit_section_(b, m, ALL_COMPS_ALL_PORTS_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_LP PortRef TTCN_RP
  public static boolean AllConnectionsSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllConnectionsSpec")) return false;
    if (!nextTokenIs(b, TTCN_LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LP);
    r = r && PortRef(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, ALL_CONNECTIONS_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_ALL TTCN_FROM TemplateBody
  public static boolean AllElementsFrom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllElementsFrom")) return false;
    if (!nextTokenIs(b, TTCN_ALL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_ALL, TTCN_FROM);
    r = r && TemplateBody(b, l + 1);
    exit_section_(b, m, ALL_ELEMENTS_FROM, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_ALL (TTCN_EXCEPT QualifiedIdentifierList)?
  public static boolean AllGroupsWithExcept(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllGroupsWithExcept")) return false;
    if (!nextTokenIs(b, TTCN_ALL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_ALL);
    r = r && AllGroupsWithExcept_1(b, l + 1);
    exit_section_(b, m, ALL_GROUPS_WITH_EXCEPT, r);
    return r;
  }

  // (TTCN_EXCEPT QualifiedIdentifierList)?
  private static boolean AllGroupsWithExcept_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllGroupsWithExcept_1")) return false;
    AllGroupsWithExcept_1_0(b, l + 1);
    return true;
  }

  // TTCN_EXCEPT QualifiedIdentifierList
  private static boolean AllGroupsWithExcept_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllGroupsWithExcept_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_EXCEPT);
    r = r && QualifiedIdentifierList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_ALL | SignatureList
  public static boolean AllOrSignatureList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllOrSignatureList")) return false;
    if (!nextTokenIs(b, "<all or signature list>", TTCN_ALL, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<all or signature list>");
    r = consumeToken(b, TTCN_ALL);
    if (!r) r = SignatureList(b, l + 1);
    exit_section_(b, l, m, ALL_OR_SIGNATURE_LIST, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_ALL | TypeList
  public static boolean AllOrTypeList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllOrTypeList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<all or type list>");
    r = consumeToken(b, TTCN_ALL);
    if (!r) r = TypeList(b, l + 1);
    exit_section_(b, l, m, ALL_OR_TYPE_LIST, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_LP ComponentRef TTCN_COLON TTCN_ALL TTCN_PORT TTCN_RP
  public static boolean AllPortsSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllPortsSpec")) return false;
    if (!nextTokenIs(b, TTCN_LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LP);
    r = r && ComponentRef(b, l + 1);
    r = r && consumeTokens(b, 0, TTCN_COLON, TTCN_ALL, TTCN_PORT, TTCN_RP);
    exit_section_(b, m, ALL_PORTS_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // ( TTCN_GROUP TTCN_ALL (TTCN_EXCEPT TTCN_LB QualifiedIdentifierList TTCN_RB )? ) | ( ( TTCN_TYPE | TTCN_TEMPLATE | TTCN_CONST | TTCN_ALTSTEP | TTCN_TESTCASE | TTCN_FUNCTIOIN | TTCN_SIGNATURE | TTCN_MODULEPAR ) TTCN_ALL (TTCN_EXCEPT TTCN_LB IdentifierList TTCN_RB)? )
  public static boolean AllRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllRef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<all ref>");
    r = AllRef_0(b, l + 1);
    if (!r) r = AllRef_1(b, l + 1);
    exit_section_(b, l, m, ALL_REF, r, false, null);
    return r;
  }

  // TTCN_GROUP TTCN_ALL (TTCN_EXCEPT TTCN_LB QualifiedIdentifierList TTCN_RB )?
  private static boolean AllRef_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllRef_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_GROUP, TTCN_ALL);
    r = r && AllRef_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TTCN_EXCEPT TTCN_LB QualifiedIdentifierList TTCN_RB )?
  private static boolean AllRef_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllRef_0_2")) return false;
    AllRef_0_2_0(b, l + 1);
    return true;
  }

  // TTCN_EXCEPT TTCN_LB QualifiedIdentifierList TTCN_RB
  private static boolean AllRef_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllRef_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_EXCEPT, TTCN_LB);
    r = r && QualifiedIdentifierList(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_TYPE | TTCN_TEMPLATE | TTCN_CONST | TTCN_ALTSTEP | TTCN_TESTCASE | TTCN_FUNCTIOIN | TTCN_SIGNATURE | TTCN_MODULEPAR ) TTCN_ALL (TTCN_EXCEPT TTCN_LB IdentifierList TTCN_RB)?
  private static boolean AllRef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllRef_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AllRef_1_0(b, l + 1);
    r = r && consumeToken(b, TTCN_ALL);
    r = r && AllRef_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_TYPE | TTCN_TEMPLATE | TTCN_CONST | TTCN_ALTSTEP | TTCN_TESTCASE | TTCN_FUNCTIOIN | TTCN_SIGNATURE | TTCN_MODULEPAR
  private static boolean AllRef_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllRef_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_TYPE);
    if (!r) r = consumeToken(b, TTCN_TEMPLATE);
    if (!r) r = consumeToken(b, TTCN_CONST);
    if (!r) r = consumeToken(b, TTCN_ALTSTEP);
    if (!r) r = consumeToken(b, TTCN_TESTCASE);
    if (!r) r = consumeToken(b, TTCN_FUNCTIOIN);
    if (!r) r = consumeToken(b, TTCN_SIGNATURE);
    if (!r) r = consumeToken(b, TTCN_MODULEPAR);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TTCN_EXCEPT TTCN_LB IdentifierList TTCN_RB)?
  private static boolean AllRef_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllRef_1_2")) return false;
    AllRef_1_2_0(b, l + 1);
    return true;
  }

  // TTCN_EXCEPT TTCN_LB IdentifierList TTCN_RB
  private static boolean AllRef_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllRef_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_EXCEPT, TTCN_LB);
    r = r && IdentifierList(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_ALL (TTCN_EXCEPT IdentifierList)?
  public static boolean AllWithExcept(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllWithExcept")) return false;
    if (!nextTokenIs(b, TTCN_ALL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_ALL);
    r = r && AllWithExcept_1(b, l + 1);
    exit_section_(b, m, ALL_WITH_EXCEPT, r);
    return r;
  }

  // (TTCN_EXCEPT IdentifierList)?
  private static boolean AllWithExcept_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllWithExcept_1")) return false;
    AllWithExcept_1_0(b, l + 1);
    return true;
  }

  // TTCN_EXCEPT IdentifierList
  private static boolean AllWithExcept_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllWithExcept_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_EXCEPT);
    r = r && IdentifierList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_ALL ExceptsDef?
  public static boolean AllWithExcepts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllWithExcepts")) return false;
    if (!nextTokenIs(b, TTCN_ALL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_ALL);
    r = r && AllWithExcepts_1(b, l + 1);
    exit_section_(b, m, ALL_WITH_EXCEPTS, r);
    return r;
  }

  // ExceptsDef?
  private static boolean AllWithExcepts_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllWithExcepts_1")) return false;
    ExceptsDef(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TTCN_LP ( ( TemplateOrRange ( TTCN_COMMA TemplateOrRange )* ) | CharStringMatch ) TTCN_RP
  public static boolean AllowedValuesSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllowedValuesSpec")) return false;
    if (!nextTokenIs(b, TTCN_LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LP);
    r = r && AllowedValuesSpec_1(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, ALLOWED_VALUES_SPEC, r);
    return r;
  }

  // ( TemplateOrRange ( TTCN_COMMA TemplateOrRange )* ) | CharStringMatch
  private static boolean AllowedValuesSpec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllowedValuesSpec_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AllowedValuesSpec_1_0(b, l + 1);
    if (!r) r = CharStringMatch(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TemplateOrRange ( TTCN_COMMA TemplateOrRange )*
  private static boolean AllowedValuesSpec_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllowedValuesSpec_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateOrRange(b, l + 1);
    r = r && AllowedValuesSpec_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_COMMA TemplateOrRange )*
  private static boolean AllowedValuesSpec_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllowedValuesSpec_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AllowedValuesSpec_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AllowedValuesSpec_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA TemplateOrRange
  private static boolean AllowedValuesSpec_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AllowedValuesSpec_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && TemplateOrRange(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_ALT TTCN_LB AltGuardList* TTCN_RB
  public static boolean AltConstruct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltConstruct")) return false;
    if (!nextTokenIs(b, TTCN_ALT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_ALT, TTCN_LB);
    r = r && AltConstruct_2(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, ALT_CONSTRUCT, r);
    return r;
  }

  // AltGuardList*
  private static boolean AltConstruct_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltConstruct_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AltGuardList(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AltConstruct_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // TTCN_LM [ BooleanExpression ] TTCN_RM
  public static boolean AltGuardChar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltGuardChar")) return false;
    if (!nextTokenIs(b, TTCN_LM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LM);
    r = r && AltGuardChar_1(b, l + 1);
    r = r && consumeToken(b, TTCN_RM);
    exit_section_(b, m, ALT_GUARD_CHAR, r);
    return r;
  }

  // [ BooleanExpression ]
  private static boolean AltGuardChar_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltGuardChar_1")) return false;
    BooleanExpression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // GuardStatement | ElseStatement TTCN_SEMI?
  public static boolean AltGuardList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltGuardList")) return false;
    if (!nextTokenIs(b, TTCN_LM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GuardStatement(b, l + 1);
    if (!r) r = AltGuardList_1(b, l + 1);
    exit_section_(b, m, ALT_GUARD_LIST, r);
    return r;
  }

  // ElseStatement TTCN_SEMI?
  private static boolean AltGuardList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltGuardList_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ElseStatement(b, l + 1);
    r = r && AltGuardList_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_SEMI?
  private static boolean AltGuardList_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltGuardList_1_1")) return false;
    consumeToken(b, TTCN_SEMI);
    return true;
  }

  /* ********************************************************** */
  // TTCN_ALTSTEP Identifier TTCN_LP FunctionFormalParList? TTCN_RP RunsOnSpec? MtcSpec? SystemSpec? TTCN_LB AltstepLocalDefList* AltGuardList* TTCN_RB
  public static boolean AltstepDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltstepDef")) return false;
    if (!nextTokenIs(b, TTCN_ALTSTEP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_ALTSTEP);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, TTCN_LP);
    r = r && AltstepDef_3(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    r = r && AltstepDef_5(b, l + 1);
    r = r && AltstepDef_6(b, l + 1);
    r = r && AltstepDef_7(b, l + 1);
    r = r && consumeToken(b, TTCN_LB);
    r = r && AltstepDef_9(b, l + 1);
    r = r && AltstepDef_10(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, ALTSTEP_DEF, r);
    return r;
  }

  // FunctionFormalParList?
  private static boolean AltstepDef_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltstepDef_3")) return false;
    FunctionFormalParList(b, l + 1);
    return true;
  }

  // RunsOnSpec?
  private static boolean AltstepDef_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltstepDef_5")) return false;
    RunsOnSpec(b, l + 1);
    return true;
  }

  // MtcSpec?
  private static boolean AltstepDef_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltstepDef_6")) return false;
    MtcSpec(b, l + 1);
    return true;
  }

  // SystemSpec?
  private static boolean AltstepDef_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltstepDef_7")) return false;
    SystemSpec(b, l + 1);
    return true;
  }

  // AltstepLocalDefList*
  private static boolean AltstepDef_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltstepDef_9")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AltstepLocalDefList(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AltstepDef_9", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // AltGuardList*
  private static boolean AltstepDef_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltstepDef_10")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AltGuardList(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AltstepDef_10", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // ExtendedIdentifier TTCN_LP FunctionActualParList? TTCN_RP
  public static boolean AltstepInstance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltstepInstance")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExtendedIdentifier(b, l + 1);
    r = r && consumeToken(b, TTCN_LP);
    r = r && AltstepInstance_2(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, ALTSTEP_INSTANCE, r);
    return r;
  }

  // FunctionActualParList?
  private static boolean AltstepInstance_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltstepInstance_2")) return false;
    FunctionActualParList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // VarInstance | TimerInstance | ConstDef | TemplateDef
  public static boolean AltstepLocalDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltstepLocalDef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<altstep local def>");
    r = VarInstance(b, l + 1);
    if (!r) r = TimerInstance(b, l + 1);
    if (!r) r = ConstDef(b, l + 1);
    if (!r) r = TemplateDef(b, l + 1);
    exit_section_(b, l, m, ALTSTEP_LOCAL_DEF, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AltstepLocalDef WithStatement? TTCN_SEMI?
  public static boolean AltstepLocalDefList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltstepLocalDefList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<altstep local def list>");
    r = AltstepLocalDef(b, l + 1);
    r = r && AltstepLocalDefList_1(b, l + 1);
    r = r && AltstepLocalDefList_2(b, l + 1);
    exit_section_(b, l, m, ALTSTEP_LOCAL_DEF_LIST, r, false, null);
    return r;
  }

  // WithStatement?
  private static boolean AltstepLocalDefList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltstepLocalDefList_1")) return false;
    WithStatement(b, l + 1);
    return true;
  }

  // TTCN_SEMI?
  private static boolean AltstepLocalDefList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AltstepLocalDefList_2")) return false;
    consumeToken(b, TTCN_SEMI);
    return true;
  }

  /* ********************************************************** */
  // NotExpression ( TTCN_AND NotExpression )*
  static boolean AndExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AndExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NotExpression(b, l + 1);
    r = r && AndExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_AND NotExpression )*
  private static boolean AndExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AndExpression_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AndExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AndExpression_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_AND NotExpression
  private static boolean AndExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AndExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_AND);
    r = r && NotExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_ANYTYPE
  static boolean AnyTypeKeyword(PsiBuilder b, int l) {
    return consumeToken(b, TTCN_ANYTYPE);
  }

  /* ********************************************************** */
  // TTCN_LB ArrayElementConstExpressionList? TTCN_RB
  public static boolean ArrayConstExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayConstExpression")) return false;
    if (!nextTokenIs(b, TTCN_LB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LB);
    r = r && ArrayConstExpression_1(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, ARRAY_CONST_EXPRESSION, r);
    return r;
  }

  // ArrayElementConstExpressionList?
  private static boolean ArrayConstExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayConstExpression_1")) return false;
    ArrayElementConstExpressionList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ( TTCN_LM SingleExpression ( TTCN_POINT_CONNECT SingleExpression )? TTCN_RM )+
  public static boolean ArrayDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayDef")) return false;
    if (!nextTokenIs(b, TTCN_LM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArrayDef_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!ArrayDef_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ArrayDef", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, ARRAY_DEF, r);
    return r;
  }

  // TTCN_LM SingleExpression ( TTCN_POINT_CONNECT SingleExpression )? TTCN_RM
  private static boolean ArrayDef_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayDef_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LM);
    r = r && SingleExpression(b, l + 1);
    r = r && ArrayDef_0_2(b, l + 1);
    r = r && consumeToken(b, TTCN_RM);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_POINT_CONNECT SingleExpression )?
  private static boolean ArrayDef_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayDef_0_2")) return false;
    ArrayDef_0_2_0(b, l + 1);
    return true;
  }

  // TTCN_POINT_CONNECT SingleExpression
  private static boolean ArrayDef_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayDef_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_POINT_CONNECT);
    r = r && SingleExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ConstantExpression (TTCN_COMMA ConstantExpression)*
  public static boolean ArrayElementConstExpressionList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayElementConstExpressionList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<array element const expression list>");
    r = ConstantExpression(b, l + 1);
    r = r && ArrayElementConstExpressionList_1(b, l + 1);
    exit_section_(b, l, m, ARRAY_ELEMENT_CONST_EXPRESSION_LIST, r, false, null);
    return r;
  }

  // (TTCN_COMMA ConstantExpression)*
  private static boolean ArrayElementConstExpressionList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayElementConstExpressionList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ArrayElementConstExpressionList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ArrayElementConstExpressionList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA ConstantExpression
  private static boolean ArrayElementConstExpressionList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayElementConstExpressionList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && ConstantExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NotUsedOrExpression (TTCN_COMMA NotUsedOrExpression)*
  public static boolean ArrayElementExpressionList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayElementExpressionList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<array element expression list>");
    r = NotUsedOrExpression(b, l + 1);
    r = r && ArrayElementExpressionList_1(b, l + 1);
    exit_section_(b, l, m, ARRAY_ELEMENT_EXPRESSION_LIST, r, false, null);
    return r;
  }

  // (TTCN_COMMA NotUsedOrExpression)*
  private static boolean ArrayElementExpressionList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayElementExpressionList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ArrayElementExpressionList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ArrayElementExpressionList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA NotUsedOrExpression
  private static boolean ArrayElementExpressionList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayElementExpressionList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && NotUsedOrExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_SUB | PermutationMatch | TemplateBody
  public static boolean ArrayElementSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayElementSpec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<array element spec>");
    r = consumeToken(b, TTCN_SUB);
    if (!r) r = PermutationMatch(b, l + 1);
    if (!r) r = TemplateBody(b, l + 1);
    exit_section_(b, l, m, ARRAY_ELEMENT_SPEC, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ArrayElementSpec ( TTCN_COMMA ArrayElementSpec )*
  public static boolean ArrayElementSpecList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayElementSpecList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<array element spec list>");
    r = ArrayElementSpec(b, l + 1);
    r = r && ArrayElementSpecList_1(b, l + 1);
    exit_section_(b, l, m, ARRAY_ELEMENT_SPEC_LIST, r, false, null);
    return r;
  }

  // ( TTCN_COMMA ArrayElementSpec )*
  private static boolean ArrayElementSpecList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayElementSpecList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ArrayElementSpecList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ArrayElementSpecList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA ArrayElementSpec
  private static boolean ArrayElementSpecList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayElementSpecList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && ArrayElementSpec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_LB ArrayElementExpressionList? TTCN_RB
  public static boolean ArrayExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayExpression")) return false;
    if (!nextTokenIs(b, TTCN_LB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LB);
    r = r && ArrayExpression_1(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, ARRAY_EXPRESSION, r);
    return r;
  }

  // ArrayElementExpressionList?
  private static boolean ArrayExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayExpression_1")) return false;
    ArrayElementExpressionList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Identifier ArrayOrBitRef*
  static boolean ArrayIdentifierRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayIdentifierRef")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && ArrayIdentifierRef_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ArrayOrBitRef*
  private static boolean ArrayIdentifierRef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayIdentifierRef_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ArrayOrBitRef(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ArrayIdentifierRef_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // Identifier TTCN_ASSIGN ArrayIdentifierRef
  public static boolean ArrayIdentifierRefAssignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayIdentifierRefAssignment")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, TTCN_ASSIGN);
    r = r && ArrayIdentifierRef(b, l + 1);
    exit_section_(b, m, ARRAY_IDENTIFIER_REF_ASSIGNMENT, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_LM FieldOrBitNumber TTCN_RM
  static boolean ArrayOrBitRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayOrBitRef")) return false;
    if (!nextTokenIs(b, TTCN_LM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LM);
    r = r && FieldOrBitNumber(b, l + 1);
    r = r && consumeToken(b, TTCN_RM);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_LB ArrayElementSpecList? TTCN_RB
  public static boolean ArrayValueOrAttrib(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayValueOrAttrib")) return false;
    if (!nextTokenIs(b, TTCN_LB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LB);
    r = r && ArrayValueOrAttrib_1(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, ARRAY_VALUE_OR_ATTRIB, r);
    return r;
  }

  // ArrayElementSpecList?
  private static boolean ArrayValueOrAttrib_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayValueOrAttrib_1")) return false;
    ArrayElementSpecList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // VariableRef TTCN_ASSIGN ( Expression | TemplateBody )
  public static boolean Assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Assignment")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableRef(b, l + 1);
    r = r && consumeToken(b, TTCN_ASSIGN);
    r = r && Assignment_2(b, l + 1);
    exit_section_(b, m, ASSIGNMENT, r);
    return r;
  }

  // Expression | TemplateBody
  private static boolean Assignment_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Assignment_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    if (!r) r = TemplateBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VariableAssignment ( TTCN_COMMA VariableAssignment)*
  public static boolean AssignmentList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentList")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableAssignment(b, l + 1);
    r = r && AssignmentList_1(b, l + 1);
    exit_section_(b, m, ASSIGNMENT_LIST, r);
    return r;
  }

  // ( TTCN_COMMA VariableAssignment)*
  private static boolean AssignmentList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!AssignmentList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AssignmentList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA VariableAssignment
  private static boolean AssignmentList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && VariableAssignment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_ENCODE | TTCN_VARIANT | TTCN_DISPLAY | TTCN_EXTENSION | TTCN_OPTIONAL
  public static boolean AttribKeyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttribKeyword")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<attrib keyword>");
    r = consumeToken(b, TTCN_ENCODE);
    if (!r) r = consumeToken(b, TTCN_VARIANT);
    if (!r) r = consumeToken(b, TTCN_DISPLAY);
    if (!r) r = consumeToken(b, TTCN_EXTENSION);
    if (!r) r = consumeToken(b, TTCN_OPTIONAL);
    exit_section_(b, l, m, ATTRIB_KEYWORD, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_LP DefOrFieldRefList TTCN_RP
  public static boolean AttribQualifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttribQualifier")) return false;
    if (!nextTokenIs(b, TTCN_LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LP);
    r = r && DefOrFieldRefList(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, ATTRIB_QUALIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // ( Type | Signature ) Identifier (TTCN_LP TemplateOrValueFormalParList TTCN_RP)?
  public static boolean BaseTemplate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BaseTemplate")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<base template>");
    r = BaseTemplate_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && BaseTemplate_2(b, l + 1);
    exit_section_(b, l, m, BASE_TEMPLATE, r, false, null);
    return r;
  }

  // Type | Signature
  private static boolean BaseTemplate_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BaseTemplate_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Type(b, l + 1);
    if (!r) r = Signature(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TTCN_LP TemplateOrValueFormalParList TTCN_RP)?
  private static boolean BaseTemplate_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BaseTemplate_2")) return false;
    BaseTemplate_2_0(b, l + 1);
    return true;
  }

  // TTCN_LP TemplateOrValueFormalParList TTCN_RP
  private static boolean BaseTemplate_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BaseTemplate_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LP);
    r = r && TemplateOrValueFormalParList(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Assignment | LogStatement | LoopConstruct | ConditionalConstruct | SelectCaseConstruct | StatementBlock
  public static boolean BasicStatements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BasicStatements")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<basic statements>");
    r = Assignment(b, l + 1);
    if (!r) r = LogStatement(b, l + 1);
    if (!r) r = LoopConstruct(b, l + 1);
    if (!r) r = ConditionalConstruct(b, l + 1);
    if (!r) r = SelectCaseConstruct(b, l + 1);
    if (!r) r = StatementBlock(b, l + 1);
    exit_section_(b, l, m, BASIC_STATEMENTS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TestcaseInstance | FunctionInstance | ReturnStatement | AltConstruct | InterleavedConstruct | LabelStatement | GotoStatement | TTCN_REPEAT | DeactivateStatement | AltstepInstance | ActivateOp | TTCN_BREAK | TTCN_CONTINUE
  public static boolean BehaviourStatements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BehaviourStatements")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<behaviour statements>");
    r = TestcaseInstance(b, l + 1);
    if (!r) r = FunctionInstance(b, l + 1);
    if (!r) r = ReturnStatement(b, l + 1);
    if (!r) r = AltConstruct(b, l + 1);
    if (!r) r = InterleavedConstruct(b, l + 1);
    if (!r) r = LabelStatement(b, l + 1);
    if (!r) r = GotoStatement(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_REPEAT);
    if (!r) r = DeactivateStatement(b, l + 1);
    if (!r) r = AltstepInstance(b, l + 1);
    if (!r) r = ActivateOp(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_BREAK);
    if (!r) r = consumeToken(b, TTCN_CONTINUE);
    exit_section_(b, l, m, BEHAVIOUR_STATEMENTS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_BIN
  static boolean Bin(PsiBuilder b, int l) {
    return consumeToken(b, TTCN_BIN);
  }

  /* ********************************************************** */
  // Bin | TTCN_QUESTION | TTCN_MUL
  public static boolean BinOrMatch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinOrMatch")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<bin or match>");
    r = Bin(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_QUESTION);
    if (!r) r = consumeToken(b, TTCN_MUL);
    exit_section_(b, l, m, BIN_OR_MATCH, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BitNotExpression ( TTCN_AND4B BitNotExpression )*
  static boolean BitAndExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitAndExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BitNotExpression(b, l + 1);
    r = r && BitAndExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_AND4B BitNotExpression )*
  private static boolean BitAndExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitAndExpression_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!BitAndExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BitAndExpression_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_AND4B BitNotExpression
  private static boolean BitAndExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitAndExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_AND4B);
    r = r && BitNotExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_NOT4B? AddExpression
  static boolean BitNotExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitNotExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BitNotExpression_0(b, l + 1);
    r = r && AddExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_NOT4B?
  private static boolean BitNotExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitNotExpression_0")) return false;
    consumeToken(b, TTCN_NOT4B);
    return true;
  }

  /* ********************************************************** */
  // BitXorExpression ( TTCN_OR4B BitXorExpression ) *
  static boolean BitOrExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitOrExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BitXorExpression(b, l + 1);
    r = r && BitOrExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_OR4B BitXorExpression ) *
  private static boolean BitOrExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitOrExpression_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!BitOrExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BitOrExpression_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_OR4B BitXorExpression
  private static boolean BitOrExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitOrExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_OR4B);
    r = r && BitXorExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_BITSTRING
  static boolean BitStringKeyword(PsiBuilder b, int l) {
    return consumeToken(b, TTCN_BITSTRING);
  }

  /* ********************************************************** */
  // "'" BinOrMatch* "'" "B"
  public static boolean BitStringMatch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitStringMatch")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<bit string match>");
    r = consumeToken(b, "'");
    r = r && BitStringMatch_1(b, l + 1);
    r = r && consumeToken(b, "'");
    r = r && consumeToken(b, "B");
    exit_section_(b, l, m, BIT_STRING_MATCH, r, false, null);
    return r;
  }

  // BinOrMatch*
  private static boolean BitStringMatch_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitStringMatch_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!BinOrMatch(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BitStringMatch_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // BitAndExpression ( TTCN_XOR4B BitAndExpression )*
  static boolean BitXorExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitXorExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BitAndExpression(b, l + 1);
    r = r && BitXorExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_XOR4B BitAndExpression )*
  private static boolean BitXorExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitXorExpression_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!BitXorExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BitXorExpression_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_XOR4B BitAndExpression
  private static boolean BitXorExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitXorExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_XOR4B);
    r = r && BitAndExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SingleExpression
  static boolean BooleanExpression(PsiBuilder b, int l) {
    return SingleExpression(b, l + 1);
  }

  /* ********************************************************** */
  // TTCN_BOOL
  static boolean BooleanKeyword(PsiBuilder b, int l) {
    return consumeToken(b, TTCN_BOOL);
  }

  /* ********************************************************** */
  // TTCN_TRUE | TTCN_FALSE
  public static boolean BooleanValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanValue")) return false;
    if (!nextTokenIs(b, "<boolean value>", TTCN_FALSE, TTCN_TRUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<boolean value>");
    r = consumeToken(b, TTCN_TRUE);
    if (!r) r = consumeToken(b, TTCN_FALSE);
    exit_section_(b, l, m, BOOLEAN_VALUE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( (TTCN_EXCL)? SingleExpression ) | ( TTCN_SUB? TTCN_INFINITY )
  public static boolean Bound(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Bound")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<bound>");
    r = Bound_0(b, l + 1);
    if (!r) r = Bound_1(b, l + 1);
    exit_section_(b, l, m, BOUND, r, false, null);
    return r;
  }

  // (TTCN_EXCL)? SingleExpression
  private static boolean Bound_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Bound_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Bound_0_0(b, l + 1);
    r = r && SingleExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TTCN_EXCL)?
  private static boolean Bound_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Bound_0_0")) return false;
    consumeToken(b, TTCN_EXCL);
    return true;
  }

  // TTCN_SUB? TTCN_INFINITY
  private static boolean Bound_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Bound_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Bound_1_0(b, l + 1);
    r = r && consumeToken(b, TTCN_INFINITY);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_SUB?
  private static boolean Bound_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Bound_1_0")) return false;
    consumeToken(b, TTCN_SUB);
    return true;
  }

  /* ********************************************************** */
  // TTCN_BSTRING
  static boolean Bstring(PsiBuilder b, int l) {
    return consumeToken(b, TTCN_BSTRING);
  }

  /* ********************************************************** */
  // AltGuardChar CallBodyOps
  public static boolean CallBodyGuard(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallBodyGuard")) return false;
    if (!nextTokenIs(b, TTCN_LM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AltGuardChar(b, l + 1);
    r = r && CallBodyOps(b, l + 1);
    exit_section_(b, m, CALL_BODY_GUARD, r);
    return r;
  }

  /* ********************************************************** */
  // GetReplyStatement | CatchStatement
  public static boolean CallBodyOps(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallBodyOps")) return false;
    if (!nextTokenIs(b, "<call body ops>", TTCN_ANY, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<call body ops>");
    r = GetReplyStatement(b, l + 1);
    if (!r) r = CatchStatement(b, l + 1);
    exit_section_(b, l, m, CALL_BODY_OPS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CallBodyGuard StatementBlock
  public static boolean CallBodyStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallBodyStatement")) return false;
    if (!nextTokenIs(b, TTCN_LM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CallBodyGuard(b, l + 1);
    r = r && StatementBlock(b, l + 1);
    exit_section_(b, m, CALL_BODY_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // (CallBodyStatement TTCN_SEMI?)+
  public static boolean CallBodyStatementList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallBodyStatementList")) return false;
    if (!nextTokenIs(b, TTCN_LM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CallBodyStatementList_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!CallBodyStatementList_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CallBodyStatementList", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, CALL_BODY_STATEMENT_LIST, r);
    return r;
  }

  // CallBodyStatement TTCN_SEMI?
  private static boolean CallBodyStatementList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallBodyStatementList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CallBodyStatement(b, l + 1);
    r = r && CallBodyStatementList_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_SEMI?
  private static boolean CallBodyStatementList_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallBodyStatementList_0_1")) return false;
    consumeToken(b, TTCN_SEMI);
    return true;
  }

  /* ********************************************************** */
  // InLineTemplate (TTCN_COMMA CallTimerValue)?
  public static boolean CallParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallParameters")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<call parameters>");
    r = InLineTemplate(b, l + 1);
    r = r && CallParameters_1(b, l + 1);
    exit_section_(b, l, m, CALL_PARAMETERS, r, false, null);
    return r;
  }

  // (TTCN_COMMA CallTimerValue)?
  private static boolean CallParameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallParameters_1")) return false;
    CallParameters_1_0(b, l + 1);
    return true;
  }

  // TTCN_COMMA CallTimerValue
  private static boolean CallParameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallParameters_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && CallTimerValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ArrayIdentifierRef TTCN_DOT PortCallOp PortCallBody?
  public static boolean CallStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArrayIdentifierRef(b, l + 1);
    r = r && consumeToken(b, TTCN_DOT);
    r = r && PortCallOp(b, l + 1);
    r = r && CallStatement_3(b, l + 1);
    exit_section_(b, m, CALL_STATEMENT, r);
    return r;
  }

  // PortCallBody?
  private static boolean CallStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement_3")) return false;
    PortCallBody(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Expression | TTCN_NOWAIT
  public static boolean CallTimerValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallTimerValue")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<call timer value>");
    r = Expression(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_NOWAIT);
    exit_section_(b, l, m, CALL_TIMER_VALUE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Signature TTCN_COMMA InLineTemplate | TTCN_TIMEOUT
  public static boolean CatchOpParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CatchOpParameter")) return false;
    if (!nextTokenIs(b, "<catch op parameter>", TTCN_ID, TTCN_TIMEOUT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<catch op parameter>");
    r = CatchOpParameter_0(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_TIMEOUT);
    exit_section_(b, l, m, CATCH_OP_PARAMETER, r, false, null);
    return r;
  }

  // Signature TTCN_COMMA InLineTemplate
  private static boolean CatchOpParameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CatchOpParameter_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Signature(b, l + 1);
    r = r && consumeToken(b, TTCN_COMMA);
    r = r && InLineTemplate(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PortOrAny TTCN_DOT PortCatchOp
  public static boolean CatchStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CatchStatement")) return false;
    if (!nextTokenIs(b, "<catch statement>", TTCN_ANY, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<catch statement>");
    r = PortOrAny(b, l + 1);
    r = r && consumeToken(b, TTCN_DOT);
    r = r && PortCatchOp(b, l + 1);
    exit_section_(b, l, m, CATCH_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_CHAR
  public static boolean CharKeyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CharKeyword")) return false;
    if (!nextTokenIs(b, TTCN_CHAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_CHAR);
    exit_section_(b, m, CHAR_KEYWORD, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_CHARSTRING
  static boolean CharStringKeyword(PsiBuilder b, int l) {
    return consumeToken(b, TTCN_CHARSTRING);
  }

  /* ********************************************************** */
  // TTCN_PATTERN PatternParticle ( TTCN_CONNECT PatternParticle)*
  public static boolean CharStringMatch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CharStringMatch")) return false;
    if (!nextTokenIs(b, TTCN_PATTERN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_PATTERN);
    r = r && PatternParticle(b, l + 1);
    r = r && CharStringMatch_2(b, l + 1);
    exit_section_(b, m, CHAR_STRING_MATCH, r);
    return r;
  }

  // ( TTCN_CONNECT PatternParticle)*
  private static boolean CharStringMatch_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CharStringMatch_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!CharStringMatch_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CharStringMatch_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_CONNECT PatternParticle
  private static boolean CharStringMatch_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CharStringMatch_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_CONNECT);
    r = r && PatternParticle(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Cstring | Quadruple
  public static boolean CharStringValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CharStringValue")) return false;
    if (!nextTokenIs(b, "<char string value>", TTCN_CHAR, TTCN_STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<char string value>");
    r = Cstring(b, l + 1);
    if (!r) r = Quadruple(b, l + 1);
    exit_section_(b, l, m, CHAR_STRING_VALUE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CheckPortOpsPresent | FromClausePresent | RedirectPresent
  public static boolean CheckParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CheckParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<check parameter>");
    r = CheckPortOpsPresent(b, l + 1);
    if (!r) r = FromClausePresent(b, l + 1);
    if (!r) r = RedirectPresent(b, l + 1);
    exit_section_(b, l, m, CHECK_PARAMETER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PortReceiveOp | PortGetCallOp | PortGetReplyOp | PortCatchOp
  public static boolean CheckPortOpsPresent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CheckPortOpsPresent")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<check port ops present>");
    r = PortReceiveOp(b, l + 1);
    if (!r) r = PortGetCallOp(b, l + 1);
    if (!r) r = PortGetReplyOp(b, l + 1);
    if (!r) r = PortCatchOp(b, l + 1);
    exit_section_(b, l, m, CHECK_PORT_OPS_PRESENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PortOrAllAny TTCN_DOT TTCN_CHECKSTATE TTCN_LP SingleExpression TTCN_RP
  public static boolean CheckStateStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CheckStateStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<check state statement>");
    r = PortOrAllAny(b, l + 1);
    r = r && consumeTokens(b, 0, TTCN_DOT, TTCN_CHECKSTATE, TTCN_LP);
    r = r && SingleExpression(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, l, m, CHECK_STATE_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PortOrAny TTCN_DOT PortCheckOp
  public static boolean CheckStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CheckStatement")) return false;
    if (!nextTokenIs(b, "<check statement>", TTCN_ANY, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<check statement>");
    r = PortOrAny(b, l + 1);
    r = r && consumeToken(b, TTCN_DOT);
    r = r && PortCheckOp(b, l + 1);
    exit_section_(b, l, m, CHECK_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PortOrAll TTCN_DOT TTCN_CLEAR
  public static boolean ClearStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClearStatement")) return false;
    if (!nextTokenIs(b, "<clear statement>", TTCN_ALL, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<clear statement>");
    r = PortOrAll(b, l + 1);
    r = r && consumeTokens(b, 0, TTCN_DOT, TTCN_CLEAR);
    exit_section_(b, l, m, CLEAR_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SendStatement | CallStatement | ReplyStatement | RaiseStatement | ReceiveStatement | TriggerStatement | GetCallStatement | GetReplyStatement | CatchStatement | CheckStatement | ClearStatement | StartStatement | StopStatement | HaltStatement | CheckStateStatement
  public static boolean CommunicationStatements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommunicationStatements")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<communication statements>");
    r = SendStatement(b, l + 1);
    if (!r) r = CallStatement(b, l + 1);
    if (!r) r = ReplyStatement(b, l + 1);
    if (!r) r = RaiseStatement(b, l + 1);
    if (!r) r = ReceiveStatement(b, l + 1);
    if (!r) r = TriggerStatement(b, l + 1);
    if (!r) r = GetCallStatement(b, l + 1);
    if (!r) r = GetReplyStatement(b, l + 1);
    if (!r) r = CatchStatement(b, l + 1);
    if (!r) r = CheckStatement(b, l + 1);
    if (!r) r = ClearStatement(b, l + 1);
    if (!r) r = StartStatement(b, l + 1);
    if (!r) r = StopStatement(b, l + 1);
    if (!r) r = HaltStatement(b, l + 1);
    if (!r) r = CheckStateStatement(b, l + 1);
    exit_section_(b, l, m, COMMUNICATION_STATEMENTS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_COMPLEMENT ListOfTemplates
  public static boolean Complement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Complement")) return false;
    if (!nextTokenIs(b, TTCN_COMPLEMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMPLEMENT);
    r = r && ListOfTemplates(b, l + 1);
    exit_section_(b, m, COMPLEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_COMPONENT Identifier (TTCN_EXTENDS ComponentType ( TTCN_COMMA ComponentType )* )? TTCN_LB ComponentDefList* TTCN_RB
  public static boolean ComponentDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComponentDef")) return false;
    if (!nextTokenIs(b, TTCN_COMPONENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMPONENT);
    r = r && Identifier(b, l + 1);
    r = r && ComponentDef_2(b, l + 1);
    r = r && consumeToken(b, TTCN_LB);
    r = r && ComponentDef_4(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, COMPONENT_DEF, r);
    return r;
  }

  // (TTCN_EXTENDS ComponentType ( TTCN_COMMA ComponentType )* )?
  private static boolean ComponentDef_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComponentDef_2")) return false;
    ComponentDef_2_0(b, l + 1);
    return true;
  }

  // TTCN_EXTENDS ComponentType ( TTCN_COMMA ComponentType )*
  private static boolean ComponentDef_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComponentDef_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_EXTENDS);
    r = r && ComponentType(b, l + 1);
    r = r && ComponentDef_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_COMMA ComponentType )*
  private static boolean ComponentDef_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComponentDef_2_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ComponentDef_2_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ComponentDef_2_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA ComponentType
  private static boolean ComponentDef_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComponentDef_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && ComponentType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ComponentDefList*
  private static boolean ComponentDef_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComponentDef_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ComponentDefList(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ComponentDef_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // ComponentElementDef WithStatement? TTCN_SEMI?
  public static boolean ComponentDefList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComponentDefList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<component def list>");
    r = ComponentElementDef(b, l + 1);
    r = r && ComponentDefList_1(b, l + 1);
    r = r && ComponentDefList_2(b, l + 1);
    exit_section_(b, l, m, COMPONENT_DEF_LIST, r, false, null);
    return r;
  }

  // WithStatement?
  private static boolean ComponentDefList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComponentDefList_1")) return false;
    WithStatement(b, l + 1);
    return true;
  }

  // TTCN_SEMI?
  private static boolean ComponentDefList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComponentDefList_2")) return false;
    consumeToken(b, TTCN_SEMI);
    return true;
  }

  /* ********************************************************** */
  // PortInstance | VarInstance | TimerInstance | ConstDef | TemplateDef
  public static boolean ComponentElementDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComponentElementDef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<component element def>");
    r = PortInstance(b, l + 1);
    if (!r) r = VarInstance(b, l + 1);
    if (!r) r = TimerInstance(b, l + 1);
    if (!r) r = ConstDef(b, l + 1);
    if (!r) r = TemplateDef(b, l + 1);
    exit_section_(b, l, m, COMPONENT_ELEMENT_DEF, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ComponentOrDefaultReference | ( TTCN_ANY ( TTCN_COMPONENT | TTCN_FROM VariableRef ) ) | ( TTCN_ALL TTCN_COMPONENT )
  public static boolean ComponentOrAny(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComponentOrAny")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<component or any>");
    r = ComponentOrDefaultReference(b, l + 1);
    if (!r) r = ComponentOrAny_1(b, l + 1);
    if (!r) r = ComponentOrAny_2(b, l + 1);
    exit_section_(b, l, m, COMPONENT_OR_ANY, r, false, null);
    return r;
  }

  // TTCN_ANY ( TTCN_COMPONENT | TTCN_FROM VariableRef )
  private static boolean ComponentOrAny_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComponentOrAny_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_ANY);
    r = r && ComponentOrAny_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_COMPONENT | TTCN_FROM VariableRef
  private static boolean ComponentOrAny_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComponentOrAny_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMPONENT);
    if (!r) r = ComponentOrAny_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_FROM VariableRef
  private static boolean ComponentOrAny_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComponentOrAny_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_FROM);
    r = r && VariableRef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_ALL TTCN_COMPONENT
  private static boolean ComponentOrAny_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComponentOrAny_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_ALL, TTCN_COMPONENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VariableRef | FunctionInstance
  public static boolean ComponentOrDefaultReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComponentOrDefaultReference")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableRef(b, l + 1);
    if (!r) r = FunctionInstance(b, l + 1);
    exit_section_(b, m, COMPONENT_OR_DEFAULT_REFERENCE, r);
    return r;
  }

  /* ********************************************************** */
  // ComponentOrDefaultReference | TTCN_SYSTEM | TTCN_SELF | TTCN_MTC
  static boolean ComponentRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComponentRef")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ComponentOrDefaultReference(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_SYSTEM);
    if (!r) r = consumeToken(b, TTCN_SELF);
    if (!r) r = consumeToken(b, TTCN_MTC);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier TTCN_ASSIGN ComponentRef
  public static boolean ComponentRefAssignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComponentRefAssignment")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, TTCN_ASSIGN);
    r = r && ComponentRef(b, l + 1);
    exit_section_(b, m, COMPONENT_REF_ASSIGNMENT, r);
    return r;
  }

  /* ********************************************************** */
  // ComponentOrDefaultReference | TTCN_MTC | TTCN_SELF
  public static boolean ComponentReferenceOrLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComponentReferenceOrLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<component reference or literal>");
    r = ComponentOrDefaultReference(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_MTC);
    if (!r) r = consumeToken(b, TTCN_SELF);
    exit_section_(b, l, m, COMPONENT_REFERENCE_OR_LITERAL, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ExtendedIdentifier
  static boolean ComponentType(PsiBuilder b, int l) {
    return ExtendedIdentifier(b, l + 1);
  }

  /* ********************************************************** */
  // FieldConstExpressionList | ArrayConstExpression
  public static boolean CompoundConstExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompoundConstExpression")) return false;
    if (!nextTokenIs(b, TTCN_LB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FieldConstExpressionList(b, l + 1);
    if (!r) r = ArrayConstExpression(b, l + 1);
    exit_section_(b, m, COMPOUND_CONST_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // FieldExpressionList | ArrayExpression
  public static boolean CompoundExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompoundExpression")) return false;
    if (!nextTokenIs(b, TTCN_LB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FieldExpressionList(b, l + 1);
    if (!r) r = ArrayExpression(b, l + 1);
    exit_section_(b, m, COMPOUND_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_IF TTCN_LP BooleanExpression TTCN_RP StatementBlock ElseIfClause* ElseClause?
  public static boolean ConditionalConstruct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalConstruct")) return false;
    if (!nextTokenIs(b, TTCN_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_IF, TTCN_LP);
    r = r && BooleanExpression(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    r = r && StatementBlock(b, l + 1);
    r = r && ConditionalConstruct_5(b, l + 1);
    r = r && ConditionalConstruct_6(b, l + 1);
    exit_section_(b, m, CONDITIONAL_CONSTRUCT, r);
    return r;
  }

  // ElseIfClause*
  private static boolean ConditionalConstruct_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalConstruct_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ElseIfClause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ConditionalConstruct_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ElseClause?
  private static boolean ConditionalConstruct_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalConstruct_6")) return false;
    ElseClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // MapParamDef | UnmapParamDef
  public static boolean ConfigParamDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConfigParamDef")) return false;
    if (!nextTokenIs(b, "<config param def>", TTCN_MAP, TTCN_UNMAP)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<config param def>");
    r = MapParamDef(b, l + 1);
    if (!r) r = UnmapParamDef(b, l + 1);
    exit_section_(b, l, m, CONFIG_PARAM_DEF, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // RunsOnSpec SystemSpec?
  public static boolean ConfigSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConfigSpec")) return false;
    if (!nextTokenIs(b, TTCN_RUNS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RunsOnSpec(b, l + 1);
    r = r && ConfigSpec_1(b, l + 1);
    exit_section_(b, m, CONFIG_SPEC, r);
    return r;
  }

  // SystemSpec?
  private static boolean ConfigSpec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConfigSpec_1")) return false;
    SystemSpec(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // CreateOp | TTCN_SELF | TTCN_SYSTEM | TTCN_MTC | RunningOp | AliveOp
  public static boolean ConfigurationOps(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConfigurationOps")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<configuration ops>");
    r = CreateOp(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_SELF);
    if (!r) r = consumeToken(b, TTCN_SYSTEM);
    if (!r) r = consumeToken(b, TTCN_MTC);
    if (!r) r = RunningOp(b, l + 1);
    if (!r) r = AliveOp(b, l + 1);
    exit_section_(b, l, m, CONFIGURATION_OPS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ConnectStatement | MapStatement | DisconnectStatement | UnmapStatement | DoneStatement | KilledStatement | StartTCStatement | StopTCStatement | KillTCStatement
  static boolean ConfigurationStatements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConfigurationStatements")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConnectStatement(b, l + 1);
    if (!r) r = MapStatement(b, l + 1);
    if (!r) r = DisconnectStatement(b, l + 1);
    if (!r) r = UnmapStatement(b, l + 1);
    if (!r) r = DoneStatement(b, l + 1);
    if (!r) r = KilledStatement(b, l + 1);
    if (!r) r = StartTCStatement(b, l + 1);
    if (!r) r = StopTCStatement(b, l + 1);
    if (!r) r = KillTCStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_CONNECTS SingleConnectionSpec
  public static boolean ConnectStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConnectStatement")) return false;
    if (!nextTokenIs(b, TTCN_CONNECTS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_CONNECTS);
    r = r && SingleConnectionSpec(b, l + 1);
    exit_section_(b, m, CONNECT_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_CONST Type ConstList
  public static boolean ConstDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstDef")) return false;
    if (!nextTokenIs(b, TTCN_CONST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_CONST);
    r = r && Type(b, l + 1);
    r = r && ConstList(b, l + 1);
    exit_section_(b, m, CONST_DEF, r);
    return r;
  }

  /* ********************************************************** */
  // SingleConstDef ( TTCN_COMMA SingleConstDef )*
  static boolean ConstList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstList")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SingleConstDef(b, l + 1);
    r = r && ConstList_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_COMMA SingleConstDef )*
  private static boolean ConstList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ConstList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ConstList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA SingleConstDef
  private static boolean ConstList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && SingleConstDef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SingleExpression | CompoundConstExpression
  public static boolean ConstantExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstantExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<constant expression>");
    r = SingleExpression(b, l + 1);
    if (!r) r = CompoundConstExpression(b, l + 1);
    exit_section_(b, l, m, CONSTANT_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ModuleDefinitionsList | ModuleControlPart
  static boolean Content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Content")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ModuleDefinitionsList(b, l + 1);
    if (!r) r = ModuleControlPart(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TimerStatements | BasicStatements | BehaviourStatements | SUTStatements | TTCN_STOP
  public static boolean ControlStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ControlStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<control statement>");
    r = TimerStatements(b, l + 1);
    if (!r) r = BasicStatements(b, l + 1);
    if (!r) r = BehaviourStatements(b, l + 1);
    if (!r) r = SUTStatements(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_STOP);
    exit_section_(b, l, m, CONTROL_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( FunctionLocalDef | FunctionLocalInst ) WithStatement? | ControlStatement
  public static boolean ControlStatementOrDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ControlStatementOrDef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<control statement or def>");
    r = ControlStatementOrDef_0(b, l + 1);
    if (!r) r = ControlStatement(b, l + 1);
    exit_section_(b, l, m, CONTROL_STATEMENT_OR_DEF, r, false, null);
    return r;
  }

  // ( FunctionLocalDef | FunctionLocalInst ) WithStatement?
  private static boolean ControlStatementOrDef_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ControlStatementOrDef_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ControlStatementOrDef_0_0(b, l + 1);
    r = r && ControlStatementOrDef_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // FunctionLocalDef | FunctionLocalInst
  private static boolean ControlStatementOrDef_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ControlStatementOrDef_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionLocalDef(b, l + 1);
    if (!r) r = FunctionLocalInst(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WithStatement?
  private static boolean ControlStatementOrDef_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ControlStatementOrDef_0_1")) return false;
    WithStatement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (ControlStatementOrDef TTCN_SEMI?)+
  public static boolean ControlStatementOrDefList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ControlStatementOrDefList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<control statement or def list>");
    r = ControlStatementOrDefList_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!ControlStatementOrDefList_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ControlStatementOrDefList", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, CONTROL_STATEMENT_OR_DEF_LIST, r, false, null);
    return r;
  }

  // ControlStatementOrDef TTCN_SEMI?
  private static boolean ControlStatementOrDefList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ControlStatementOrDefList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ControlStatementOrDef(b, l + 1);
    r = r && ControlStatementOrDefList_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_SEMI?
  private static boolean ControlStatementOrDefList_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ControlStatementOrDefList_0_1")) return false;
    consumeToken(b, TTCN_SEMI);
    return true;
  }

  /* ********************************************************** */
  // ComponentType TTCN_DOT TTCN_CREATE ( TTCN_LP ( SingleExpression | TTCN_SUB ) ( TTCN_COMMA SingleExpression )? TTCN_RP )? TTCN_ALIVE?
  public static boolean CreateOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CreateOp")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ComponentType(b, l + 1);
    r = r && consumeTokens(b, 0, TTCN_DOT, TTCN_CREATE);
    r = r && CreateOp_3(b, l + 1);
    r = r && CreateOp_4(b, l + 1);
    exit_section_(b, m, CREATE_OP, r);
    return r;
  }

  // ( TTCN_LP ( SingleExpression | TTCN_SUB ) ( TTCN_COMMA SingleExpression )? TTCN_RP )?
  private static boolean CreateOp_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CreateOp_3")) return false;
    CreateOp_3_0(b, l + 1);
    return true;
  }

  // TTCN_LP ( SingleExpression | TTCN_SUB ) ( TTCN_COMMA SingleExpression )? TTCN_RP
  private static boolean CreateOp_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CreateOp_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LP);
    r = r && CreateOp_3_0_1(b, l + 1);
    r = r && CreateOp_3_0_2(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // SingleExpression | TTCN_SUB
  private static boolean CreateOp_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CreateOp_3_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SingleExpression(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_SUB);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_COMMA SingleExpression )?
  private static boolean CreateOp_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CreateOp_3_0_2")) return false;
    CreateOp_3_0_2_0(b, l + 1);
    return true;
  }

  // TTCN_COMMA SingleExpression
  private static boolean CreateOp_3_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CreateOp_3_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && SingleExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_ALIVE?
  private static boolean CreateOp_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CreateOp_4")) return false;
    consumeToken(b, TTCN_ALIVE);
    return true;
  }

  /* ********************************************************** */
  // TTCN_STRING
  static boolean Cstring(PsiBuilder b, int l) {
    return consumeToken(b, TTCN_STRING);
  }

  /* ********************************************************** */
  // TTCN_DEACTIVTE ( TTCN_LP ComponentOrDefaultReference TTCN_RP )?
  public static boolean DeactivateStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeactivateStatement")) return false;
    if (!nextTokenIs(b, TTCN_DEACTIVTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_DEACTIVTE);
    r = r && DeactivateStatement_1(b, l + 1);
    exit_section_(b, m, DEACTIVATE_STATEMENT, r);
    return r;
  }

  // ( TTCN_LP ComponentOrDefaultReference TTCN_RP )?
  private static boolean DeactivateStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeactivateStatement_1")) return false;
    DeactivateStatement_1_0(b, l + 1);
    return true;
  }

  // TTCN_LP ComponentOrDefaultReference TTCN_RP
  private static boolean DeactivateStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeactivateStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LP);
    r = r && ComponentOrDefaultReference(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Num+
  static boolean DecimalNumber(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DecimalNumber")) return false;
    if (!nextTokenIs(b, TTCN_NUM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Num(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!Num(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DecimalNumber", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // QualifiedIdentifier | ( ( FieldReference | TTCN_LM TTCN_SUB TTCN_RM ) ExtendedFieldReference? ) | AllRef
  public static boolean DefOrFieldRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefOrFieldRef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<def or field ref>");
    r = QualifiedIdentifier(b, l + 1);
    if (!r) r = DefOrFieldRef_1(b, l + 1);
    if (!r) r = AllRef(b, l + 1);
    exit_section_(b, l, m, DEF_OR_FIELD_REF, r, false, null);
    return r;
  }

  // ( FieldReference | TTCN_LM TTCN_SUB TTCN_RM ) ExtendedFieldReference?
  private static boolean DefOrFieldRef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefOrFieldRef_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DefOrFieldRef_1_0(b, l + 1);
    r = r && DefOrFieldRef_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // FieldReference | TTCN_LM TTCN_SUB TTCN_RM
  private static boolean DefOrFieldRef_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefOrFieldRef_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FieldReference(b, l + 1);
    if (!r) r = parseTokens(b, 0, TTCN_LM, TTCN_SUB, TTCN_RM);
    exit_section_(b, m, null, r);
    return r;
  }

  // ExtendedFieldReference?
  private static boolean DefOrFieldRef_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefOrFieldRef_1_1")) return false;
    ExtendedFieldReference(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DefOrFieldRef (TTCN_COMMA DefOrFieldRef )*
  public static boolean DefOrFieldRefList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefOrFieldRefList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<def or field ref list>");
    r = DefOrFieldRef(b, l + 1);
    r = r && DefOrFieldRefList_1(b, l + 1);
    exit_section_(b, l, m, DEF_OR_FIELD_REF_LIST, r, false, null);
    return r;
  }

  // (TTCN_COMMA DefOrFieldRef )*
  private static boolean DefOrFieldRefList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefOrFieldRefList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!DefOrFieldRefList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DefOrFieldRefList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA DefOrFieldRef
  private static boolean DefOrFieldRefList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DefOrFieldRefList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && DefOrFieldRef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_DEFAULT
  static boolean DefaultKeyword(PsiBuilder b, int l) {
    return consumeToken(b, TTCN_DEFAULT);
  }

  /* ********************************************************** */
  // TTCN_MODIFIES ExtendedIdentifier
  public static boolean DerivedDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DerivedDef")) return false;
    if (!nextTokenIs(b, TTCN_MODIFIES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_MODIFIES);
    r = r && ExtendedIdentifier(b, l + 1);
    exit_section_(b, m, DERIVED_DEF, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_MODIFIES TemplateRefWithParList
  public static boolean DerivedRefWithParList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DerivedRefWithParList")) return false;
    if (!nextTokenIs(b, TTCN_MODIFIES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_MODIFIES);
    r = r && TemplateRefWithParList(b, l + 1);
    exit_section_(b, m, DERIVED_REF_WITH_PAR_LIST, r);
    return r;
  }

  /* ********************************************************** */
  // InParKeyword | OutParKeyword | InOutParKeyword
  public static boolean Direction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Direction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<direction>");
    r = InParKeyword(b, l + 1);
    if (!r) r = OutParKeyword(b, l + 1);
    if (!r) r = InOutParKeyword(b, l + 1);
    exit_section_(b, l, m, DIRECTION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_DISCONNECT (SingleConnectionSpec | AllConnectionsSpec | AllPortsSpec | AllCompsAllPortsSpec)?
  public static boolean DisconnectStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DisconnectStatement")) return false;
    if (!nextTokenIs(b, TTCN_DISCONNECT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_DISCONNECT);
    r = r && DisconnectStatement_1(b, l + 1);
    exit_section_(b, m, DISCONNECT_STATEMENT, r);
    return r;
  }

  // (SingleConnectionSpec | AllConnectionsSpec | AllPortsSpec | AllCompsAllPortsSpec)?
  private static boolean DisconnectStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DisconnectStatement_1")) return false;
    DisconnectStatement_1_0(b, l + 1);
    return true;
  }

  // SingleConnectionSpec | AllConnectionsSpec | AllPortsSpec | AllCompsAllPortsSpec
  private static boolean DisconnectStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DisconnectStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SingleConnectionSpec(b, l + 1);
    if (!r) r = AllConnectionsSpec(b, l + 1);
    if (!r) r = AllPortsSpec(b, l + 1);
    if (!r) r = AllCompsAllPortsSpec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_DO StatementBlock TTCN_WHILE TTCN_LP BooleanExpression TTCN_RP
  public static boolean DoWhileStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DoWhileStatement")) return false;
    if (!nextTokenIs(b, TTCN_DO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_DO);
    r = r && StatementBlock(b, l + 1);
    r = r && consumeTokens(b, 0, TTCN_WHILE, TTCN_LP);
    r = r && BooleanExpression(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, DO_WHILE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // ComponentOrAny TTCN_DOT TTCN_DONE IndexAssignment?
  public static boolean DoneStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DoneStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<done statement>");
    r = ComponentOrAny(b, l + 1);
    r = r && consumeTokens(b, 0, TTCN_DOT, TTCN_DONE);
    r = r && DoneStatement_3(b, l + 1);
    exit_section_(b, l, m, DONE_STATEMENT, r, false, null);
    return r;
  }

  // IndexAssignment?
  private static boolean DoneStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DoneStatement_3")) return false;
    IndexAssignment(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TTCN_ELSE StatementBlock
  public static boolean ElseClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseClause")) return false;
    if (!nextTokenIs(b, TTCN_ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_ELSE);
    r = r && StatementBlock(b, l + 1);
    exit_section_(b, m, ELSE_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_ELSE TTCN_IF TTCN_LP BooleanExpression TTCN_RP StatementBlock
  public static boolean ElseIfClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfClause")) return false;
    if (!nextTokenIs(b, TTCN_ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_ELSE, TTCN_IF, TTCN_LP);
    r = r && BooleanExpression(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    r = r && StatementBlock(b, l + 1);
    exit_section_(b, m, ELSE_IF_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_LM TTCN_ELSE TTCN_RM StatementBlock
  public static boolean ElseStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseStatement")) return false;
    if (!nextTokenIs(b, TTCN_LM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_LM, TTCN_ELSE, TTCN_RM);
    r = r && StatementBlock(b, l + 1);
    exit_section_(b, m, ELSE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_ENUMERATED ( Identifier | AddressKeyword ) TTCN_LB EnumerationList TTCN_RB
  public static boolean EnumDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDef")) return false;
    if (!nextTokenIs(b, TTCN_ENUMERATED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_ENUMERATED);
    r = r && EnumDef_1(b, l + 1);
    r = r && consumeToken(b, TTCN_LB);
    r = r && EnumerationList(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, ENUM_DEF, r);
    return r;
  }

  // Identifier | AddressKeyword
  private static boolean EnumDef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDef_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    if (!r) r = AddressKeyword(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier (TTCN_LP TTCN_SUB? Number TTCN_RP)?
  public static boolean Enumeration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Enumeration")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && Enumeration_1(b, l + 1);
    exit_section_(b, m, ENUMERATION, r);
    return r;
  }

  // (TTCN_LP TTCN_SUB? Number TTCN_RP)?
  private static boolean Enumeration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Enumeration_1")) return false;
    Enumeration_1_0(b, l + 1);
    return true;
  }

  // TTCN_LP TTCN_SUB? Number TTCN_RP
  private static boolean Enumeration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Enumeration_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LP);
    r = r && Enumeration_1_0_1(b, l + 1);
    r = r && Number(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_SUB?
  private static boolean Enumeration_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Enumeration_1_0_1")) return false;
    consumeToken(b, TTCN_SUB);
    return true;
  }

  /* ********************************************************** */
  // Enumeration ( TTCN_COMMA Enumeration)*
  static boolean EnumerationList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumerationList")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Enumeration(b, l + 1);
    r = r && EnumerationList_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_COMMA Enumeration)*
  private static boolean EnumerationList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumerationList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!EnumerationList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EnumerationList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA Enumeration
  private static boolean EnumerationList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumerationList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && Enumeration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RelExpression ( EqualOp RelExpression )*
  static boolean EqualExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EqualExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RelExpression(b, l + 1);
    r = r && EqualExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( EqualOp RelExpression )*
  private static boolean EqualExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EqualExpression_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!EqualExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EqualExpression_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EqualOp RelExpression
  private static boolean EqualExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EqualExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EqualOp(b, l + 1);
    r = r && RelExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_EQ | TTCN_NOT_EQ
  public static boolean EqualOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EqualOp")) return false;
    if (!nextTokenIs(b, "<equal op>", TTCN_EQ, TTCN_NOT_EQ)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<equal op>");
    r = consumeToken(b, TTCN_EQ);
    if (!r) r = consumeToken(b, TTCN_NOT_EQ);
    exit_section_(b, l, m, EQUAL_OP, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_ALTSTEP IdentifierListOrAll
  public static boolean ExceptAltstepSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExceptAltstepSpec")) return false;
    if (!nextTokenIs(b, TTCN_ALTSTEP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_ALTSTEP);
    r = r && IdentifierListOrAll(b, l + 1);
    exit_section_(b, m, EXCEPT_ALTSTEP_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_CONST IdentifierListOrAll
  public static boolean ExceptConstSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExceptConstSpec")) return false;
    if (!nextTokenIs(b, TTCN_CONST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_CONST);
    r = r && IdentifierListOrAll(b, l + 1);
    exit_section_(b, m, EXCEPT_CONST_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // ExceptGroupSpec | ExceptTypeDefSpec | ExceptTemplateSpec | ExceptConstSpec | ExceptTestcaseSpec | ExceptAltstepSpec | ExceptFunctionSpec | ExceptSignatureSpec | ExceptModuleParSpec
  public static boolean ExceptElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExceptElement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<except element>");
    r = ExceptGroupSpec(b, l + 1);
    if (!r) r = ExceptTypeDefSpec(b, l + 1);
    if (!r) r = ExceptTemplateSpec(b, l + 1);
    if (!r) r = ExceptConstSpec(b, l + 1);
    if (!r) r = ExceptTestcaseSpec(b, l + 1);
    if (!r) r = ExceptAltstepSpec(b, l + 1);
    if (!r) r = ExceptFunctionSpec(b, l + 1);
    if (!r) r = ExceptSignatureSpec(b, l + 1);
    if (!r) r = ExceptModuleParSpec(b, l + 1);
    exit_section_(b, l, m, EXCEPT_ELEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_FUNCTIOIN IdentifierListOrAll
  public static boolean ExceptFunctionSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExceptFunctionSpec")) return false;
    if (!nextTokenIs(b, TTCN_FUNCTIOIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_FUNCTIOIN);
    r = r && IdentifierListOrAll(b, l + 1);
    exit_section_(b, m, EXCEPT_FUNCTION_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_GROUP ( QualifiedIdentifierList | TTCN_ALL )
  public static boolean ExceptGroupSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExceptGroupSpec")) return false;
    if (!nextTokenIs(b, TTCN_GROUP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_GROUP);
    r = r && ExceptGroupSpec_1(b, l + 1);
    exit_section_(b, m, EXCEPT_GROUP_SPEC, r);
    return r;
  }

  // QualifiedIdentifierList | TTCN_ALL
  private static boolean ExceptGroupSpec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExceptGroupSpec_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedIdentifierList(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_ALL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_MODULEPAR IdentifierListOrAll
  public static boolean ExceptModuleParSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExceptModuleParSpec")) return false;
    if (!nextTokenIs(b, TTCN_MODULEPAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_MODULEPAR);
    r = r && IdentifierListOrAll(b, l + 1);
    exit_section_(b, m, EXCEPT_MODULE_PAR_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_SIGNATURE IdentifierListOrAll
  public static boolean ExceptSignatureSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExceptSignatureSpec")) return false;
    if (!nextTokenIs(b, TTCN_SIGNATURE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_SIGNATURE);
    r = r && IdentifierListOrAll(b, l + 1);
    exit_section_(b, m, EXCEPT_SIGNATURE_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // ExceptElement TTCN_SEMI?
  public static boolean ExceptSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExceptSpec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<except spec>");
    r = ExceptElement(b, l + 1);
    r = r && ExceptSpec_1(b, l + 1);
    exit_section_(b, l, m, EXCEPT_SPEC, r, false, null);
    return r;
  }

  // TTCN_SEMI?
  private static boolean ExceptSpec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExceptSpec_1")) return false;
    consumeToken(b, TTCN_SEMI);
    return true;
  }

  /* ********************************************************** */
  // TTCN_TEMPLATE IdentifierListOrAll
  public static boolean ExceptTemplateSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExceptTemplateSpec")) return false;
    if (!nextTokenIs(b, TTCN_TEMPLATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_TEMPLATE);
    r = r && IdentifierListOrAll(b, l + 1);
    exit_section_(b, m, EXCEPT_TEMPLATE_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_TESTCASE IdentifierListOrAll
  public static boolean ExceptTestcaseSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExceptTestcaseSpec")) return false;
    if (!nextTokenIs(b, TTCN_TESTCASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_TESTCASE);
    r = r && IdentifierListOrAll(b, l + 1);
    exit_section_(b, m, EXCEPT_TESTCASE_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_TYPE IdentifierListOrAll
  public static boolean ExceptTypeDefSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExceptTypeDefSpec")) return false;
    if (!nextTokenIs(b, TTCN_TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_TYPE);
    r = r && IdentifierListOrAll(b, l + 1);
    exit_section_(b, m, EXCEPT_TYPE_DEF_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_EXCEPTION TTCN_LP TypeList TTCN_RP
  public static boolean ExceptionSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExceptionSpec")) return false;
    if (!nextTokenIs(b, TTCN_EXCEPTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_EXCEPTION, TTCN_LP);
    r = r && TypeList(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, EXCEPTION_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_EXCEPT TTCN_LB ExceptSpec* TTCN_RB
  public static boolean ExceptsDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExceptsDef")) return false;
    if (!nextTokenIs(b, TTCN_EXCEPT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_EXCEPT, TTCN_LB);
    r = r && ExceptsDef_2(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, EXCEPTS_DEF, r);
    return r;
  }

  // ExceptSpec*
  private static boolean ExceptsDef_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExceptsDef_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ExceptSpec(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ExceptsDef_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // 'E'
  public static boolean Exponential(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Exponential")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<exponential>");
    r = consumeToken(b, "E");
    exit_section_(b, l, m, EXPONENTIAL, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SingleExpression | CompoundExpression
  public static boolean Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<expression>");
    r = SingleExpression(b, l + 1);
    if (!r) r = CompoundExpression(b, l + 1);
    exit_section_(b, l, m, EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_EXTERNAL TTCN_CONST Type IdentifierList
  public static boolean ExtConstDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtConstDef")) return false;
    if (!nextTokenIs(b, TTCN_EXTERNAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_EXTERNAL, TTCN_CONST);
    r = r && Type(b, l + 1);
    r = r && IdentifierList(b, l + 1);
    exit_section_(b, m, EXT_CONST_DEF, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_EXTERNAL TTCN_FUNCTIOIN TTCN_AT_DETERMINISTIC? Identifier TTCN_LP FunctionFormalParList? TTCN_RP ReturnType?
  public static boolean ExtFunctionDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtFunctionDef")) return false;
    if (!nextTokenIs(b, TTCN_EXTERNAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_EXTERNAL, TTCN_FUNCTIOIN);
    r = r && ExtFunctionDef_2(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, TTCN_LP);
    r = r && ExtFunctionDef_5(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    r = r && ExtFunctionDef_7(b, l + 1);
    exit_section_(b, m, EXT_FUNCTION_DEF, r);
    return r;
  }

  // TTCN_AT_DETERMINISTIC?
  private static boolean ExtFunctionDef_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtFunctionDef_2")) return false;
    consumeToken(b, TTCN_AT_DETERMINISTIC);
    return true;
  }

  // FunctionFormalParList?
  private static boolean ExtFunctionDef_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtFunctionDef_5")) return false;
    FunctionFormalParList(b, l + 1);
    return true;
  }

  // ReturnType?
  private static boolean ExtFunctionDef_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtFunctionDef_7")) return false;
    ReturnType(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TTCN_STRING
  static boolean ExtendedAlphaNum(PsiBuilder b, int l) {
    return consumeToken(b, TTCN_STRING);
  }

  /* ********************************************************** */
  // (( TTCN_DOT ( Identifier | PredefinedType ) ) | ArrayOrBitRef | ( TTCN_LM TTCN_SUB TTCN_RM ))+
  public static boolean ExtendedFieldReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtendedFieldReference")) return false;
    if (!nextTokenIs(b, "<extended field reference>", TTCN_DOT, TTCN_LM)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<extended field reference>");
    r = ExtendedFieldReference_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!ExtendedFieldReference_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ExtendedFieldReference", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, EXTENDED_FIELD_REFERENCE, r, false, null);
    return r;
  }

  // ( TTCN_DOT ( Identifier | PredefinedType ) ) | ArrayOrBitRef | ( TTCN_LM TTCN_SUB TTCN_RM )
  private static boolean ExtendedFieldReference_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtendedFieldReference_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExtendedFieldReference_0_0(b, l + 1);
    if (!r) r = ArrayOrBitRef(b, l + 1);
    if (!r) r = ExtendedFieldReference_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_DOT ( Identifier | PredefinedType )
  private static boolean ExtendedFieldReference_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtendedFieldReference_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_DOT);
    r = r && ExtendedFieldReference_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier | PredefinedType
  private static boolean ExtendedFieldReference_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtendedFieldReference_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    if (!r) r = PredefinedType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_LM TTCN_SUB TTCN_RM
  private static boolean ExtendedFieldReference_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtendedFieldReference_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_LM, TTCN_SUB, TTCN_RM);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (Identifier TTCN_DOT)* Identifier
  static boolean ExtendedIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtendedIdentifier")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExtendedIdentifier_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Identifier TTCN_DOT)*
  private static boolean ExtendedIdentifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtendedIdentifier_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ExtendedIdentifier_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ExtendedIdentifier_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // Identifier TTCN_DOT
  private static boolean ExtendedIdentifier_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtendedIdentifier_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, TTCN_DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // StringLength | TTCN_IFPRESENT | ( StringLength TTCN_IFPRESENT )
  public static boolean ExtraMatchingAttributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtraMatchingAttributes")) return false;
    if (!nextTokenIs(b, "<extra matching attributes>", TTCN_IFPRESENT, TTCN_LENGTH)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<extra matching attributes>");
    r = StringLength(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_IFPRESENT);
    if (!r) r = ExtraMatchingAttributes_2(b, l + 1);
    exit_section_(b, l, m, EXTRA_MATCHING_ATTRIBUTES, r, false, null);
    return r;
  }

  // StringLength TTCN_IFPRESENT
  private static boolean ExtraMatchingAttributes_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExtraMatchingAttributes_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StringLength(b, l + 1);
    r = r && consumeToken(b, TTCN_IFPRESENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_LB FieldConstExpressionSpec ( TTCN_COMMA FieldConstExpressionSpec )* TTCN_RB
  public static boolean FieldConstExpressionList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldConstExpressionList")) return false;
    if (!nextTokenIs(b, TTCN_LB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LB);
    r = r && FieldConstExpressionSpec(b, l + 1);
    r = r && FieldConstExpressionList_2(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, FIELD_CONST_EXPRESSION_LIST, r);
    return r;
  }

  // ( TTCN_COMMA FieldConstExpressionSpec )*
  private static boolean FieldConstExpressionList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldConstExpressionList_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!FieldConstExpressionList_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FieldConstExpressionList_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA FieldConstExpressionSpec
  private static boolean FieldConstExpressionList_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldConstExpressionList_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && FieldConstExpressionSpec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FieldReference TTCN_ASSIGN ConstantExpression
  public static boolean FieldConstExpressionSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldConstExpressionSpec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<field const expression spec>");
    r = FieldReference(b, l + 1);
    r = r && consumeToken(b, TTCN_ASSIGN);
    r = r && ConstantExpression(b, l + 1);
    exit_section_(b, l, m, FIELD_CONST_EXPRESSION_SPEC, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_LB FieldExpressionSpec { TTCN_COMMA FieldExpressionSpec } TTCN_RB
  public static boolean FieldExpressionList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldExpressionList")) return false;
    if (!nextTokenIs(b, TTCN_LB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LB);
    r = r && FieldExpressionSpec(b, l + 1);
    r = r && FieldExpressionList_2(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, FIELD_EXPRESSION_LIST, r);
    return r;
  }

  // TTCN_COMMA FieldExpressionSpec
  private static boolean FieldExpressionList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldExpressionList_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && FieldExpressionSpec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FieldReference TTCN_ASSIGN NotUsedOrExpression
  public static boolean FieldExpressionSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldExpressionSpec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<field expression spec>");
    r = FieldReference(b, l + 1);
    r = r && consumeToken(b, TTCN_ASSIGN);
    r = r && NotUsedOrExpression(b, l + 1);
    exit_section_(b, l, m, FIELD_EXPRESSION_SPEC, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SingleExpression
  public static boolean FieldOrBitNumber(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldOrBitNumber")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<field or bit number>");
    r = SingleExpression(b, l + 1);
    exit_section_(b, l, m, FIELD_OR_BIT_NUMBER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // StructFieldRef | ArrayOrBitRef | ParRef
  public static boolean FieldReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldReference")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<field reference>");
    r = StructFieldRef(b, l + 1);
    if (!r) r = ArrayOrBitRef(b, l + 1);
    if (!r) r = ParRef(b, l + 1);
    exit_section_(b, l, m, FIELD_REFERENCE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FieldReference TTCN_ASSIGN ( TemplateBody | TTCN_SUB )
  public static boolean FieldSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldSpec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<field spec>");
    r = FieldReference(b, l + 1);
    r = r && consumeToken(b, TTCN_ASSIGN);
    r = r && FieldSpec_2(b, l + 1);
    exit_section_(b, l, m, FIELD_SPEC, r, false, null);
    return r;
  }

  // TemplateBody | TTCN_SUB
  private static boolean FieldSpec_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldSpec_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateBody(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_SUB);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_LB FieldSpec ( TTCN_COMMA FieldSpec )* TTCN_RB
  public static boolean FieldSpecList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldSpecList")) return false;
    if (!nextTokenIs(b, TTCN_LB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LB);
    r = r && FieldSpec(b, l + 1);
    r = r && FieldSpecList_2(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, FIELD_SPEC_LIST, r);
    return r;
  }

  // ( TTCN_COMMA FieldSpec )*
  private static boolean FieldSpecList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldSpecList_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!FieldSpecList_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FieldSpecList_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA FieldSpec
  private static boolean FieldSpecList_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldSpecList_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && FieldSpec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Number TTCN_DOT DecimalNumber
  public static boolean FloatDotNotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FloatDotNotation")) return false;
    if (!nextTokenIs(b, TTCN_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Number(b, l + 1);
    r = r && consumeToken(b, TTCN_DOT);
    r = r && DecimalNumber(b, l + 1);
    exit_section_(b, m, FLOAT_DOT_NOTATION, r);
    return r;
  }

  /* ********************************************************** */
  // Number (TTCN_DOT DecimalNumber)? Exponential TTCN_SUB? Number
  public static boolean FloatENotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FloatENotation")) return false;
    if (!nextTokenIs(b, TTCN_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Number(b, l + 1);
    r = r && FloatENotation_1(b, l + 1);
    r = r && Exponential(b, l + 1);
    r = r && FloatENotation_3(b, l + 1);
    r = r && Number(b, l + 1);
    exit_section_(b, m, FLOAT_E_NOTATION, r);
    return r;
  }

  // (TTCN_DOT DecimalNumber)?
  private static boolean FloatENotation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FloatENotation_1")) return false;
    FloatENotation_1_0(b, l + 1);
    return true;
  }

  // TTCN_DOT DecimalNumber
  private static boolean FloatENotation_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FloatENotation_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_DOT);
    r = r && DecimalNumber(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_SUB?
  private static boolean FloatENotation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FloatENotation_3")) return false;
    consumeToken(b, TTCN_SUB);
    return true;
  }

  /* ********************************************************** */
  // TTCN_FLOAT
  static boolean FloatKeyword(PsiBuilder b, int l) {
    return consumeToken(b, TTCN_FLOAT);
  }

  /* ********************************************************** */
  // FloatDotNotation | FloatENotation | TTCN_NOT_A_NUM
  public static boolean FloatValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FloatValue")) return false;
    if (!nextTokenIs(b, "<float value>", TTCN_NOT_A_NUM, TTCN_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<float value>");
    r = FloatDotNotation(b, l + 1);
    if (!r) r = FloatENotation(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_NOT_A_NUM);
    exit_section_(b, l, m, FLOAT_VALUE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_FOR TTCN_LP Initial TTCN_SEMI BooleanExpression TTCN_SEMI Assignment TTCN_RP StatementBlock
  public static boolean ForStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement")) return false;
    if (!nextTokenIs(b, TTCN_FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_FOR, TTCN_LP);
    r = r && Initial(b, l + 1);
    r = r && consumeToken(b, TTCN_SEMI);
    r = r && BooleanExpression(b, l + 1);
    r = r && consumeToken(b, TTCN_SEMI);
    r = r && Assignment(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    r = r && StatementBlock(b, l + 1);
    exit_section_(b, m, FOR_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // InOutParKeyword? Identifier Identifier
  static boolean FormalPortPar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalPortPar")) return false;
    if (!nextTokenIs(b, "", TTCN_ID, TTCN_INOUT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FormalPortPar_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // InOutParKeyword?
  private static boolean FormalPortPar_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalPortPar_0")) return false;
    InOutParKeyword(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ( InParKeyword | OutParKeyword | InOutParKeyword )? ( TTCN_TEMPLATE | RestrictedTemplate ) ( TTCN_AT_LAZY | TTCN_AT_FUZZY )? Type Identifier ( TTCN_ASSIGN ( InLineTemplate | TTCN_SUB ) )?
  static boolean FormalTemplatePar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalTemplatePar")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FormalTemplatePar_0(b, l + 1);
    r = r && FormalTemplatePar_1(b, l + 1);
    r = r && FormalTemplatePar_2(b, l + 1);
    r = r && Type(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && FormalTemplatePar_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( InParKeyword | OutParKeyword | InOutParKeyword )?
  private static boolean FormalTemplatePar_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalTemplatePar_0")) return false;
    FormalTemplatePar_0_0(b, l + 1);
    return true;
  }

  // InParKeyword | OutParKeyword | InOutParKeyword
  private static boolean FormalTemplatePar_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalTemplatePar_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InParKeyword(b, l + 1);
    if (!r) r = OutParKeyword(b, l + 1);
    if (!r) r = InOutParKeyword(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_TEMPLATE | RestrictedTemplate
  private static boolean FormalTemplatePar_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalTemplatePar_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_TEMPLATE);
    if (!r) r = RestrictedTemplate(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_AT_LAZY | TTCN_AT_FUZZY )?
  private static boolean FormalTemplatePar_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalTemplatePar_2")) return false;
    FormalTemplatePar_2_0(b, l + 1);
    return true;
  }

  // TTCN_AT_LAZY | TTCN_AT_FUZZY
  private static boolean FormalTemplatePar_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalTemplatePar_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_AT_LAZY);
    if (!r) r = consumeToken(b, TTCN_AT_FUZZY);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_ASSIGN ( InLineTemplate | TTCN_SUB ) )?
  private static boolean FormalTemplatePar_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalTemplatePar_5")) return false;
    FormalTemplatePar_5_0(b, l + 1);
    return true;
  }

  // TTCN_ASSIGN ( InLineTemplate | TTCN_SUB )
  private static boolean FormalTemplatePar_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalTemplatePar_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_ASSIGN);
    r = r && FormalTemplatePar_5_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // InLineTemplate | TTCN_SUB
  private static boolean FormalTemplatePar_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalTemplatePar_5_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InLineTemplate(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_SUB);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // InOutParKeyword? TTCN_TIMER Identifier
  static boolean FormalTimerPar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalTimerPar")) return false;
    if (!nextTokenIs(b, "", TTCN_INOUT, TTCN_TIMER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FormalTimerPar_0(b, l + 1);
    r = r && consumeToken(b, TTCN_TIMER);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // InOutParKeyword?
  private static boolean FormalTimerPar_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalTimerPar_0")) return false;
    InOutParKeyword(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ( InParKeyword | InOutParKeyword | OutParKeyword )? (TTCN_AT_LAZY | TTCN_AT_FUZZY)? Type Identifier (TTCN_ASSIGN ( Expression | TTCN_SUB ))?
  static boolean FormalValuePar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalValuePar")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FormalValuePar_0(b, l + 1);
    r = r && FormalValuePar_1(b, l + 1);
    r = r && Type(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && FormalValuePar_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( InParKeyword | InOutParKeyword | OutParKeyword )?
  private static boolean FormalValuePar_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalValuePar_0")) return false;
    FormalValuePar_0_0(b, l + 1);
    return true;
  }

  // InParKeyword | InOutParKeyword | OutParKeyword
  private static boolean FormalValuePar_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalValuePar_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InParKeyword(b, l + 1);
    if (!r) r = InOutParKeyword(b, l + 1);
    if (!r) r = OutParKeyword(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TTCN_AT_LAZY | TTCN_AT_FUZZY)?
  private static boolean FormalValuePar_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalValuePar_1")) return false;
    FormalValuePar_1_0(b, l + 1);
    return true;
  }

  // TTCN_AT_LAZY | TTCN_AT_FUZZY
  private static boolean FormalValuePar_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalValuePar_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_AT_LAZY);
    if (!r) r = consumeToken(b, TTCN_AT_FUZZY);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TTCN_ASSIGN ( Expression | TTCN_SUB ))?
  private static boolean FormalValuePar_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalValuePar_4")) return false;
    FormalValuePar_4_0(b, l + 1);
    return true;
  }

  // TTCN_ASSIGN ( Expression | TTCN_SUB )
  private static boolean FormalValuePar_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalValuePar_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_ASSIGN);
    r = r && FormalValuePar_4_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression | TTCN_SUB
  private static boolean FormalValuePar_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalValuePar_4_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_SUB);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ExtendedAlphaNum
  public static boolean FreeText(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FreeText")) return false;
    if (!nextTokenIs(b, TTCN_STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExtendedAlphaNum(b, l + 1);
    exit_section_(b, m, FREE_TEXT, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_FRIEND TTCN_MODULE IdentifierList TTCN_SEMI?
  public static boolean FriendModuleDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FriendModuleDef")) return false;
    if (!nextTokenIs(b, TTCN_FRIEND)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_FRIEND, TTCN_MODULE);
    r = r && IdentifierList(b, l + 1);
    r = r && FriendModuleDef_3(b, l + 1);
    exit_section_(b, m, FRIEND_MODULE_DEF, r);
    return r;
  }

  // TTCN_SEMI?
  private static boolean FriendModuleDef_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FriendModuleDef_3")) return false;
    consumeToken(b, TTCN_SEMI);
    return true;
  }

  /* ********************************************************** */
  // TTCN_FROM ( InLineTemplate | AddressRefList | TTCN_ANY TTCN_COMPONENT )
  public static boolean FromClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FromClause")) return false;
    if (!nextTokenIs(b, TTCN_FROM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_FROM);
    r = r && FromClause_1(b, l + 1);
    exit_section_(b, m, FROM_CLAUSE, r);
    return r;
  }

  // InLineTemplate | AddressRefList | TTCN_ANY TTCN_COMPONENT
  private static boolean FromClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FromClause_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InLineTemplate(b, l + 1);
    if (!r) r = AddressRefList(b, l + 1);
    if (!r) r = parseTokens(b, 0, TTCN_ANY, TTCN_COMPONENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FromClause (TTCN_POINT_TO ( ( SenderSpec IndexSpec? ) | IndexSpec ) )?
  public static boolean FromClausePresent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FromClausePresent")) return false;
    if (!nextTokenIs(b, TTCN_FROM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FromClause(b, l + 1);
    r = r && FromClausePresent_1(b, l + 1);
    exit_section_(b, m, FROM_CLAUSE_PRESENT, r);
    return r;
  }

  // (TTCN_POINT_TO ( ( SenderSpec IndexSpec? ) | IndexSpec ) )?
  private static boolean FromClausePresent_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FromClausePresent_1")) return false;
    FromClausePresent_1_0(b, l + 1);
    return true;
  }

  // TTCN_POINT_TO ( ( SenderSpec IndexSpec? ) | IndexSpec )
  private static boolean FromClausePresent_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FromClausePresent_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_POINT_TO);
    r = r && FromClausePresent_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( SenderSpec IndexSpec? ) | IndexSpec
  private static boolean FromClausePresent_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FromClausePresent_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FromClausePresent_1_0_1_0(b, l + 1);
    if (!r) r = IndexSpec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SenderSpec IndexSpec?
  private static boolean FromClausePresent_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FromClausePresent_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SenderSpec(b, l + 1);
    r = r && FromClausePresent_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IndexSpec?
  private static boolean FromClausePresent_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FromClausePresent_1_0_1_0_1")) return false;
    IndexSpec(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // FunctionActualParAssignment ( TTCN_COMMA FunctionActualParAssignment )*
  static boolean FunctionActAssignlist(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionActAssignlist")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionActualParAssignment(b, l + 1);
    r = r && FunctionActAssignlist_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_COMMA FunctionActualParAssignment )*
  private static boolean FunctionActAssignlist_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionActAssignlist_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!FunctionActAssignlist_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionActAssignlist_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA FunctionActualParAssignment
  private static boolean FunctionActAssignlist_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionActAssignlist_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && FunctionActualParAssignment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FunctionActualPar ( TTCN_COMMA FunctionActualPar )*
  static boolean FunctionActlist(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionActlist")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionActualPar(b, l + 1);
    r = r && FunctionActlist_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_COMMA FunctionActualPar )*
  private static boolean FunctionActlist_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionActlist_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!FunctionActlist_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionActlist_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA FunctionActualPar
  private static boolean FunctionActlist_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionActlist_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && FunctionActualPar(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ArrayIdentifierRef | InLineTemplate | ComponentRef | TTCN_SUB
  static boolean FunctionActualPar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionActualPar")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArrayIdentifierRef(b, l + 1);
    if (!r) r = InLineTemplate(b, l + 1);
    if (!r) r = ComponentRef(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_SUB);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TemplateInstanceAssignment | ComponentRefAssignment | ArrayIdentifierRefAssignment
  static boolean FunctionActualParAssignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionActualParAssignment")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateInstanceAssignment(b, l + 1);
    if (!r) r = ComponentRefAssignment(b, l + 1);
    if (!r) r = ArrayIdentifierRefAssignment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FunctionActlist | FunctionActAssignlist
  static boolean FunctionActualParList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionActualParList")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionActlist(b, l + 1);
    if (!r) r = FunctionActAssignlist(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_FUNCTIOIN TTCN_AT_DETERMINISTIC? Identifier TTCN_LP FunctionFormalParList? TTCN_RP RunsOnSpec? MtcSpec? SystemSpec? ReturnType? StatementBlock
  public static boolean FunctionDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDef")) return false;
    if (!nextTokenIs(b, TTCN_FUNCTIOIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_FUNCTIOIN);
    r = r && FunctionDef_1(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, TTCN_LP);
    r = r && FunctionDef_4(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    r = r && FunctionDef_6(b, l + 1);
    r = r && FunctionDef_7(b, l + 1);
    r = r && FunctionDef_8(b, l + 1);
    r = r && FunctionDef_9(b, l + 1);
    r = r && StatementBlock(b, l + 1);
    exit_section_(b, m, FUNCTION_DEF, r);
    return r;
  }

  // TTCN_AT_DETERMINISTIC?
  private static boolean FunctionDef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDef_1")) return false;
    consumeToken(b, TTCN_AT_DETERMINISTIC);
    return true;
  }

  // FunctionFormalParList?
  private static boolean FunctionDef_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDef_4")) return false;
    FunctionFormalParList(b, l + 1);
    return true;
  }

  // RunsOnSpec?
  private static boolean FunctionDef_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDef_6")) return false;
    RunsOnSpec(b, l + 1);
    return true;
  }

  // MtcSpec?
  private static boolean FunctionDef_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDef_7")) return false;
    MtcSpec(b, l + 1);
    return true;
  }

  // SystemSpec?
  private static boolean FunctionDef_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDef_8")) return false;
    SystemSpec(b, l + 1);
    return true;
  }

  // ReturnType?
  private static boolean FunctionDef_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDef_9")) return false;
    ReturnType(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ( FunctionLocalDef | FunctionLocalInst ) WithStatement? TTCN_SEMI?
  static boolean FunctionDefList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefList")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionDefList_0(b, l + 1);
    r = r && FunctionDefList_1(b, l + 1);
    r = r && FunctionDefList_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // FunctionLocalDef | FunctionLocalInst
  private static boolean FunctionDefList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionLocalDef(b, l + 1);
    if (!r) r = FunctionLocalInst(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WithStatement?
  private static boolean FunctionDefList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefList_1")) return false;
    WithStatement(b, l + 1);
    return true;
  }

  // TTCN_SEMI?
  private static boolean FunctionDefList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefList_2")) return false;
    consumeToken(b, TTCN_SEMI);
    return true;
  }

  /* ********************************************************** */
  // FormalValuePar | FormalTimerPar | FormalTemplatePar | FormalPortPar
  static boolean FunctionFormalPar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionFormalPar")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FormalValuePar(b, l + 1);
    if (!r) r = FormalTimerPar(b, l + 1);
    if (!r) r = FormalTemplatePar(b, l + 1);
    if (!r) r = FormalPortPar(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FunctionFormalPar ( TTCN_COMMA FunctionFormalPar )*
  public static boolean FunctionFormalParList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionFormalParList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<function formal par list>");
    r = FunctionFormalPar(b, l + 1);
    r = r && FunctionFormalParList_1(b, l + 1);
    exit_section_(b, l, m, FUNCTION_FORMAL_PAR_LIST, r, false, null);
    return r;
  }

  // ( TTCN_COMMA FunctionFormalPar )*
  private static boolean FunctionFormalParList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionFormalParList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!FunctionFormalParList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionFormalParList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA FunctionFormalPar
  private static boolean FunctionFormalParList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionFormalParList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && FunctionFormalPar(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FunctionRef TTCN_LP FunctionActualParList? TTCN_RP
  public static boolean FunctionInstance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionInstance")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionRef(b, l + 1);
    r = r && consumeToken(b, TTCN_LP);
    r = r && FunctionInstance_2(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, FUNCTION_INSTANCE, r);
    return r;
  }

  // FunctionActualParList?
  private static boolean FunctionInstance_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionInstance_2")) return false;
    FunctionActualParList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ConstDef | TemplateDef
  static boolean FunctionLocalDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionLocalDef")) return false;
    if (!nextTokenIs(b, "", TTCN_CONST, TTCN_TEMPLATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConstDef(b, l + 1);
    if (!r) r = TemplateDef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VarInstance | TimerInstance
  static boolean FunctionLocalInst(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionLocalInst")) return false;
    if (!nextTokenIs(b, "", TTCN_TIMER, TTCN_VAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VarInstance(b, l + 1);
    if (!r) r = TimerInstance(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (Identifier TTCN_DOT)? Identifier
  public static boolean FunctionRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionRef")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionRef_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, FUNCTION_REF, r);
    return r;
  }

  // (Identifier TTCN_DOT)?
  private static boolean FunctionRef_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionRef_0")) return false;
    FunctionRef_0_0(b, l + 1);
    return true;
  }

  // Identifier TTCN_DOT
  private static boolean FunctionRef_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionRef_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, TTCN_DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ConfigurationStatements | TimerStatements | CommunicationStatements | BasicStatements | BehaviourStatements | SetLocalVerdict | SUTStatements | TestcaseOperation
  public static boolean FunctionStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<function statement>");
    r = ConfigurationStatements(b, l + 1);
    if (!r) r = TimerStatements(b, l + 1);
    if (!r) r = CommunicationStatements(b, l + 1);
    if (!r) r = BasicStatements(b, l + 1);
    if (!r) r = BehaviourStatements(b, l + 1);
    if (!r) r = SetLocalVerdict(b, l + 1);
    if (!r) r = SUTStatements(b, l + 1);
    if (!r) r = TestcaseOperation(b, l + 1);
    exit_section_(b, l, m, FUNCTION_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FunctionStatement TTCN_SEMI?
  static boolean FunctionStatementList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionStatementList")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionStatement(b, l + 1);
    r = r && FunctionStatementList_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_SEMI?
  private static boolean FunctionStatementList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionStatementList_1")) return false;
    consumeToken(b, TTCN_SEMI);
    return true;
  }

  /* ********************************************************** */
  // PortOrAny TTCN_DOT PortGetCallOp
  public static boolean GetCallStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GetCallStatement")) return false;
    if (!nextTokenIs(b, "<get call statement>", TTCN_ANY, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<get call statement>");
    r = PortOrAny(b, l + 1);
    r = r && consumeToken(b, TTCN_DOT);
    r = r && PortGetCallOp(b, l + 1);
    exit_section_(b, l, m, GET_CALL_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PortOrAny TTCN_DOT PortGetReplyOp
  public static boolean GetReplyStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GetReplyStatement")) return false;
    if (!nextTokenIs(b, "<get reply statement>", TTCN_ANY, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<get reply statement>");
    r = PortOrAny(b, l + 1);
    r = r && consumeToken(b, TTCN_DOT);
    r = r && PortGetReplyOp(b, l + 1);
    exit_section_(b, l, m, GET_REPLY_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_GOTO Identifier
  public static boolean GotoStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GotoStatement")) return false;
    if (!nextTokenIs(b, TTCN_GOTO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_GOTO);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, GOTO_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_GROUP Identifier TTCN_LB ModuleDefinitionsList? TTCN_RB
  public static boolean GroupDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GroupDef")) return false;
    if (!nextTokenIs(b, TTCN_GROUP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_GROUP);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, TTCN_LB);
    r = r && GroupDef_3(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, GROUP_DEF, r);
    return r;
  }

  // ModuleDefinitionsList?
  private static boolean GroupDef_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GroupDef_3")) return false;
    ModuleDefinitionsList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // QualifiedIdentifierWithExcept ( TTCN_COMMA QualifiedIdentifierWithExcept )*
  public static boolean GroupRefListWithExcept(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GroupRefListWithExcept")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedIdentifierWithExcept(b, l + 1);
    r = r && GroupRefListWithExcept_1(b, l + 1);
    exit_section_(b, m, GROUP_REF_LIST_WITH_EXCEPT, r);
    return r;
  }

  // ( TTCN_COMMA QualifiedIdentifierWithExcept )*
  private static boolean GroupRefListWithExcept_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GroupRefListWithExcept_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!GroupRefListWithExcept_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "GroupRefListWithExcept_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA QualifiedIdentifierWithExcept
  private static boolean GroupRefListWithExcept_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GroupRefListWithExcept_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && QualifiedIdentifierWithExcept(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TimeoutStatement | ReceiveStatement | TriggerStatement | GetCallStatement | CatchStatement | CheckStatement | GetReplyStatement | DoneStatement | KilledStatement
  public static boolean GuardOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GuardOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<guard op>");
    r = TimeoutStatement(b, l + 1);
    if (!r) r = ReceiveStatement(b, l + 1);
    if (!r) r = TriggerStatement(b, l + 1);
    if (!r) r = GetCallStatement(b, l + 1);
    if (!r) r = CatchStatement(b, l + 1);
    if (!r) r = CheckStatement(b, l + 1);
    if (!r) r = GetReplyStatement(b, l + 1);
    if (!r) r = DoneStatement(b, l + 1);
    if (!r) r = KilledStatement(b, l + 1);
    exit_section_(b, l, m, GUARD_OP, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AltGuardChar ( AltstepInstance StatementBlock? | GuardOp StatementBlock )
  public static boolean GuardStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GuardStatement")) return false;
    if (!nextTokenIs(b, TTCN_LM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AltGuardChar(b, l + 1);
    r = r && GuardStatement_1(b, l + 1);
    exit_section_(b, m, GUARD_STATEMENT, r);
    return r;
  }

  // AltstepInstance StatementBlock? | GuardOp StatementBlock
  private static boolean GuardStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GuardStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GuardStatement_1_0(b, l + 1);
    if (!r) r = GuardStatement_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AltstepInstance StatementBlock?
  private static boolean GuardStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GuardStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AltstepInstance(b, l + 1);
    r = r && GuardStatement_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // StatementBlock?
  private static boolean GuardStatement_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GuardStatement_1_0_1")) return false;
    StatementBlock(b, l + 1);
    return true;
  }

  // GuardOp StatementBlock
  private static boolean GuardStatement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GuardStatement_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GuardOp(b, l + 1);
    r = r && StatementBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PortOrAll TTCN_DOT TTCN_HALT
  public static boolean HaltStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HaltStatement")) return false;
    if (!nextTokenIs(b, "<halt statement>", TTCN_ALL, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<halt statement>");
    r = PortOrAll(b, l + 1);
    r = r && consumeTokens(b, 0, TTCN_DOT, TTCN_HALT);
    exit_section_(b, l, m, HALT_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_HEX
  static boolean Hex(PsiBuilder b, int l) {
    return consumeToken(b, TTCN_HEX);
  }

  /* ********************************************************** */
  // Hex | TTCN_QUESTION | TTCN_MUL
  public static boolean HexOrMatch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HexOrMatch")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<hex or match>");
    r = Hex(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_QUESTION);
    if (!r) r = consumeToken(b, TTCN_MUL);
    exit_section_(b, l, m, HEX_OR_MATCH, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_HEXSTRING
  static boolean HexStringKeyword(PsiBuilder b, int l) {
    return consumeToken(b, TTCN_HEXSTRING);
  }

  /* ********************************************************** */
  // "'" HexOrMatch* "'" "H"
  public static boolean HexStringMatch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HexStringMatch")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<hex string match>");
    r = consumeToken(b, "'");
    r = r && HexStringMatch_1(b, l + 1);
    r = r && consumeToken(b, "'");
    r = r && consumeToken(b, "H");
    exit_section_(b, l, m, HEX_STRING_MATCH, r, false, null);
    return r;
  }

  // HexOrMatch*
  private static boolean HexStringMatch_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HexStringMatch_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!HexOrMatch(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "HexStringMatch_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // TTCN_HSTRING
  static boolean Hstring(PsiBuilder b, int l) {
    return consumeToken(b, TTCN_HSTRING);
  }

  /* ********************************************************** */
  // TTCN_ID
  static boolean Identifier(PsiBuilder b, int l) {
    return consumeToken(b, TTCN_ID);
  }

  /* ********************************************************** */
  // Identifier ( TTCN_COMMA Identifier )
  public static boolean IdentifierList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierList")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && IdentifierList_1(b, l + 1);
    exit_section_(b, m, IDENTIFIER_LIST, r);
    return r;
  }

  // TTCN_COMMA Identifier
  private static boolean IdentifierList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierList_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IdentifierList | TTCN_ALL
  public static boolean IdentifierListOrAll(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierListOrAll")) return false;
    if (!nextTokenIs(b, "<identifier list or all>", TTCN_ALL, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<identifier list or all>");
    r = IdentifierList(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_ALL);
    exit_section_(b, l, m, IDENTIFIER_LIST_OR_ALL, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IdentifierList | AllWithExcept
  public static boolean IdentifierListOrAllWithExcept(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierListOrAllWithExcept")) return false;
    if (!nextTokenIs(b, "<identifier list or all with except>", TTCN_ALL, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<identifier list or all with except>");
    r = IdentifierList(b, l + 1);
    if (!r) r = AllWithExcept(b, l + 1);
    exit_section_(b, l, m, IDENTIFIER_LIST_OR_ALL_WITH_EXCEPT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_ALTSTEP IdentifierListOrAllWithExcept
  public static boolean ImportAltstepSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportAltstepSpec")) return false;
    if (!nextTokenIs(b, TTCN_ALTSTEP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_ALTSTEP);
    r = r && IdentifierListOrAllWithExcept(b, l + 1);
    exit_section_(b, m, IMPORT_ALTSTEP_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_CONST IdentifierListOrAllWithExcept
  public static boolean ImportConstSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportConstSpec")) return false;
    if (!nextTokenIs(b, TTCN_CONST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_CONST);
    r = r && IdentifierListOrAllWithExcept(b, l + 1);
    exit_section_(b, m, IMPORT_CONST_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // AllWithExcepts | ImportSpecContent
  public static boolean ImportContent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportContent")) return false;
    if (!nextTokenIs(b, "<import content>", TTCN_ALL, TTCN_LB)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<import content>");
    r = AllWithExcepts(b, l + 1);
    if (!r) r = ImportSpecContent(b, l + 1);
    exit_section_(b, l, m, IMPORT_CONTENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_IMPORT ImportFromSpec ImportContent
  public static boolean ImportDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDef")) return false;
    if (!nextTokenIs(b, TTCN_IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_IMPORT);
    r = r && ImportFromSpec(b, l + 1);
    r = r && ImportContent(b, l + 1);
    exit_section_(b, m, IMPORT_DEF, r);
    return r;
  }

  /* ********************************************************** */
  // ImportGroupSpec | ImportTypeDefSpec | ImportTemplateSpec | ImportConstSpec | ImportTestcaseSpec | ImportAltstepSpec | ImportFunctionSpec | ImportSignatureSpec | ImportModuleParSpec | ImportImportSpec
  public static boolean ImportElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportElement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<import element>");
    r = ImportGroupSpec(b, l + 1);
    if (!r) r = ImportTypeDefSpec(b, l + 1);
    if (!r) r = ImportTemplateSpec(b, l + 1);
    if (!r) r = ImportConstSpec(b, l + 1);
    if (!r) r = ImportTestcaseSpec(b, l + 1);
    if (!r) r = ImportAltstepSpec(b, l + 1);
    if (!r) r = ImportFunctionSpec(b, l + 1);
    if (!r) r = ImportSignatureSpec(b, l + 1);
    if (!r) r = ImportModuleParSpec(b, l + 1);
    if (!r) r = ImportImportSpec(b, l + 1);
    exit_section_(b, l, m, IMPORT_ELEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_FROM ModuleId TTCN_RECURSIVE?
  public static boolean ImportFromSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportFromSpec")) return false;
    if (!nextTokenIs(b, TTCN_FROM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_FROM);
    r = r && ModuleId(b, l + 1);
    r = r && ImportFromSpec_2(b, l + 1);
    exit_section_(b, m, IMPORT_FROM_SPEC, r);
    return r;
  }

  // TTCN_RECURSIVE?
  private static boolean ImportFromSpec_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportFromSpec_2")) return false;
    consumeToken(b, TTCN_RECURSIVE);
    return true;
  }

  /* ********************************************************** */
  // TTCN_FUNCTIOIN IdentifierListOrAllWithExcept
  public static boolean ImportFunctionSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportFunctionSpec")) return false;
    if (!nextTokenIs(b, TTCN_FUNCTIOIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_FUNCTIOIN);
    r = r && IdentifierListOrAllWithExcept(b, l + 1);
    exit_section_(b, m, IMPORT_FUNCTION_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_GROUP ( GroupRefListWithExcept | AllGroupsWithExcept )
  public static boolean ImportGroupSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportGroupSpec")) return false;
    if (!nextTokenIs(b, TTCN_GROUP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_GROUP);
    r = r && ImportGroupSpec_1(b, l + 1);
    exit_section_(b, m, IMPORT_GROUP_SPEC, r);
    return r;
  }

  // GroupRefListWithExcept | AllGroupsWithExcept
  private static boolean ImportGroupSpec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportGroupSpec_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GroupRefListWithExcept(b, l + 1);
    if (!r) r = AllGroupsWithExcept(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_IMPORT TTCN_ALL
  public static boolean ImportImportSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportImportSpec")) return false;
    if (!nextTokenIs(b, TTCN_IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_IMPORT, TTCN_ALL);
    exit_section_(b, m, IMPORT_IMPORT_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_MODULEPAR IdentifierListOrAllWithExcept
  public static boolean ImportModuleParSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportModuleParSpec")) return false;
    if (!nextTokenIs(b, TTCN_MODULEPAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_MODULEPAR);
    r = r && IdentifierListOrAllWithExcept(b, l + 1);
    exit_section_(b, m, IMPORT_MODULE_PAR_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_SIGNATURE IdentifierListOrAllWithExcept
  public static boolean ImportSignatureSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportSignatureSpec")) return false;
    if (!nextTokenIs(b, TTCN_SIGNATURE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_SIGNATURE);
    r = r && IdentifierListOrAllWithExcept(b, l + 1);
    exit_section_(b, m, IMPORT_SIGNATURE_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // ImportElement TTCN_SEMI?
  public static boolean ImportSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportSpec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<import spec>");
    r = ImportElement(b, l + 1);
    r = r && ImportSpec_1(b, l + 1);
    exit_section_(b, l, m, IMPORT_SPEC, r, false, null);
    return r;
  }

  // TTCN_SEMI?
  private static boolean ImportSpec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportSpec_1")) return false;
    consumeToken(b, TTCN_SEMI);
    return true;
  }

  /* ********************************************************** */
  // TTCN_LB ImportSpec* TTCN_RB
  public static boolean ImportSpecContent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportSpecContent")) return false;
    if (!nextTokenIs(b, TTCN_LB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LB);
    r = r && ImportSpecContent_1(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, IMPORT_SPEC_CONTENT, r);
    return r;
  }

  // ImportSpec*
  private static boolean ImportSpecContent_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportSpecContent_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ImportSpec(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ImportSpecContent_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // TTCN_TEMPLATE IdentifierListOrAllWithExcept
  public static boolean ImportTemplateSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportTemplateSpec")) return false;
    if (!nextTokenIs(b, TTCN_TEMPLATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_TEMPLATE);
    r = r && IdentifierListOrAllWithExcept(b, l + 1);
    exit_section_(b, m, IMPORT_TEMPLATE_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_TESTCASE IdentifierListOrAllWithExcept
  public static boolean ImportTestcaseSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportTestcaseSpec")) return false;
    if (!nextTokenIs(b, TTCN_TESTCASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_TESTCASE);
    r = r && IdentifierListOrAllWithExcept(b, l + 1);
    exit_section_(b, m, IMPORT_TESTCASE_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_TYPE IdentifierListOrAllWithExcept
  public static boolean ImportTypeDefSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportTypeDefSpec")) return false;
    if (!nextTokenIs(b, TTCN_TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_TYPE);
    r = r && IdentifierListOrAllWithExcept(b, l + 1);
    exit_section_(b, m, IMPORT_TYPE_DEF_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // ( ( Type | Signature ) TTCN_COLON )? ( DerivedRefWithParList TTCN_ASSIGN)? TemplateBody
  static boolean InLineTemplate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InLineTemplate")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InLineTemplate_0(b, l + 1);
    r = r && InLineTemplate_1(b, l + 1);
    r = r && TemplateBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( Type | Signature ) TTCN_COLON )?
  private static boolean InLineTemplate_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InLineTemplate_0")) return false;
    InLineTemplate_0_0(b, l + 1);
    return true;
  }

  // ( Type | Signature ) TTCN_COLON
  private static boolean InLineTemplate_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InLineTemplate_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InLineTemplate_0_0_0(b, l + 1);
    r = r && consumeToken(b, TTCN_COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // Type | Signature
  private static boolean InLineTemplate_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InLineTemplate_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Type(b, l + 1);
    if (!r) r = Signature(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( DerivedRefWithParList TTCN_ASSIGN)?
  private static boolean InLineTemplate_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InLineTemplate_1")) return false;
    InLineTemplate_1_0(b, l + 1);
    return true;
  }

  // DerivedRefWithParList TTCN_ASSIGN
  private static boolean InLineTemplate_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InLineTemplate_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DerivedRefWithParList(b, l + 1);
    r = r && consumeToken(b, TTCN_ASSIGN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_INOUT
  static boolean InOutParKeyword(PsiBuilder b, int l) {
    return consumeToken(b, TTCN_INOUT);
  }

  /* ********************************************************** */
  // TTCN_IN
  static boolean InParKeyword(PsiBuilder b, int l) {
    return consumeToken(b, TTCN_IN);
  }

  /* ********************************************************** */
  // TTCN_POINT_TO IndexSpec
  public static boolean IndexAssignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexAssignment")) return false;
    if (!nextTokenIs(b, TTCN_POINT_TO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_POINT_TO);
    r = r && IndexSpec(b, l + 1);
    exit_section_(b, m, INDEX_ASSIGNMENT, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_AT_INDEX TTCN_VALUE VariableRef
  public static boolean IndexSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexSpec")) return false;
    if (!nextTokenIs(b, TTCN_AT_INDEX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_AT_INDEX, TTCN_VALUE);
    r = r && VariableRef(b, l + 1);
    exit_section_(b, m, INDEX_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // VarInstance | Assignment
  public static boolean Initial(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Initial")) return false;
    if (!nextTokenIs(b, "<initial>", TTCN_ID, TTCN_VAR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<initial>");
    r = VarInstance(b, l + 1);
    if (!r) r = Assignment(b, l + 1);
    exit_section_(b, l, m, INITIAL, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_INTEGER
  static boolean IntegerKeyword(PsiBuilder b, int l) {
    return consumeToken(b, TTCN_INTEGER);
  }

  /* ********************************************************** */
  // TTCN_INTERLEAVE TTCN_LB InterleavedGuardList TTCN_RB
  public static boolean InterleavedConstruct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterleavedConstruct")) return false;
    if (!nextTokenIs(b, TTCN_INTERLEAVE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_INTERLEAVE, TTCN_LB);
    r = r && InterleavedGuardList(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, INTERLEAVED_CONSTRUCT, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_LM TTCN_RM GuardOp
  public static boolean InterleavedGuard(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterleavedGuard")) return false;
    if (!nextTokenIs(b, TTCN_LM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_LM, TTCN_RM);
    r = r && GuardOp(b, l + 1);
    exit_section_(b, m, INTERLEAVED_GUARD, r);
    return r;
  }

  /* ********************************************************** */
  // InterleavedGuard StatementBlock
  public static boolean InterleavedGuardElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterleavedGuardElement")) return false;
    if (!nextTokenIs(b, TTCN_LM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InterleavedGuard(b, l + 1);
    r = r && StatementBlock(b, l + 1);
    exit_section_(b, m, INTERLEAVED_GUARD_ELEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // (InterleavedGuardElement TTCN_SEMI?)+
  public static boolean InterleavedGuardList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterleavedGuardList")) return false;
    if (!nextTokenIs(b, TTCN_LM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InterleavedGuardList_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!InterleavedGuardList_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "InterleavedGuardList", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, INTERLEAVED_GUARD_LIST, r);
    return r;
  }

  // InterleavedGuardElement TTCN_SEMI?
  private static boolean InterleavedGuardList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterleavedGuardList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InterleavedGuardElement(b, l + 1);
    r = r && InterleavedGuardList_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_SEMI?
  private static boolean InterleavedGuardList_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterleavedGuardList_0_1")) return false;
    consumeToken(b, TTCN_SEMI);
    return true;
  }

  /* ********************************************************** */
  // TTCN_KILL | ( ( ComponentReferenceOrLiteral | TTCN_ALL TTCN_COMPONENT ) TTCN_DOT TTCN_KILL )
  public static boolean KillTCStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KillTCStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<kill tc statement>");
    r = consumeToken(b, TTCN_KILL);
    if (!r) r = KillTCStatement_1(b, l + 1);
    exit_section_(b, l, m, KILL_TC_STATEMENT, r, false, null);
    return r;
  }

  // ( ComponentReferenceOrLiteral | TTCN_ALL TTCN_COMPONENT ) TTCN_DOT TTCN_KILL
  private static boolean KillTCStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KillTCStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = KillTCStatement_1_0(b, l + 1);
    r = r && consumeTokens(b, 0, TTCN_DOT, TTCN_KILL);
    exit_section_(b, m, null, r);
    return r;
  }

  // ComponentReferenceOrLiteral | TTCN_ALL TTCN_COMPONENT
  private static boolean KillTCStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KillTCStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ComponentReferenceOrLiteral(b, l + 1);
    if (!r) r = parseTokens(b, 0, TTCN_ALL, TTCN_COMPONENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ComponentOrAny TTCN_DOT TTCN_KILLED IndexAssignment?
  public static boolean KilledStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KilledStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<killed statement>");
    r = ComponentOrAny(b, l + 1);
    r = r && consumeTokens(b, 0, TTCN_DOT, TTCN_KILLED);
    r = r && KilledStatement_3(b, l + 1);
    exit_section_(b, l, m, KILLED_STATEMENT, r, false, null);
    return r;
  }

  // IndexAssignment?
  private static boolean KilledStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KilledStatement_3")) return false;
    IndexAssignment(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TTCN_LABEL Identifier
  public static boolean LabelStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelStatement")) return false;
    if (!nextTokenIs(b, TTCN_LABEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LABEL);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, LABEL_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_LANGUAGE FreeText (TTCN_COMMA FreeText)*
  static boolean LanguageSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LanguageSpec")) return false;
    if (!nextTokenIs(b, TTCN_LANGUAGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LANGUAGE);
    r = r && FreeText(b, l + 1);
    r = r && LanguageSpec_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TTCN_COMMA FreeText)*
  private static boolean LanguageSpec_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LanguageSpec_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!LanguageSpec_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LanguageSpec_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA FreeText
  private static boolean LanguageSpec_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LanguageSpec_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && FreeText(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_LP TemplateListItem (TTCN_COMMA TemplateListItem)* TTCN_RP
  public static boolean ListOfTemplates(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListOfTemplates")) return false;
    if (!nextTokenIs(b, TTCN_LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LP);
    r = r && TemplateListItem(b, l + 1);
    r = r && ListOfTemplates_2(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, LIST_OF_TEMPLATES, r);
    return r;
  }

  // (TTCN_COMMA TemplateListItem)*
  private static boolean ListOfTemplates_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListOfTemplates_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ListOfTemplates_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ListOfTemplates_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA TemplateListItem
  private static boolean ListOfTemplates_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListOfTemplates_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && TemplateListItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FreeText | InLineTemplate
  public static boolean LogItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<log item>");
    r = FreeText(b, l + 1);
    if (!r) r = InLineTemplate(b, l + 1);
    exit_section_(b, l, m, LOG_ITEM, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_LOG TTCN_LP LogItem (TTCN_COMMA LogItem)* TTCN_RP
  public static boolean LogStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogStatement")) return false;
    if (!nextTokenIs(b, TTCN_LOG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_LOG, TTCN_LP);
    r = r && LogItem(b, l + 1);
    r = r && LogStatement_3(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, LOG_STATEMENT, r);
    return r;
  }

  // (TTCN_COMMA LogItem)*
  private static boolean LogStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogStatement_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!LogStatement_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LogStatement_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA LogItem
  private static boolean LogStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && LogItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ForStatement | WhileStatement | DoWhileStatement
  public static boolean LoopConstruct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoopConstruct")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<loop construct>");
    r = ForStatement(b, l + 1);
    if (!r) r = WhileStatement(b, l + 1);
    if (!r) r = DoWhileStatement(b, l + 1);
    exit_section_(b, l, m, LOOP_CONSTRUCT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_MAP TTCN_PARAM TTCN_LP FormalValuePar (TTCN_COMMA FormalValuePar)* TTCN_RP
  public static boolean MapParamDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapParamDef")) return false;
    if (!nextTokenIs(b, TTCN_MAP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_MAP, TTCN_PARAM, TTCN_LP);
    r = r && FormalValuePar(b, l + 1);
    r = r && MapParamDef_4(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, MAP_PARAM_DEF, r);
    return r;
  }

  // (TTCN_COMMA FormalValuePar)*
  private static boolean MapParamDef_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapParamDef_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!MapParamDef_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MapParamDef_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA FormalValuePar
  private static boolean MapParamDef_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapParamDef_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && FormalValuePar(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_MAP SingleConnectionSpec ParamClause?
  public static boolean MapStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapStatement")) return false;
    if (!nextTokenIs(b, TTCN_MAP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_MAP);
    r = r && SingleConnectionSpec(b, l + 1);
    r = r && MapStatement_2(b, l + 1);
    exit_section_(b, m, MAP_STATEMENT, r);
    return r;
  }

  // ParamClause?
  private static boolean MapStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapStatement_2")) return false;
    ParamClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TTCN_MATCH TTCN_LP Expression TTCN_COMMA InLineTemplate TTCN_RP
  public static boolean MatchOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchOp")) return false;
    if (!nextTokenIs(b, TTCN_MATCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_MATCH, TTCN_LP);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, TTCN_COMMA);
    r = r && InLineTemplate(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, MATCH_OP, r);
    return r;
  }

  /* ********************************************************** */
  // Complement | ( TTCN_QUESTION WildcardLengthMatch? ) | ( TTCN_MUL WildcardLengthMatch? ) | ListOfTemplates | Range | BitStringMatch | HexStringMatch | OctetStringMatch | CharStringMatch | SubsetMatch | SupersetMatch
  public static boolean MatchingSymbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchingSymbol")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<matching symbol>");
    r = Complement(b, l + 1);
    if (!r) r = MatchingSymbol_1(b, l + 1);
    if (!r) r = MatchingSymbol_2(b, l + 1);
    if (!r) r = ListOfTemplates(b, l + 1);
    if (!r) r = Range(b, l + 1);
    if (!r) r = BitStringMatch(b, l + 1);
    if (!r) r = HexStringMatch(b, l + 1);
    if (!r) r = OctetStringMatch(b, l + 1);
    if (!r) r = CharStringMatch(b, l + 1);
    if (!r) r = SubsetMatch(b, l + 1);
    if (!r) r = SupersetMatch(b, l + 1);
    exit_section_(b, l, m, MATCHING_SYMBOL, r, false, null);
    return r;
  }

  // TTCN_QUESTION WildcardLengthMatch?
  private static boolean MatchingSymbol_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchingSymbol_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_QUESTION);
    r = r && MatchingSymbol_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WildcardLengthMatch?
  private static boolean MatchingSymbol_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchingSymbol_1_1")) return false;
    WildcardLengthMatch(b, l + 1);
    return true;
  }

  // TTCN_MUL WildcardLengthMatch?
  private static boolean MatchingSymbol_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchingSymbol_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_MUL);
    r = r && MatchingSymbol_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WildcardLengthMatch?
  private static boolean MatchingSymbol_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchingSymbol_2_1")) return false;
    WildcardLengthMatch(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TTCN_MESSAGE TTCN_LB ( ( AddressDecl | MessageList | ConfigParamDef ) TTCN_SEMI? )+ TTCN_RB
  public static boolean MessageAttribs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MessageAttribs")) return false;
    if (!nextTokenIs(b, TTCN_MESSAGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_MESSAGE, TTCN_LB);
    r = r && MessageAttribs_2(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, MESSAGE_ATTRIBS, r);
    return r;
  }

  // ( ( AddressDecl | MessageList | ConfigParamDef ) TTCN_SEMI? )+
  private static boolean MessageAttribs_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MessageAttribs_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MessageAttribs_2_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!MessageAttribs_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MessageAttribs_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( AddressDecl | MessageList | ConfigParamDef ) TTCN_SEMI?
  private static boolean MessageAttribs_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MessageAttribs_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MessageAttribs_2_0_0(b, l + 1);
    r = r && MessageAttribs_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AddressDecl | MessageList | ConfigParamDef
  private static boolean MessageAttribs_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MessageAttribs_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AddressDecl(b, l + 1);
    if (!r) r = MessageList(b, l + 1);
    if (!r) r = ConfigParamDef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_SEMI?
  private static boolean MessageAttribs_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MessageAttribs_2_0_1")) return false;
    consumeToken(b, TTCN_SEMI);
    return true;
  }

  /* ********************************************************** */
  // Direction AllOrTypeList
  public static boolean MessageList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MessageList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<message list>");
    r = Direction(b, l + 1);
    r = r && AllOrTypeList(b, l + 1);
    exit_section_(b, l, m, MESSAGE_LIST, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_MIXED TTCN_LB (( AddressDecl | MixedList | ConfigParamDef ) TTCN_SEMI? )+ TTCN_RB
  public static boolean MixedAttribs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MixedAttribs")) return false;
    if (!nextTokenIs(b, TTCN_MIXED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_MIXED, TTCN_LB);
    r = r && MixedAttribs_2(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, MIXED_ATTRIBS, r);
    return r;
  }

  // (( AddressDecl | MixedList | ConfigParamDef ) TTCN_SEMI? )+
  private static boolean MixedAttribs_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MixedAttribs_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MixedAttribs_2_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!MixedAttribs_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MixedAttribs_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( AddressDecl | MixedList | ConfigParamDef ) TTCN_SEMI?
  private static boolean MixedAttribs_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MixedAttribs_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MixedAttribs_2_0_0(b, l + 1);
    r = r && MixedAttribs_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AddressDecl | MixedList | ConfigParamDef
  private static boolean MixedAttribs_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MixedAttribs_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AddressDecl(b, l + 1);
    if (!r) r = MixedList(b, l + 1);
    if (!r) r = ConfigParamDef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_SEMI?
  private static boolean MixedAttribs_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MixedAttribs_2_0_1")) return false;
    consumeToken(b, TTCN_SEMI);
    return true;
  }

  /* ********************************************************** */
  // Direction ProcOrTypeList
  public static boolean MixedList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MixedList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<mixed list>");
    r = Direction(b, l + 1);
    r = r && ProcOrTypeList(b, l + 1);
    exit_section_(b, l, m, MIXED_LIST, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_MODULE ModuleId TTCN_LB Content* TTCN_RB WithStatement? TTCN_SEMI?
  public static boolean Module(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Module")) return false;
    if (!nextTokenIs(b, TTCN_MODULE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_MODULE);
    r = r && ModuleId(b, l + 1);
    r = r && consumeToken(b, TTCN_LB);
    r = r && Module_3(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    r = r && Module_5(b, l + 1);
    r = r && Module_6(b, l + 1);
    exit_section_(b, m, MODULE, r);
    return r;
  }

  // Content*
  private static boolean Module_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Module_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Content(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Module_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WithStatement?
  private static boolean Module_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Module_5")) return false;
    WithStatement(b, l + 1);
    return true;
  }

  // TTCN_SEMI?
  private static boolean Module_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Module_6")) return false;
    consumeToken(b, TTCN_SEMI);
    return true;
  }

  /* ********************************************************** */
  // ControlStatementOrDefList?
  public static boolean ModuleControlBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleControlBody")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<module control body>");
    ControlStatementOrDefList(b, l + 1);
    exit_section_(b, l, m, MODULE_CONTROL_BODY, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // TTCN_CONTROL TTCN_LB ModuleControlBody TTCN_RB WithStatement? TTCN_SEMI?
  public static boolean ModuleControlPart(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleControlPart")) return false;
    if (!nextTokenIs(b, TTCN_CONTROL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_CONTROL, TTCN_LB);
    r = r && ModuleControlBody(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    r = r && ModuleControlPart_4(b, l + 1);
    r = r && ModuleControlPart_5(b, l + 1);
    exit_section_(b, m, MODULE_CONTROL_PART, r);
    return r;
  }

  // WithStatement?
  private static boolean ModuleControlPart_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleControlPart_4")) return false;
    WithStatement(b, l + 1);
    return true;
  }

  // TTCN_SEMI?
  private static boolean ModuleControlPart_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleControlPart_5")) return false;
    consumeToken(b, TTCN_SEMI);
    return true;
  }

  /* ********************************************************** */
  // ( ( Visibility ? ( TypeDef | ConstDef | TemplateDef | ModuleParDef | FunctionDef | SignatureDef | TestcaseDef | AltstepDef | ImportDef | ExtFunctionDef | ExtConstDef ) ) | ( TTCN_PUBLIC? GroupDef ) | ( TTCN_PRIVATE? FriendModuleDef ) ) WithStatement?
  static boolean ModuleDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleDefinition")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ModuleDefinition_0(b, l + 1);
    r = r && ModuleDefinition_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Visibility ? ( TypeDef | ConstDef | TemplateDef | ModuleParDef | FunctionDef | SignatureDef | TestcaseDef | AltstepDef | ImportDef | ExtFunctionDef | ExtConstDef ) ) | ( TTCN_PUBLIC? GroupDef ) | ( TTCN_PRIVATE? FriendModuleDef )
  private static boolean ModuleDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleDefinition_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ModuleDefinition_0_0(b, l + 1);
    if (!r) r = ModuleDefinition_0_1(b, l + 1);
    if (!r) r = ModuleDefinition_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Visibility ? ( TypeDef | ConstDef | TemplateDef | ModuleParDef | FunctionDef | SignatureDef | TestcaseDef | AltstepDef | ImportDef | ExtFunctionDef | ExtConstDef )
  private static boolean ModuleDefinition_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleDefinition_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ModuleDefinition_0_0_0(b, l + 1);
    r = r && ModuleDefinition_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Visibility ?
  private static boolean ModuleDefinition_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleDefinition_0_0_0")) return false;
    Visibility(b, l + 1);
    return true;
  }

  // TypeDef | ConstDef | TemplateDef | ModuleParDef | FunctionDef | SignatureDef | TestcaseDef | AltstepDef | ImportDef | ExtFunctionDef | ExtConstDef
  private static boolean ModuleDefinition_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleDefinition_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeDef(b, l + 1);
    if (!r) r = ConstDef(b, l + 1);
    if (!r) r = TemplateDef(b, l + 1);
    if (!r) r = ModuleParDef(b, l + 1);
    if (!r) r = FunctionDef(b, l + 1);
    if (!r) r = SignatureDef(b, l + 1);
    if (!r) r = TestcaseDef(b, l + 1);
    if (!r) r = AltstepDef(b, l + 1);
    if (!r) r = ImportDef(b, l + 1);
    if (!r) r = ExtFunctionDef(b, l + 1);
    if (!r) r = ExtConstDef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_PUBLIC? GroupDef
  private static boolean ModuleDefinition_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleDefinition_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ModuleDefinition_0_1_0(b, l + 1);
    r = r && GroupDef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_PUBLIC?
  private static boolean ModuleDefinition_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleDefinition_0_1_0")) return false;
    consumeToken(b, TTCN_PUBLIC);
    return true;
  }

  // TTCN_PRIVATE? FriendModuleDef
  private static boolean ModuleDefinition_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleDefinition_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ModuleDefinition_0_2_0(b, l + 1);
    r = r && FriendModuleDef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_PRIVATE?
  private static boolean ModuleDefinition_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleDefinition_0_2_0")) return false;
    consumeToken(b, TTCN_PRIVATE);
    return true;
  }

  // WithStatement?
  private static boolean ModuleDefinition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleDefinition_1")) return false;
    WithStatement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (ModuleDefinition TTCN_SEMI?)+
  public static boolean ModuleDefinitionsList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleDefinitionsList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<module definitions list>");
    r = ModuleDefinitionsList_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!ModuleDefinitionsList_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ModuleDefinitionsList", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, MODULE_DEFINITIONS_LIST, r, false, null);
    return r;
  }

  // ModuleDefinition TTCN_SEMI?
  private static boolean ModuleDefinitionsList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleDefinitionsList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ModuleDefinition(b, l + 1);
    r = r && ModuleDefinitionsList_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_SEMI?
  private static boolean ModuleDefinitionsList_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleDefinitionsList_0_1")) return false;
    consumeToken(b, TTCN_SEMI);
    return true;
  }

  /* ********************************************************** */
  // Identifier LanguageSpec?
  static boolean ModuleId(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleId")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && ModuleId_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LanguageSpec?
  private static boolean ModuleId_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleId_1")) return false;
    LanguageSpec(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Type ModuleParList
  public static boolean ModulePar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModulePar")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<module par>");
    r = Type(b, l + 1);
    r = r && ModuleParList(b, l + 1);
    exit_section_(b, l, m, MODULE_PAR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_MODULEPAR ( ModulePar | ( TTCN_LB MultitypedModuleParList* TTCN_RB ) )
  public static boolean ModuleParDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleParDef")) return false;
    if (!nextTokenIs(b, TTCN_MODULEPAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_MODULEPAR);
    r = r && ModuleParDef_1(b, l + 1);
    exit_section_(b, m, MODULE_PAR_DEF, r);
    return r;
  }

  // ModulePar | ( TTCN_LB MultitypedModuleParList* TTCN_RB )
  private static boolean ModuleParDef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleParDef_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ModulePar(b, l + 1);
    if (!r) r = ModuleParDef_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_LB MultitypedModuleParList* TTCN_RB
  private static boolean ModuleParDef_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleParDef_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LB);
    r = r && ModuleParDef_1_1_1(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, null, r);
    return r;
  }

  // MultitypedModuleParList*
  private static boolean ModuleParDef_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleParDef_1_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!MultitypedModuleParList(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ModuleParDef_1_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // Identifier (TTCN_ASSIGN ConstantExpression)? ( TTCN_COMMA Identifier (TTCN_ASSIGN ConstantExpression)? )*
  static boolean ModuleParList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleParList")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && ModuleParList_1(b, l + 1);
    r = r && ModuleParList_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TTCN_ASSIGN ConstantExpression)?
  private static boolean ModuleParList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleParList_1")) return false;
    ModuleParList_1_0(b, l + 1);
    return true;
  }

  // TTCN_ASSIGN ConstantExpression
  private static boolean ModuleParList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleParList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_ASSIGN);
    r = r && ConstantExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_COMMA Identifier (TTCN_ASSIGN ConstantExpression)? )*
  private static boolean ModuleParList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleParList_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ModuleParList_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ModuleParList_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA Identifier (TTCN_ASSIGN ConstantExpression)?
  private static boolean ModuleParList_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleParList_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && Identifier(b, l + 1);
    r = r && ModuleParList_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TTCN_ASSIGN ConstantExpression)?
  private static boolean ModuleParList_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleParList_2_0_2")) return false;
    ModuleParList_2_0_2_0(b, l + 1);
    return true;
  }

  // TTCN_ASSIGN ConstantExpression
  private static boolean ModuleParList_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleParList_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_ASSIGN);
    r = r && ConstantExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_MTC ComponentType
  public static boolean MtcSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MtcSpec")) return false;
    if (!nextTokenIs(b, TTCN_MTC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_MTC);
    r = r && ComponentType(b, l + 1);
    exit_section_(b, m, MTC_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // UnaryExpression ( MultiplyOp UnaryExpression )* | CompoundExpression
  static boolean MulExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MulExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MulExpression_0(b, l + 1);
    if (!r) r = CompoundExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // UnaryExpression ( MultiplyOp UnaryExpression )*
  private static boolean MulExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MulExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnaryExpression(b, l + 1);
    r = r && MulExpression_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( MultiplyOp UnaryExpression )*
  private static boolean MulExpression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MulExpression_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!MulExpression_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MulExpression_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // MultiplyOp UnaryExpression
  private static boolean MulExpression_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MulExpression_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MultiplyOp(b, l + 1);
    r = r && UnaryExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( SingleWithAttrib TTCN_SEMI? )*
  public static boolean MultiWithAttrib(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiWithAttrib")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<multi with attrib>");
    int c = current_position_(b);
    while (true) {
      if (!MultiWithAttrib_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MultiWithAttrib", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, MULTI_WITH_ATTRIB, true, false, null);
    return true;
  }

  // SingleWithAttrib TTCN_SEMI?
  private static boolean MultiWithAttrib_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiWithAttrib_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SingleWithAttrib(b, l + 1);
    r = r && MultiWithAttrib_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_SEMI?
  private static boolean MultiWithAttrib_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiWithAttrib_0_1")) return false;
    consumeToken(b, TTCN_SEMI);
    return true;
  }

  /* ********************************************************** */
  // TTCN_MUL | TTCN_DIV | TTCN_MOD | TTCN_REM
  public static boolean MultiplyOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiplyOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<multiply op>");
    r = consumeToken(b, TTCN_MUL);
    if (!r) r = consumeToken(b, TTCN_DIV);
    if (!r) r = consumeToken(b, TTCN_MOD);
    if (!r) r = consumeToken(b, TTCN_REM);
    exit_section_(b, l, m, MULTIPLY_OP, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ModulePar TTCN_SEMI?
  public static boolean MultitypedModuleParList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultitypedModuleParList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<multityped module par list>");
    r = ModulePar(b, l + 1);
    r = r && MultitypedModuleParList_1(b, l + 1);
    exit_section_(b, l, m, MULTITYPED_MODULE_PAR_LIST, r, false, null);
    return r;
  }

  // TTCN_SEMI?
  private static boolean MultitypedModuleParList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultitypedModuleParList_1")) return false;
    consumeToken(b, TTCN_SEMI);
    return true;
  }

  /* ********************************************************** */
  // TTCN_ENUMERATED TTCN_LB EnumerationList TTCN_RB
  public static boolean NestedEnumDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedEnumDef")) return false;
    if (!nextTokenIs(b, TTCN_ENUMERATED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_ENUMERATED, TTCN_LB);
    r = r && EnumerationList(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, NESTED_ENUM_DEF, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_RECORD TTCN_LB (StructFieldDef ( TTCN_COMMA StructFieldDef )*)? TTCN_RB
  public static boolean NestedRecordDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedRecordDef")) return false;
    if (!nextTokenIs(b, TTCN_RECORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_RECORD, TTCN_LB);
    r = r && NestedRecordDef_2(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, NESTED_RECORD_DEF, r);
    return r;
  }

  // (StructFieldDef ( TTCN_COMMA StructFieldDef )*)?
  private static boolean NestedRecordDef_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedRecordDef_2")) return false;
    NestedRecordDef_2_0(b, l + 1);
    return true;
  }

  // StructFieldDef ( TTCN_COMMA StructFieldDef )*
  private static boolean NestedRecordDef_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedRecordDef_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StructFieldDef(b, l + 1);
    r = r && NestedRecordDef_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_COMMA StructFieldDef )*
  private static boolean NestedRecordDef_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedRecordDef_2_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!NestedRecordDef_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "NestedRecordDef_2_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA StructFieldDef
  private static boolean NestedRecordDef_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedRecordDef_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && StructFieldDef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_RECORD StringLength? TTCN_OF ( Type | NestedTypeDef )
  public static boolean NestedRecordOfDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedRecordOfDef")) return false;
    if (!nextTokenIs(b, TTCN_RECORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_RECORD);
    r = r && NestedRecordOfDef_1(b, l + 1);
    r = r && consumeToken(b, TTCN_OF);
    r = r && NestedRecordOfDef_3(b, l + 1);
    exit_section_(b, m, NESTED_RECORD_OF_DEF, r);
    return r;
  }

  // StringLength?
  private static boolean NestedRecordOfDef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedRecordOfDef_1")) return false;
    StringLength(b, l + 1);
    return true;
  }

  // Type | NestedTypeDef
  private static boolean NestedRecordOfDef_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedRecordOfDef_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Type(b, l + 1);
    if (!r) r = NestedTypeDef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_SET TTCN_LB (StructFieldDef ( TTCN_COMMA StructFieldDef )* )? TTCN_RB
  public static boolean NestedSetDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedSetDef")) return false;
    if (!nextTokenIs(b, TTCN_SET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_SET, TTCN_LB);
    r = r && NestedSetDef_2(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, NESTED_SET_DEF, r);
    return r;
  }

  // (StructFieldDef ( TTCN_COMMA StructFieldDef )* )?
  private static boolean NestedSetDef_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedSetDef_2")) return false;
    NestedSetDef_2_0(b, l + 1);
    return true;
  }

  // StructFieldDef ( TTCN_COMMA StructFieldDef )*
  private static boolean NestedSetDef_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedSetDef_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StructFieldDef(b, l + 1);
    r = r && NestedSetDef_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_COMMA StructFieldDef )*
  private static boolean NestedSetDef_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedSetDef_2_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!NestedSetDef_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "NestedSetDef_2_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA StructFieldDef
  private static boolean NestedSetDef_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedSetDef_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && StructFieldDef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_SET StringLength? TTCN_OF ( Type | NestedTypeDef )
  public static boolean NestedSetOfDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedSetOfDef")) return false;
    if (!nextTokenIs(b, TTCN_SET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_SET);
    r = r && NestedSetOfDef_1(b, l + 1);
    r = r && consumeToken(b, TTCN_OF);
    r = r && NestedSetOfDef_3(b, l + 1);
    exit_section_(b, m, NESTED_SET_OF_DEF, r);
    return r;
  }

  // StringLength?
  private static boolean NestedSetOfDef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedSetOfDef_1")) return false;
    StringLength(b, l + 1);
    return true;
  }

  // Type | NestedTypeDef
  private static boolean NestedSetOfDef_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedSetOfDef_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Type(b, l + 1);
    if (!r) r = NestedTypeDef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NestedRecordDef | NestedUnionDef | NestedSetDef | NestedRecordOfDef | NestedSetOfDef | NestedEnumDef
  public static boolean NestedTypeDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedTypeDef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<nested type def>");
    r = NestedRecordDef(b, l + 1);
    if (!r) r = NestedUnionDef(b, l + 1);
    if (!r) r = NestedSetDef(b, l + 1);
    if (!r) r = NestedRecordOfDef(b, l + 1);
    if (!r) r = NestedSetOfDef(b, l + 1);
    if (!r) r = NestedEnumDef(b, l + 1);
    exit_section_(b, l, m, NESTED_TYPE_DEF, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_UNION TTCN_LB UnionFieldDef { TTCN_COMMA UnionFieldDef } TTCN_RB
  public static boolean NestedUnionDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedUnionDef")) return false;
    if (!nextTokenIs(b, TTCN_UNION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_UNION, TTCN_LB);
    r = r && UnionFieldDef(b, l + 1);
    r = r && NestedUnionDef_3(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, NESTED_UNION_DEF, r);
    return r;
  }

  // TTCN_COMMA UnionFieldDef
  private static boolean NestedUnionDef_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NestedUnionDef_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && UnionFieldDef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_NOT? EqualExpression
  static boolean NotExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NotExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NotExpression_0(b, l + 1);
    r = r && EqualExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_NOT?
  private static boolean NotExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NotExpression_0")) return false;
    consumeToken(b, TTCN_NOT);
    return true;
  }

  /* ********************************************************** */
  // Expression | TTCN_SUB
  public static boolean NotUsedOrExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NotUsedOrExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<not used or expression>");
    r = Expression(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_SUB);
    exit_section_(b, l, m, NOT_USED_OR_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_NUM
  static boolean Num(PsiBuilder b, int l) {
    return consumeToken(b, TTCN_NUM);
  }

  /* ********************************************************** */
  // TTCN_NUMBER
  static boolean Number(PsiBuilder b, int l) {
    return consumeToken(b, TTCN_NUMBER);
  }

  /* ********************************************************** */
  // Hex Hex
  static boolean Oct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Oct")) return false;
    if (!nextTokenIs(b, TTCN_HEX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Hex(b, l + 1);
    r = r && Hex(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Oct | TTCN_QUESTION | TTCN_MUL
  public static boolean OctOrMatch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OctOrMatch")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<oct or match>");
    r = Oct(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_QUESTION);
    if (!r) r = consumeToken(b, TTCN_MUL);
    exit_section_(b, l, m, OCT_OR_MATCH, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_OCTETSTRING
  static boolean OctetStringKeyword(PsiBuilder b, int l) {
    return consumeToken(b, TTCN_OCTETSTRING);
  }

  /* ********************************************************** */
  // "'" OctOrMatch* "'" "O"
  public static boolean OctetStringMatch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OctetStringMatch")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<octet string match>");
    r = consumeToken(b, "'");
    r = r && OctetStringMatch_1(b, l + 1);
    r = r && consumeToken(b, "'");
    r = r && consumeToken(b, "O");
    exit_section_(b, l, m, OCTET_STRING_MATCH, r, false, null);
    return r;
  }

  // OctOrMatch*
  private static boolean OctetStringMatch_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OctetStringMatch_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OctOrMatch(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "OctetStringMatch_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // TTCN_OMIT
  static boolean OmitKeyword(PsiBuilder b, int l) {
    return consumeToken(b, TTCN_OMIT);
  }

  /* ********************************************************** */
  // ConfigurationOps | TTCN_GETVERDICT | TimerOps | TestcaseInstance | ( FunctionInstance ExtendedFieldReference? ) | ( TemplateOps ExtendedFieldReference? ) | ActivateOp
  public static boolean OpCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpCall")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<op call>");
    r = ConfigurationOps(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_GETVERDICT);
    if (!r) r = TimerOps(b, l + 1);
    if (!r) r = TestcaseInstance(b, l + 1);
    if (!r) r = OpCall_4(b, l + 1);
    if (!r) r = OpCall_5(b, l + 1);
    if (!r) r = ActivateOp(b, l + 1);
    exit_section_(b, l, m, OP_CALL, r, false, null);
    return r;
  }

  // FunctionInstance ExtendedFieldReference?
  private static boolean OpCall_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpCall_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionInstance(b, l + 1);
    r = r && OpCall_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ExtendedFieldReference?
  private static boolean OpCall_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpCall_4_1")) return false;
    ExtendedFieldReference(b, l + 1);
    return true;
  }

  // TemplateOps ExtendedFieldReference?
  private static boolean OpCall_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpCall_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateOps(b, l + 1);
    r = r && OpCall_5_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ExtendedFieldReference?
  private static boolean OpCall_5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpCall_5_1")) return false;
    ExtendedFieldReference(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TTCN_OSTRING
  static boolean Ostring(PsiBuilder b, int l) {
    return consumeToken(b, TTCN_OSTRING);
  }

  /* ********************************************************** */
  // TTCN_OUT
  static boolean OutParKeyword(PsiBuilder b, int l) {
    return consumeToken(b, TTCN_OUT);
  }

  /* ********************************************************** */
  // Identifier
  public static boolean ParRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParRef")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    exit_section_(b, m, PAR_REF, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_LP ( AssignmentList | VariableList ) TTCN_RP
  public static boolean ParamAssignmentList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParamAssignmentList")) return false;
    if (!nextTokenIs(b, TTCN_LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LP);
    r = r && ParamAssignmentList_1(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, PARAM_ASSIGNMENT_LIST, r);
    return r;
  }

  // AssignmentList | VariableList
  private static boolean ParamAssignmentList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParamAssignmentList_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AssignmentList(b, l + 1);
    if (!r) r = VariableList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_PARAM FunctionActualParList
  static boolean ParamClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParamClause")) return false;
    if (!nextTokenIs(b, TTCN_PARAM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_PARAM);
    r = r && FunctionActualParList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_PARAM ParamAssignmentList
  public static boolean ParamSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParamSpec")) return false;
    if (!nextTokenIs(b, TTCN_PARAM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_PARAM);
    r = r && ParamAssignmentList(b, l + 1);
    exit_section_(b, m, PARAM_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // d
  public static boolean Pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pattern")) return false;
    if (!nextTokenIs(b, D)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, D);
    exit_section_(b, m, PATTERN, r);
    return r;
  }

  /* ********************************************************** */
  // Pattern | ReferencedValue
  public static boolean PatternParticle(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternParticle")) return false;
    if (!nextTokenIs(b, "<pattern particle>", TTCN_ID, D)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<pattern particle>");
    r = Pattern(b, l + 1);
    if (!r) r = ReferencedValue(b, l + 1);
    exit_section_(b, l, m, PATTERN_PARTICLE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_PERMUTATION
  public static boolean PermutationKeyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PermutationKeyword")) return false;
    if (!nextTokenIs(b, TTCN_PERMUTATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_PERMUTATION);
    exit_section_(b, m, PERMUTATION_KEYWORD, r);
    return r;
  }

  /* ********************************************************** */
  // PermutationKeyword ListOfTemplates
  public static boolean PermutationMatch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PermutationMatch")) return false;
    if (!nextTokenIs(b, TTCN_PERMUTATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PermutationKeyword(b, l + 1);
    r = r && ListOfTemplates(b, l + 1);
    exit_section_(b, m, PERMUTATION_MATCH, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_LB CallBodyStatementList TTCN_RB
  public static boolean PortCallBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortCallBody")) return false;
    if (!nextTokenIs(b, TTCN_LB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LB);
    r = r && CallBodyStatementList(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, PORT_CALL_BODY, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_CALL TTCN_LP CallParameters TTCN_RP ToClause?
  public static boolean PortCallOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortCallOp")) return false;
    if (!nextTokenIs(b, TTCN_CALL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_CALL, TTCN_LP);
    r = r && CallParameters(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    r = r && PortCallOp_4(b, l + 1);
    exit_section_(b, m, PORT_CALL_OP, r);
    return r;
  }

  // ToClause?
  private static boolean PortCallOp_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortCallOp_4")) return false;
    ToClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TTCN_CATCH ( TTCN_LP CatchOpParameter TTCN_RP )? FromClause? PortRedirect?
  public static boolean PortCatchOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortCatchOp")) return false;
    if (!nextTokenIs(b, TTCN_CATCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_CATCH);
    r = r && PortCatchOp_1(b, l + 1);
    r = r && PortCatchOp_2(b, l + 1);
    r = r && PortCatchOp_3(b, l + 1);
    exit_section_(b, m, PORT_CATCH_OP, r);
    return r;
  }

  // ( TTCN_LP CatchOpParameter TTCN_RP )?
  private static boolean PortCatchOp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortCatchOp_1")) return false;
    PortCatchOp_1_0(b, l + 1);
    return true;
  }

  // TTCN_LP CatchOpParameter TTCN_RP
  private static boolean PortCatchOp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortCatchOp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LP);
    r = r && CatchOpParameter(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // FromClause?
  private static boolean PortCatchOp_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortCatchOp_2")) return false;
    FromClause(b, l + 1);
    return true;
  }

  // PortRedirect?
  private static boolean PortCatchOp_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortCatchOp_3")) return false;
    PortRedirect(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TTCN_CKECK ( TTCN_LP CheckParameter TTCN_RP )?
  public static boolean PortCheckOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortCheckOp")) return false;
    if (!nextTokenIs(b, TTCN_CKECK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_CKECK);
    r = r && PortCheckOp_1(b, l + 1);
    exit_section_(b, m, PORT_CHECK_OP, r);
    return r;
  }

  // ( TTCN_LP CheckParameter TTCN_RP )?
  private static boolean PortCheckOp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortCheckOp_1")) return false;
    PortCheckOp_1_0(b, l + 1);
    return true;
  }

  // TTCN_LP CheckParameter TTCN_RP
  private static boolean PortCheckOp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortCheckOp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LP);
    r = r && CheckParameter(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_PORT PortDefBody
  public static boolean PortDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortDef")) return false;
    if (!nextTokenIs(b, TTCN_PORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_PORT);
    r = r && PortDefBody(b, l + 1);
    exit_section_(b, m, PORT_DEF, r);
    return r;
  }

  /* ********************************************************** */
  // MessageAttribs | ProcedureAttribs | MixedAttribs
  static boolean PortDefAttribs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortDefAttribs")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MessageAttribs(b, l + 1);
    if (!r) r = ProcedureAttribs(b, l + 1);
    if (!r) r = MixedAttribs(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier PortDefAttribs
  static boolean PortDefBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortDefBody")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && PortDefAttribs(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier ArrayDef?
  public static boolean PortElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortElement")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && PortElement_1(b, l + 1);
    exit_section_(b, m, PORT_ELEMENT, r);
    return r;
  }

  // ArrayDef?
  private static boolean PortElement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortElement_1")) return false;
    ArrayDef(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TTCN_GETCALL (TTCN_LP InLineTemplate TTCN_RP)? FromClause? PortRedirectWithParam?
  public static boolean PortGetCallOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortGetCallOp")) return false;
    if (!nextTokenIs(b, TTCN_GETCALL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_GETCALL);
    r = r && PortGetCallOp_1(b, l + 1);
    r = r && PortGetCallOp_2(b, l + 1);
    r = r && PortGetCallOp_3(b, l + 1);
    exit_section_(b, m, PORT_GET_CALL_OP, r);
    return r;
  }

  // (TTCN_LP InLineTemplate TTCN_RP)?
  private static boolean PortGetCallOp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortGetCallOp_1")) return false;
    PortGetCallOp_1_0(b, l + 1);
    return true;
  }

  // TTCN_LP InLineTemplate TTCN_RP
  private static boolean PortGetCallOp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortGetCallOp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LP);
    r = r && InLineTemplate(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // FromClause?
  private static boolean PortGetCallOp_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortGetCallOp_2")) return false;
    FromClause(b, l + 1);
    return true;
  }

  // PortRedirectWithParam?
  private static boolean PortGetCallOp_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortGetCallOp_3")) return false;
    PortRedirectWithParam(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TTCN_GETREPLY (TTCN_LP InLineTemplate ValueMatchSpec? TTCN_RP)? FromClause? PortRedirectWithValueAndParam?
  public static boolean PortGetReplyOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortGetReplyOp")) return false;
    if (!nextTokenIs(b, TTCN_GETREPLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_GETREPLY);
    r = r && PortGetReplyOp_1(b, l + 1);
    r = r && PortGetReplyOp_2(b, l + 1);
    r = r && PortGetReplyOp_3(b, l + 1);
    exit_section_(b, m, PORT_GET_REPLY_OP, r);
    return r;
  }

  // (TTCN_LP InLineTemplate ValueMatchSpec? TTCN_RP)?
  private static boolean PortGetReplyOp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortGetReplyOp_1")) return false;
    PortGetReplyOp_1_0(b, l + 1);
    return true;
  }

  // TTCN_LP InLineTemplate ValueMatchSpec? TTCN_RP
  private static boolean PortGetReplyOp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortGetReplyOp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LP);
    r = r && InLineTemplate(b, l + 1);
    r = r && PortGetReplyOp_1_0_2(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // ValueMatchSpec?
  private static boolean PortGetReplyOp_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortGetReplyOp_1_0_2")) return false;
    ValueMatchSpec(b, l + 1);
    return true;
  }

  // FromClause?
  private static boolean PortGetReplyOp_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortGetReplyOp_2")) return false;
    FromClause(b, l + 1);
    return true;
  }

  // PortRedirectWithValueAndParam?
  private static boolean PortGetReplyOp_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortGetReplyOp_3")) return false;
    PortRedirectWithValueAndParam(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TTCN_PORT ExtendedIdentifier PortElement ( TTCN_COMMA PortElement )*
  public static boolean PortInstance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortInstance")) return false;
    if (!nextTokenIs(b, TTCN_PORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_PORT);
    r = r && ExtendedIdentifier(b, l + 1);
    r = r && PortElement(b, l + 1);
    r = r && PortInstance_3(b, l + 1);
    exit_section_(b, m, PORT_INSTANCE, r);
    return r;
  }

  // ( TTCN_COMMA PortElement )*
  private static boolean PortInstance_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortInstance_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!PortInstance_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PortInstance_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA PortElement
  private static boolean PortInstance_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortInstance_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && PortElement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ArrayIdentifierRef | TTCN_ALL TTCN_PORT
  public static boolean PortOrAll(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortOrAll")) return false;
    if (!nextTokenIs(b, "<port or all>", TTCN_ALL, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<port or all>");
    r = ArrayIdentifierRef(b, l + 1);
    if (!r) r = parseTokens(b, 0, TTCN_ALL, TTCN_PORT);
    exit_section_(b, l, m, PORT_OR_ALL, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PortOrAll | TTCN_ANY TTCN_PORT
  public static boolean PortOrAllAny(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortOrAllAny")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<port or all any>");
    r = PortOrAll(b, l + 1);
    if (!r) r = parseTokens(b, 0, TTCN_ANY, TTCN_PORT);
    exit_section_(b, l, m, PORT_OR_ALL_ANY, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ArrayIdentifierRef | ( TTCN_ANY ( TTCN_PORT | TTCN_FROM VariableRef ) )
  public static boolean PortOrAny(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortOrAny")) return false;
    if (!nextTokenIs(b, "<port or any>", TTCN_ANY, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<port or any>");
    r = ArrayIdentifierRef(b, l + 1);
    if (!r) r = PortOrAny_1(b, l + 1);
    exit_section_(b, l, m, PORT_OR_ANY, r, false, null);
    return r;
  }

  // TTCN_ANY ( TTCN_PORT | TTCN_FROM VariableRef )
  private static boolean PortOrAny_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortOrAny_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_ANY);
    r = r && PortOrAny_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_PORT | TTCN_FROM VariableRef
  private static boolean PortOrAny_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortOrAny_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_PORT);
    if (!r) r = PortOrAny_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_FROM VariableRef
  private static boolean PortOrAny_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortOrAny_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_FROM);
    r = r && VariableRef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_RAISE TTCN_LP Signature TTCN_COMMA InLineTemplate TTCN_RP ToClause?
  public static boolean PortRaiseOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortRaiseOp")) return false;
    if (!nextTokenIs(b, TTCN_RAISE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_RAISE, TTCN_LP);
    r = r && Signature(b, l + 1);
    r = r && consumeToken(b, TTCN_COMMA);
    r = r && InLineTemplate(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    r = r && PortRaiseOp_6(b, l + 1);
    exit_section_(b, m, PORT_RAISE_OP, r);
    return r;
  }

  // ToClause?
  private static boolean PortRaiseOp_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortRaiseOp_6")) return false;
    ToClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TTCN_RECEIVE ( TTCN_LP InLineTemplate TTCN_RP )? FromClause? PortRedirect?
  public static boolean PortReceiveOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortReceiveOp")) return false;
    if (!nextTokenIs(b, TTCN_RECEIVE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_RECEIVE);
    r = r && PortReceiveOp_1(b, l + 1);
    r = r && PortReceiveOp_2(b, l + 1);
    r = r && PortReceiveOp_3(b, l + 1);
    exit_section_(b, m, PORT_RECEIVE_OP, r);
    return r;
  }

  // ( TTCN_LP InLineTemplate TTCN_RP )?
  private static boolean PortReceiveOp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortReceiveOp_1")) return false;
    PortReceiveOp_1_0(b, l + 1);
    return true;
  }

  // TTCN_LP InLineTemplate TTCN_RP
  private static boolean PortReceiveOp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortReceiveOp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LP);
    r = r && InLineTemplate(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // FromClause?
  private static boolean PortReceiveOp_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortReceiveOp_2")) return false;
    FromClause(b, l + 1);
    return true;
  }

  // PortRedirect?
  private static boolean PortReceiveOp_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortReceiveOp_3")) return false;
    PortRedirect(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TTCN_POINT_TO ( ( ValueSpec SenderSpec? IndexSpec? ) | ( SenderSpec IndexSpec? ) | IndexSpec )
  public static boolean PortRedirect(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortRedirect")) return false;
    if (!nextTokenIs(b, TTCN_POINT_TO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_POINT_TO);
    r = r && PortRedirect_1(b, l + 1);
    exit_section_(b, m, PORT_REDIRECT, r);
    return r;
  }

  // ( ValueSpec SenderSpec? IndexSpec? ) | ( SenderSpec IndexSpec? ) | IndexSpec
  private static boolean PortRedirect_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortRedirect_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PortRedirect_1_0(b, l + 1);
    if (!r) r = PortRedirect_1_1(b, l + 1);
    if (!r) r = IndexSpec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ValueSpec SenderSpec? IndexSpec?
  private static boolean PortRedirect_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortRedirect_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ValueSpec(b, l + 1);
    r = r && PortRedirect_1_0_1(b, l + 1);
    r = r && PortRedirect_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SenderSpec?
  private static boolean PortRedirect_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortRedirect_1_0_1")) return false;
    SenderSpec(b, l + 1);
    return true;
  }

  // IndexSpec?
  private static boolean PortRedirect_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortRedirect_1_0_2")) return false;
    IndexSpec(b, l + 1);
    return true;
  }

  // SenderSpec IndexSpec?
  private static boolean PortRedirect_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortRedirect_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SenderSpec(b, l + 1);
    r = r && PortRedirect_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IndexSpec?
  private static boolean PortRedirect_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortRedirect_1_1_1")) return false;
    IndexSpec(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TTCN_POINT_TO RedirectWithParamSpec
  public static boolean PortRedirectWithParam(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortRedirectWithParam")) return false;
    if (!nextTokenIs(b, TTCN_POINT_TO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_POINT_TO);
    r = r && RedirectWithParamSpec(b, l + 1);
    exit_section_(b, m, PORT_REDIRECT_WITH_PARAM, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_POINT_TO RedirectWithValueAndParamSpec
  public static boolean PortRedirectWithValueAndParam(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortRedirectWithValueAndParam")) return false;
    if (!nextTokenIs(b, TTCN_POINT_TO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_POINT_TO);
    r = r && RedirectWithValueAndParamSpec(b, l + 1);
    exit_section_(b, m, PORT_REDIRECT_WITH_VALUE_AND_PARAM, r);
    return r;
  }

  /* ********************************************************** */
  // ComponentRef TTCN_COLON ArrayIdentifierRef
  static boolean PortRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortRef")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ComponentRef(b, l + 1);
    r = r && consumeToken(b, TTCN_COLON);
    r = r && ArrayIdentifierRef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_REPLY TTCN_LP InLineTemplate ReplyValue? TTCN_RP ToClause?
  public static boolean PortReplyOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortReplyOp")) return false;
    if (!nextTokenIs(b, TTCN_REPLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_REPLY, TTCN_LP);
    r = r && InLineTemplate(b, l + 1);
    r = r && PortReplyOp_3(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    r = r && PortReplyOp_5(b, l + 1);
    exit_section_(b, m, PORT_REPLY_OP, r);
    return r;
  }

  // ReplyValue?
  private static boolean PortReplyOp_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortReplyOp_3")) return false;
    ReplyValue(b, l + 1);
    return true;
  }

  // ToClause?
  private static boolean PortReplyOp_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortReplyOp_5")) return false;
    ToClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TTCN_SEND TTCN_LP InLineTemplate TTCN_RP ToClause?
  public static boolean PortSendOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortSendOp")) return false;
    if (!nextTokenIs(b, TTCN_SEND)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_SEND, TTCN_LP);
    r = r && InLineTemplate(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    r = r && PortSendOp_4(b, l + 1);
    exit_section_(b, m, PORT_SEND_OP, r);
    return r;
  }

  // ToClause?
  private static boolean PortSendOp_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortSendOp_4")) return false;
    ToClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TTCN_TRIGGER (TTCN_LP InLineTemplate TTCN_RP)? FromClause? PortRedirect?
  public static boolean PortTriggerOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortTriggerOp")) return false;
    if (!nextTokenIs(b, TTCN_TRIGGER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_TRIGGER);
    r = r && PortTriggerOp_1(b, l + 1);
    r = r && PortTriggerOp_2(b, l + 1);
    r = r && PortTriggerOp_3(b, l + 1);
    exit_section_(b, m, PORT_TRIGGER_OP, r);
    return r;
  }

  // (TTCN_LP InLineTemplate TTCN_RP)?
  private static boolean PortTriggerOp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortTriggerOp_1")) return false;
    PortTriggerOp_1_0(b, l + 1);
    return true;
  }

  // TTCN_LP InLineTemplate TTCN_RP
  private static boolean PortTriggerOp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortTriggerOp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LP);
    r = r && InLineTemplate(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // FromClause?
  private static boolean PortTriggerOp_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortTriggerOp_2")) return false;
    FromClause(b, l + 1);
    return true;
  }

  // PortRedirect?
  private static boolean PortTriggerOp_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PortTriggerOp_3")) return false;
    PortRedirect(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // BitStringKeyword | BooleanKeyword | CharStringKeyword | UniversalCharString | IntegerKeyword | OctetStringKeyword | HexStringKeyword | VerdictTypeKeyword | FloatKeyword | AddressKeyword | DefaultKeyword | AnyTypeKeyword
  static boolean PredefinedType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PredefinedType")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BitStringKeyword(b, l + 1);
    if (!r) r = BooleanKeyword(b, l + 1);
    if (!r) r = CharStringKeyword(b, l + 1);
    if (!r) r = UniversalCharString(b, l + 1);
    if (!r) r = IntegerKeyword(b, l + 1);
    if (!r) r = OctetStringKeyword(b, l + 1);
    if (!r) r = HexStringKeyword(b, l + 1);
    if (!r) r = VerdictTypeKeyword(b, l + 1);
    if (!r) r = FloatKeyword(b, l + 1);
    if (!r) r = AddressKeyword(b, l + 1);
    if (!r) r = DefaultKeyword(b, l + 1);
    if (!r) r = AnyTypeKeyword(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Bstring | BooleanValue | CharStringValue | Number | Ostring | Hstring | VerdictTypeValue | Identifier | FloatValue | AddressValue | OmitKeyword
  public static boolean PredefinedValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PredefinedValue")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<predefined value>");
    r = Bstring(b, l + 1);
    if (!r) r = BooleanValue(b, l + 1);
    if (!r) r = CharStringValue(b, l + 1);
    if (!r) r = Number(b, l + 1);
    if (!r) r = Ostring(b, l + 1);
    if (!r) r = Hstring(b, l + 1);
    if (!r) r = VerdictTypeValue(b, l + 1);
    if (!r) r = Identifier(b, l + 1);
    if (!r) r = FloatValue(b, l + 1);
    if (!r) r = AddressValue(b, l + 1);
    if (!r) r = OmitKeyword(b, l + 1);
    exit_section_(b, l, m, PREDEFINED_VALUE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OpCall | Value | TTCN_LP SingleExpression TTCN_RP
  public static boolean Primary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Primary")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<primary>");
    r = OpCall(b, l + 1);
    if (!r) r = Value(b, l + 1);
    if (!r) r = Primary_2(b, l + 1);
    exit_section_(b, l, m, PRIMARY, r, false, null);
    return r;
  }

  // TTCN_LP SingleExpression TTCN_RP
  private static boolean Primary_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Primary_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LP);
    r = r && SingleExpression(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Signature | Type
  public static boolean ProcOrType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcOrType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<proc or type>");
    r = Signature(b, l + 1);
    if (!r) r = Type(b, l + 1);
    exit_section_(b, l, m, PROC_OR_TYPE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_ALL | ( ProcOrType ( TTCN_COMMA ProcOrType )* )
  public static boolean ProcOrTypeList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcOrTypeList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<proc or type list>");
    r = consumeToken(b, TTCN_ALL);
    if (!r) r = ProcOrTypeList_1(b, l + 1);
    exit_section_(b, l, m, PROC_OR_TYPE_LIST, r, false, null);
    return r;
  }

  // ProcOrType ( TTCN_COMMA ProcOrType )*
  private static boolean ProcOrTypeList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcOrTypeList_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ProcOrType(b, l + 1);
    r = r && ProcOrTypeList_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_COMMA ProcOrType )*
  private static boolean ProcOrTypeList_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcOrTypeList_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ProcOrTypeList_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ProcOrTypeList_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA ProcOrType
  private static boolean ProcOrTypeList_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcOrTypeList_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && ProcOrType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_PROCEDURE TTCN_LB ( ( AddressDecl | ProcedureList | ConfigParamDef ) TTCN_SEMI? )+ TTCN_RB
  public static boolean ProcedureAttribs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcedureAttribs")) return false;
    if (!nextTokenIs(b, TTCN_PROCEDURE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_PROCEDURE, TTCN_LB);
    r = r && ProcedureAttribs_2(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, PROCEDURE_ATTRIBS, r);
    return r;
  }

  // ( ( AddressDecl | ProcedureList | ConfigParamDef ) TTCN_SEMI? )+
  private static boolean ProcedureAttribs_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcedureAttribs_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ProcedureAttribs_2_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!ProcedureAttribs_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ProcedureAttribs_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( AddressDecl | ProcedureList | ConfigParamDef ) TTCN_SEMI?
  private static boolean ProcedureAttribs_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcedureAttribs_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ProcedureAttribs_2_0_0(b, l + 1);
    r = r && ProcedureAttribs_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AddressDecl | ProcedureList | ConfigParamDef
  private static boolean ProcedureAttribs_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcedureAttribs_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AddressDecl(b, l + 1);
    if (!r) r = ProcedureList(b, l + 1);
    if (!r) r = ConfigParamDef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_SEMI?
  private static boolean ProcedureAttribs_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcedureAttribs_2_0_1")) return false;
    consumeToken(b, TTCN_SEMI);
    return true;
  }

  /* ********************************************************** */
  // Direction AllOrSignatureList
  public static boolean ProcedureList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProcedureList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<procedure list>");
    r = Direction(b, l + 1);
    r = r && AllOrSignatureList(b, l + 1);
    exit_section_(b, l, m, PROCEDURE_LIST, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CharKeyword TTCN_LP Number TTCN_COMMA Number TTCN_COMMA Number TTCN_COMMA Number TTCN_RP
  public static boolean Quadruple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Quadruple")) return false;
    if (!nextTokenIs(b, TTCN_CHAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CharKeyword(b, l + 1);
    r = r && consumeToken(b, TTCN_LP);
    r = r && Number(b, l + 1);
    r = r && consumeToken(b, TTCN_COMMA);
    r = r && Number(b, l + 1);
    r = r && consumeToken(b, TTCN_COMMA);
    r = r && Number(b, l + 1);
    r = r && consumeToken(b, TTCN_COMMA);
    r = r && Number(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, QUADRUPLE, r);
    return r;
  }

  /* ********************************************************** */
  // ( Identifier TTCN_DOT )* Identifier
  public static boolean QualifiedIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedIdentifier")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedIdentifier_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, QUALIFIED_IDENTIFIER, r);
    return r;
  }

  // ( Identifier TTCN_DOT )*
  private static boolean QualifiedIdentifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedIdentifier_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!QualifiedIdentifier_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "QualifiedIdentifier_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // Identifier TTCN_DOT
  private static boolean QualifiedIdentifier_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedIdentifier_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, TTCN_DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // QualifiedIdentifier (TTCN_COMMA QualifiedIdentifier )*
  public static boolean QualifiedIdentifierList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedIdentifierList")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedIdentifier(b, l + 1);
    r = r && QualifiedIdentifierList_1(b, l + 1);
    exit_section_(b, m, QUALIFIED_IDENTIFIER_LIST, r);
    return r;
  }

  // (TTCN_COMMA QualifiedIdentifier )*
  private static boolean QualifiedIdentifierList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedIdentifierList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!QualifiedIdentifierList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "QualifiedIdentifierList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA QualifiedIdentifier
  private static boolean QualifiedIdentifierList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedIdentifierList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && QualifiedIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // QualifiedIdentifier ExceptsDef?
  public static boolean QualifiedIdentifierWithExcept(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedIdentifierWithExcept")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedIdentifier(b, l + 1);
    r = r && QualifiedIdentifierWithExcept_1(b, l + 1);
    exit_section_(b, m, QUALIFIED_IDENTIFIER_WITH_EXCEPT, r);
    return r;
  }

  // ExceptsDef?
  private static boolean QualifiedIdentifierWithExcept_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedIdentifierWithExcept_1")) return false;
    ExceptsDef(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ArrayIdentifierRef TTCN_DOT PortRaiseOp
  public static boolean RaiseStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RaiseStatement")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArrayIdentifierRef(b, l + 1);
    r = r && consumeToken(b, TTCN_DOT);
    r = r && PortRaiseOp(b, l + 1);
    exit_section_(b, m, RAISE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_LP Bound TTCN_POINT_CONNECT Bound TTCN_RP
  public static boolean Range(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Range")) return false;
    if (!nextTokenIs(b, TTCN_LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LP);
    r = r && Bound(b, l + 1);
    r = r && consumeToken(b, TTCN_POINT_CONNECT);
    r = r && Bound(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, RANGE, r);
    return r;
  }

  /* ********************************************************** */
  // Bound TTCN_POINT_CONNECT Bound
  public static boolean RangeDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RangeDef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<range def>");
    r = Bound(b, l + 1);
    r = r && consumeToken(b, TTCN_POINT_CONNECT);
    r = r && Bound(b, l + 1);
    exit_section_(b, l, m, RANGE_DEF, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ArrayIdentifierRef TTCN_DOT TTCN_READ
  public static boolean ReadTimerOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReadTimerOp")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArrayIdentifierRef(b, l + 1);
    r = r && consumeTokens(b, 0, TTCN_DOT, TTCN_READ);
    exit_section_(b, m, READ_TIMER_OP, r);
    return r;
  }

  /* ********************************************************** */
  // PortOrAny TTCN_DOT PortReceiveOp
  public static boolean ReceiveStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReceiveStatement")) return false;
    if (!nextTokenIs(b, "<receive statement>", TTCN_ANY, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<receive statement>");
    r = PortOrAny(b, l + 1);
    r = r && consumeToken(b, TTCN_DOT);
    r = r && PortReceiveOp(b, l + 1);
    exit_section_(b, l, m, RECEIVE_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_RECORD StructDefBody
  public static boolean RecordDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordDef")) return false;
    if (!nextTokenIs(b, TTCN_RECORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_RECORD);
    r = r && StructDefBody(b, l + 1);
    exit_section_(b, m, RECORD_DEF, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_RECORD StringLength? TTCN_OF StructOfDefBody
  public static boolean RecordOfDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordOfDef")) return false;
    if (!nextTokenIs(b, TTCN_RECORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_RECORD);
    r = r && RecordOfDef_1(b, l + 1);
    r = r && consumeToken(b, TTCN_OF);
    r = r && StructOfDefBody(b, l + 1);
    exit_section_(b, m, RECORD_OF_DEF, r);
    return r;
  }

  // StringLength?
  private static boolean RecordOfDef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordOfDef_1")) return false;
    StringLength(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TTCN_POINT_TO ( ( SenderSpec IndexSpec? ) | IndexSpec )
  public static boolean RedirectPresent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RedirectPresent")) return false;
    if (!nextTokenIs(b, TTCN_POINT_TO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_POINT_TO);
    r = r && RedirectPresent_1(b, l + 1);
    exit_section_(b, m, REDIRECT_PRESENT, r);
    return r;
  }

  // ( SenderSpec IndexSpec? ) | IndexSpec
  private static boolean RedirectPresent_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RedirectPresent_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RedirectPresent_1_0(b, l + 1);
    if (!r) r = IndexSpec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SenderSpec IndexSpec?
  private static boolean RedirectPresent_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RedirectPresent_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SenderSpec(b, l + 1);
    r = r && RedirectPresent_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IndexSpec?
  private static boolean RedirectPresent_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RedirectPresent_1_0_1")) return false;
    IndexSpec(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ( ParamSpec SenderSpec? IndexSpec? ) | ( SenderSpec IndexSpec? ) | IndexSpec
  public static boolean RedirectWithParamSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RedirectWithParamSpec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<redirect with param spec>");
    r = RedirectWithParamSpec_0(b, l + 1);
    if (!r) r = RedirectWithParamSpec_1(b, l + 1);
    if (!r) r = IndexSpec(b, l + 1);
    exit_section_(b, l, m, REDIRECT_WITH_PARAM_SPEC, r, false, null);
    return r;
  }

  // ParamSpec SenderSpec? IndexSpec?
  private static boolean RedirectWithParamSpec_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RedirectWithParamSpec_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParamSpec(b, l + 1);
    r = r && RedirectWithParamSpec_0_1(b, l + 1);
    r = r && RedirectWithParamSpec_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SenderSpec?
  private static boolean RedirectWithParamSpec_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RedirectWithParamSpec_0_1")) return false;
    SenderSpec(b, l + 1);
    return true;
  }

  // IndexSpec?
  private static boolean RedirectWithParamSpec_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RedirectWithParamSpec_0_2")) return false;
    IndexSpec(b, l + 1);
    return true;
  }

  // SenderSpec IndexSpec?
  private static boolean RedirectWithParamSpec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RedirectWithParamSpec_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SenderSpec(b, l + 1);
    r = r && RedirectWithParamSpec_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IndexSpec?
  private static boolean RedirectWithParamSpec_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RedirectWithParamSpec_1_1")) return false;
    IndexSpec(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ( ValueSpec ParamSpec? SenderSpec? IndexSpec? ) | RedirectWithParamSpec
  public static boolean RedirectWithValueAndParamSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RedirectWithValueAndParamSpec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<redirect with value and param spec>");
    r = RedirectWithValueAndParamSpec_0(b, l + 1);
    if (!r) r = RedirectWithParamSpec(b, l + 1);
    exit_section_(b, l, m, REDIRECT_WITH_VALUE_AND_PARAM_SPEC, r, false, null);
    return r;
  }

  // ValueSpec ParamSpec? SenderSpec? IndexSpec?
  private static boolean RedirectWithValueAndParamSpec_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RedirectWithValueAndParamSpec_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ValueSpec(b, l + 1);
    r = r && RedirectWithValueAndParamSpec_0_1(b, l + 1);
    r = r && RedirectWithValueAndParamSpec_0_2(b, l + 1);
    r = r && RedirectWithValueAndParamSpec_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ParamSpec?
  private static boolean RedirectWithValueAndParamSpec_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RedirectWithValueAndParamSpec_0_1")) return false;
    ParamSpec(b, l + 1);
    return true;
  }

  // SenderSpec?
  private static boolean RedirectWithValueAndParamSpec_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RedirectWithValueAndParamSpec_0_2")) return false;
    SenderSpec(b, l + 1);
    return true;
  }

  // IndexSpec?
  private static boolean RedirectWithValueAndParamSpec_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RedirectWithValueAndParamSpec_0_3")) return false;
    IndexSpec(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ExtendedIdentifier ExtendedFieldReference?
  static boolean ReferencedType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReferencedType")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExtendedIdentifier(b, l + 1);
    r = r && ReferencedType_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ExtendedFieldReference?
  private static boolean ReferencedType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReferencedType_1")) return false;
    ExtendedFieldReference(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ExtendedIdentifier ExtendedFieldReference?
  public static boolean ReferencedValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReferencedValue")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExtendedIdentifier(b, l + 1);
    r = r && ReferencedValue_1(b, l + 1);
    exit_section_(b, m, REFERENCED_VALUE, r);
    return r;
  }

  // ExtendedFieldReference?
  private static boolean ReferencedValue_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReferencedValue_1")) return false;
    ExtendedFieldReference(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ShiftExpression ( RelOp ShiftExpression )? | CompoundExpression
  static boolean RelExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RelExpression_0(b, l + 1);
    if (!r) r = CompoundExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ShiftExpression ( RelOp ShiftExpression )?
  private static boolean RelExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ShiftExpression(b, l + 1);
    r = r && RelExpression_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( RelOp ShiftExpression )?
  private static boolean RelExpression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelExpression_0_1")) return false;
    RelExpression_0_1_0(b, l + 1);
    return true;
  }

  // RelOp ShiftExpression
  private static boolean RelExpression_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelExpression_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RelOp(b, l + 1);
    r = r && ShiftExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_LESS | TTCN_LARGER | TTCN_LARGER_EQ | TTCN_LESS_EQ
  public static boolean RelOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<rel op>");
    r = consumeToken(b, TTCN_LESS);
    if (!r) r = consumeToken(b, TTCN_LARGER);
    if (!r) r = consumeToken(b, TTCN_LARGER_EQ);
    if (!r) r = consumeToken(b, TTCN_LESS_EQ);
    exit_section_(b, l, m, REL_OP, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ArrayIdentifierRef TTCN_DOT PortReplyOp
  public static boolean ReplyStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReplyStatement")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArrayIdentifierRef(b, l + 1);
    r = r && consumeToken(b, TTCN_DOT);
    r = r && PortReplyOp(b, l + 1);
    exit_section_(b, m, REPLY_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_VALUE Expression
  public static boolean ReplyValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReplyValue")) return false;
    if (!nextTokenIs(b, TTCN_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_VALUE);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, REPLY_VALUE, r);
    return r;
  }

  /* ********************************************************** */
  // OmitKeyword | ( TTCN_TEMPLATE TemplateRestriction )
  static boolean RestrictedTemplate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RestrictedTemplate")) return false;
    if (!nextTokenIs(b, "", TTCN_OMIT, TTCN_TEMPLATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OmitKeyword(b, l + 1);
    if (!r) r = RestrictedTemplate_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_TEMPLATE TemplateRestriction
  private static boolean RestrictedTemplate_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RestrictedTemplate_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_TEMPLATE);
    r = r && TemplateRestriction(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_RETURN (Expression | InLineTemplate)?
  public static boolean ReturnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement")) return false;
    if (!nextTokenIs(b, TTCN_RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_RETURN);
    r = r && ReturnStatement_1(b, l + 1);
    exit_section_(b, m, RETURN_STATEMENT, r);
    return r;
  }

  // (Expression | InLineTemplate)?
  private static boolean ReturnStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_1")) return false;
    ReturnStatement_1_0(b, l + 1);
    return true;
  }

  // Expression | InLineTemplate
  private static boolean ReturnStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    if (!r) r = InLineTemplate(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_RETURN (TTCN_TEMPLATE | RestrictedTemplate )? Type
  public static boolean ReturnType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnType")) return false;
    if (!nextTokenIs(b, TTCN_RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_RETURN);
    r = r && ReturnType_1(b, l + 1);
    r = r && Type(b, l + 1);
    exit_section_(b, m, RETURN_TYPE, r);
    return r;
  }

  // (TTCN_TEMPLATE | RestrictedTemplate )?
  private static boolean ReturnType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnType_1")) return false;
    ReturnType_1_0(b, l + 1);
    return true;
  }

  // TTCN_TEMPLATE | RestrictedTemplate
  private static boolean ReturnType_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnType_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_TEMPLATE);
    if (!r) r = RestrictedTemplate(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ComponentOrAny TTCN_DOT TTCN_RUNNING IndexAssignment?
  public static boolean RunningOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RunningOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<running op>");
    r = ComponentOrAny(b, l + 1);
    r = r && consumeTokens(b, 0, TTCN_DOT, TTCN_RUNNING);
    r = r && RunningOp_3(b, l + 1);
    exit_section_(b, l, m, RUNNING_OP, r, false, null);
    return r;
  }

  // IndexAssignment?
  private static boolean RunningOp_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RunningOp_3")) return false;
    IndexAssignment(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TimerRefOrAny TTCN_DOT TTCN_RUNNING IndexAssignment?
  public static boolean RunningTimerOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RunningTimerOp")) return false;
    if (!nextTokenIs(b, "<running timer op>", TTCN_ANY, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<running timer op>");
    r = TimerRefOrAny(b, l + 1);
    r = r && consumeTokens(b, 0, TTCN_DOT, TTCN_RUNNING);
    r = r && RunningTimerOp_3(b, l + 1);
    exit_section_(b, l, m, RUNNING_TIMER_OP, r, false, null);
    return r;
  }

  // IndexAssignment?
  private static boolean RunningTimerOp_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RunningTimerOp_3")) return false;
    IndexAssignment(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TTCN_RUNS TTCN_ON ComponentType
  public static boolean RunsOnSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RunsOnSpec")) return false;
    if (!nextTokenIs(b, TTCN_RUNS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_RUNS, TTCN_ON);
    r = r && ComponentType(b, l + 1);
    exit_section_(b, m, RUNS_ON_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_ACTION TTCN_LP ActionText (TTCN_CONNECT ActionText)* TTCN_RP
  public static boolean SUTStatements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SUTStatements")) return false;
    if (!nextTokenIs(b, TTCN_ACTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_ACTION, TTCN_LP);
    r = r && ActionText(b, l + 1);
    r = r && SUTStatements_3(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, SUT_STATEMENTS, r);
    return r;
  }

  // (TTCN_CONNECT ActionText)*
  private static boolean SUTStatements_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SUTStatements_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!SUTStatements_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SUTStatements_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_CONNECT ActionText
  private static boolean SUTStatements_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SUTStatements_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_CONNECT);
    r = r && ActionText(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_CASE ( TTCN_LP InLineTemplate (TTCN_COMMA InLineTemplate)* TTCN_RP | TTCN_ELSE ) StatementBlock
  public static boolean SelectCase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectCase")) return false;
    if (!nextTokenIs(b, TTCN_CASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_CASE);
    r = r && SelectCase_1(b, l + 1);
    r = r && StatementBlock(b, l + 1);
    exit_section_(b, m, SELECT_CASE, r);
    return r;
  }

  // TTCN_LP InLineTemplate (TTCN_COMMA InLineTemplate)* TTCN_RP | TTCN_ELSE
  private static boolean SelectCase_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectCase_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SelectCase_1_0(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_ELSE);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_LP InLineTemplate (TTCN_COMMA InLineTemplate)* TTCN_RP
  private static boolean SelectCase_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectCase_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LP);
    r = r && InLineTemplate(b, l + 1);
    r = r && SelectCase_1_0_2(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TTCN_COMMA InLineTemplate)*
  private static boolean SelectCase_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectCase_1_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!SelectCase_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SelectCase_1_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA InLineTemplate
  private static boolean SelectCase_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectCase_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && InLineTemplate(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_LB (SelectCase)+ TTCN_RB
  public static boolean SelectCaseBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectCaseBody")) return false;
    if (!nextTokenIs(b, TTCN_LB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LB);
    r = r && SelectCaseBody_1(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, SELECT_CASE_BODY, r);
    return r;
  }

  // (SelectCase)+
  private static boolean SelectCaseBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectCaseBody_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SelectCaseBody_1_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!SelectCaseBody_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SelectCaseBody_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (SelectCase)
  private static boolean SelectCaseBody_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectCaseBody_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SelectCase(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_SELECT TTCN_LP SingleExpression TTCN_RP SelectCaseBody
  public static boolean SelectCaseConstruct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectCaseConstruct")) return false;
    if (!nextTokenIs(b, TTCN_SELECT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_SELECT, TTCN_LP);
    r = r && SingleExpression(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    r = r && SelectCaseBody(b, l + 1);
    exit_section_(b, m, SELECT_CASE_CONSTRUCT, r);
    return r;
  }

  /* ********************************************************** */
  // ArrayIdentifierRef TTCN_DOT PortSendOp
  public static boolean SendStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SendStatement")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArrayIdentifierRef(b, l + 1);
    r = r && consumeToken(b, TTCN_DOT);
    r = r && PortSendOp(b, l + 1);
    exit_section_(b, m, SEND_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_SENDER VariableRef
  public static boolean SenderSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SenderSpec")) return false;
    if (!nextTokenIs(b, TTCN_SENDER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_SENDER);
    r = r && VariableRef(b, l + 1);
    exit_section_(b, m, SENDER_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_SET StructDefBody
  public static boolean SetDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetDef")) return false;
    if (!nextTokenIs(b, TTCN_SET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_SET);
    r = r && StructDefBody(b, l + 1);
    exit_section_(b, m, SET_DEF, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_SETVERDICT TTCN_LP SingleExpression (TTCN_COMMA LogItem)* TTCN_RP
  public static boolean SetLocalVerdict(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetLocalVerdict")) return false;
    if (!nextTokenIs(b, TTCN_SETVERDICT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_SETVERDICT, TTCN_LP);
    r = r && SingleExpression(b, l + 1);
    r = r && SetLocalVerdict_3(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, SET_LOCAL_VERDICT, r);
    return r;
  }

  // (TTCN_COMMA LogItem)*
  private static boolean SetLocalVerdict_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetLocalVerdict_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!SetLocalVerdict_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SetLocalVerdict_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA LogItem
  private static boolean SetLocalVerdict_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetLocalVerdict_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && LogItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_SET StringLength? TTCN_OF StructOfDefBody
  public static boolean SetOfDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetOfDef")) return false;
    if (!nextTokenIs(b, TTCN_SET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_SET);
    r = r && SetOfDef_1(b, l + 1);
    r = r && consumeToken(b, TTCN_OF);
    r = r && StructOfDefBody(b, l + 1);
    exit_section_(b, m, SET_OF_DEF, r);
    return r;
  }

  // StringLength?
  private static boolean SetOfDef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetOfDef_1")) return false;
    StringLength(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // BitOrExpression ( ShiftOp BitOrExpression )*
  static boolean ShiftExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShiftExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BitOrExpression(b, l + 1);
    r = r && ShiftExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ShiftOp BitOrExpression )*
  private static boolean ShiftExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShiftExpression_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ShiftExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ShiftExpression_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ShiftOp BitOrExpression
  private static boolean ShiftExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShiftExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ShiftOp(b, l + 1);
    r = r && BitOrExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_LEFT_SHIFT | TTCN_RIGHT_SHIFT | TTCN_LEFT_SHIFT_AT | TTCN_RIGHT_SHIFT_AT
  public static boolean ShiftOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShiftOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<shift op>");
    r = consumeToken(b, TTCN_LEFT_SHIFT);
    if (!r) r = consumeToken(b, TTCN_RIGHT_SHIFT);
    if (!r) r = consumeToken(b, TTCN_LEFT_SHIFT_AT);
    if (!r) r = consumeToken(b, TTCN_RIGHT_SHIFT_AT);
    exit_section_(b, l, m, SHIFT_OP, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ExtendedIdentifier
  public static boolean Signature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Signature")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExtendedIdentifier(b, l + 1);
    exit_section_(b, m, SIGNATURE, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_SIGNATURE Identifier TTCN_LP SignatureFormalParList? TTCN_RP (ReturnType | TTCN_NOBLOCK)? ExceptionSpec?
  public static boolean SignatureDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SignatureDef")) return false;
    if (!nextTokenIs(b, TTCN_SIGNATURE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_SIGNATURE);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, TTCN_LP);
    r = r && SignatureDef_3(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    r = r && SignatureDef_5(b, l + 1);
    r = r && SignatureDef_6(b, l + 1);
    exit_section_(b, m, SIGNATURE_DEF, r);
    return r;
  }

  // SignatureFormalParList?
  private static boolean SignatureDef_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SignatureDef_3")) return false;
    SignatureFormalParList(b, l + 1);
    return true;
  }

  // (ReturnType | TTCN_NOBLOCK)?
  private static boolean SignatureDef_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SignatureDef_5")) return false;
    SignatureDef_5_0(b, l + 1);
    return true;
  }

  // ReturnType | TTCN_NOBLOCK
  private static boolean SignatureDef_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SignatureDef_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ReturnType(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_NOBLOCK);
    exit_section_(b, m, null, r);
    return r;
  }

  // ExceptionSpec?
  private static boolean SignatureDef_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SignatureDef_6")) return false;
    ExceptionSpec(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // FormalValuePar (TTCN_COMMA FormalValuePar)*
  public static boolean SignatureFormalParList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SignatureFormalParList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<signature formal par list>");
    r = FormalValuePar(b, l + 1);
    r = r && SignatureFormalParList_1(b, l + 1);
    exit_section_(b, l, m, SIGNATURE_FORMAL_PAR_LIST, r, false, null);
    return r;
  }

  // (TTCN_COMMA FormalValuePar)*
  private static boolean SignatureFormalParList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SignatureFormalParList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!SignatureFormalParList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SignatureFormalParList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA FormalValuePar
  private static boolean SignatureFormalParList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SignatureFormalParList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && FormalValuePar(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Signature ( TTCN_COMMA Signature )*
  public static boolean SignatureList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SignatureList")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Signature(b, l + 1);
    r = r && SignatureList_1(b, l + 1);
    exit_section_(b, m, SIGNATURE_LIST, r);
    return r;
  }

  // ( TTCN_COMMA Signature )*
  private static boolean SignatureList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SignatureList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!SignatureList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SignatureList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA Signature
  private static boolean SignatureList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SignatureList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && Signature(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( SingleExpression (TTCN_CONNECT SimpleTemplateSpec)? ) | SimpleTemplateSpec
  public static boolean SimpleSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleSpec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<simple spec>");
    r = SimpleSpec_0(b, l + 1);
    if (!r) r = SimpleTemplateSpec(b, l + 1);
    exit_section_(b, l, m, SIMPLE_SPEC, r, false, null);
    return r;
  }

  // SingleExpression (TTCN_CONNECT SimpleTemplateSpec)?
  private static boolean SimpleSpec_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleSpec_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SingleExpression(b, l + 1);
    r = r && SimpleSpec_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TTCN_CONNECT SimpleTemplateSpec)?
  private static boolean SimpleSpec_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleSpec_0_1")) return false;
    SimpleSpec_0_1_0(b, l + 1);
    return true;
  }

  // TTCN_CONNECT SimpleTemplateSpec
  private static boolean SimpleSpec_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleSpec_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_CONNECT);
    r = r && SimpleTemplateSpec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SingleTemplateExpression (TTCN_CONNECT SimpleSpec)?
  public static boolean SimpleTemplateSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleTemplateSpec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<simple template spec>");
    r = SingleTemplateExpression(b, l + 1);
    r = r && SimpleTemplateSpec_1(b, l + 1);
    exit_section_(b, l, m, SIMPLE_TEMPLATE_SPEC, r, false, null);
    return r;
  }

  // (TTCN_CONNECT SimpleSpec)?
  private static boolean SimpleTemplateSpec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleTemplateSpec_1")) return false;
    SimpleTemplateSpec_1_0(b, l + 1);
    return true;
  }

  // TTCN_CONNECT SimpleSpec
  private static boolean SimpleTemplateSpec_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleTemplateSpec_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_CONNECT);
    r = r && SimpleSpec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_LP PortRef TTCN_COMMA PortRef TTCN_RP
  static boolean SingleConnectionSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleConnectionSpec")) return false;
    if (!nextTokenIs(b, TTCN_LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LP);
    r = r && PortRef(b, l + 1);
    r = r && consumeToken(b, TTCN_COMMA);
    r = r && PortRef(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier ArrayDef? TTCN_ASSIGN ConstantExpression
  public static boolean SingleConstDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleConstDef")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && SingleConstDef_1(b, l + 1);
    r = r && consumeToken(b, TTCN_ASSIGN);
    r = r && ConstantExpression(b, l + 1);
    exit_section_(b, m, SINGLE_CONST_DEF, r);
    return r;
  }

  // ArrayDef?
  private static boolean SingleConstDef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleConstDef_1")) return false;
    ArrayDef(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // XorExpression ( TTCN_OR XorExpression )*
  public static boolean SingleExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<single expression>");
    r = XorExpression(b, l + 1);
    r = r && SingleExpression_1(b, l + 1);
    exit_section_(b, l, m, SINGLE_EXPRESSION, r, false, null);
    return r;
  }

  // ( TTCN_OR XorExpression )*
  private static boolean SingleExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleExpression_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!SingleExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SingleExpression_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_OR XorExpression
  private static boolean SingleExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_OR);
    r = r && XorExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier ArrayDef? (TTCN_ASSIGN TemplateBody)?
  public static boolean SingleTempVarInstance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleTempVarInstance")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && SingleTempVarInstance_1(b, l + 1);
    r = r && SingleTempVarInstance_2(b, l + 1);
    exit_section_(b, m, SINGLE_TEMP_VAR_INSTANCE, r);
    return r;
  }

  // ArrayDef?
  private static boolean SingleTempVarInstance_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleTempVarInstance_1")) return false;
    ArrayDef(b, l + 1);
    return true;
  }

  // (TTCN_ASSIGN TemplateBody)?
  private static boolean SingleTempVarInstance_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleTempVarInstance_2")) return false;
    SingleTempVarInstance_2_0(b, l + 1);
    return true;
  }

  // TTCN_ASSIGN TemplateBody
  private static boolean SingleTempVarInstance_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleTempVarInstance_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_ASSIGN);
    r = r && TemplateBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MatchingSymbol | ( TemplateRefWithParList ExtendedFieldReference? )
  public static boolean SingleTemplateExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleTemplateExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<single template expression>");
    r = MatchingSymbol(b, l + 1);
    if (!r) r = SingleTemplateExpression_1(b, l + 1);
    exit_section_(b, l, m, SINGLE_TEMPLATE_EXPRESSION, r, false, null);
    return r;
  }

  // TemplateRefWithParList ExtendedFieldReference?
  private static boolean SingleTemplateExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleTemplateExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateRefWithParList(b, l + 1);
    r = r && SingleTemplateExpression_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ExtendedFieldReference?
  private static boolean SingleTemplateExpression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleTemplateExpression_1_1")) return false;
    ExtendedFieldReference(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // VariableRef (TTCN_ASSIGN FieldReference ExtendedFieldReference)?
  public static boolean SingleValueSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleValueSpec")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableRef(b, l + 1);
    r = r && SingleValueSpec_1(b, l + 1);
    exit_section_(b, m, SINGLE_VALUE_SPEC, r);
    return r;
  }

  // (TTCN_ASSIGN FieldReference ExtendedFieldReference)?
  private static boolean SingleValueSpec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleValueSpec_1")) return false;
    SingleValueSpec_1_0(b, l + 1);
    return true;
  }

  // TTCN_ASSIGN FieldReference ExtendedFieldReference
  private static boolean SingleValueSpec_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleValueSpec_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_ASSIGN);
    r = r && FieldReference(b, l + 1);
    r = r && ExtendedFieldReference(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier ArrayDef? (TTCN_ASSIGN Expression)?
  public static boolean SingleVarInstance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleVarInstance")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && SingleVarInstance_1(b, l + 1);
    r = r && SingleVarInstance_2(b, l + 1);
    exit_section_(b, m, SINGLE_VAR_INSTANCE, r);
    return r;
  }

  // ArrayDef?
  private static boolean SingleVarInstance_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleVarInstance_1")) return false;
    ArrayDef(b, l + 1);
    return true;
  }

  // (TTCN_ASSIGN Expression)?
  private static boolean SingleVarInstance_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleVarInstance_2")) return false;
    SingleVarInstance_2_0(b, l + 1);
    return true;
  }

  // TTCN_ASSIGN Expression
  private static boolean SingleVarInstance_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleVarInstance_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_ASSIGN);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AttribKeyword TTCN_OVERRIDE? AttribQualifier? FreeText
  public static boolean SingleWithAttrib(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleWithAttrib")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<single with attrib>");
    r = AttribKeyword(b, l + 1);
    r = r && SingleWithAttrib_1(b, l + 1);
    r = r && SingleWithAttrib_2(b, l + 1);
    r = r && FreeText(b, l + 1);
    exit_section_(b, l, m, SINGLE_WITH_ATTRIB, r, false, null);
    return r;
  }

  // TTCN_OVERRIDE?
  private static boolean SingleWithAttrib_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleWithAttrib_1")) return false;
    consumeToken(b, TTCN_OVERRIDE);
    return true;
  }

  // AttribQualifier?
  private static boolean SingleWithAttrib_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleWithAttrib_2")) return false;
    AttribQualifier(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // PortOrAll TTCN_DOT TTCN_START
  public static boolean StartStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartStatement")) return false;
    if (!nextTokenIs(b, "<start statement>", TTCN_ALL, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<start statement>");
    r = PortOrAll(b, l + 1);
    r = r && consumeTokens(b, 0, TTCN_DOT, TTCN_START);
    exit_section_(b, l, m, START_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ComponentOrDefaultReference TTCN_DOT TTCN_START TTCN_LP FunctionInstance TTCN_RP
  public static boolean StartTCStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartTCStatement")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ComponentOrDefaultReference(b, l + 1);
    r = r && consumeTokens(b, 0, TTCN_DOT, TTCN_START, TTCN_LP);
    r = r && FunctionInstance(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, START_TC_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // ArrayIdentifierRef TTCN_DOT TTCN_START ( TTCN_LP Expression TTCN_RP )?
  public static boolean StartTimerStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartTimerStatement")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArrayIdentifierRef(b, l + 1);
    r = r && consumeTokens(b, 0, TTCN_DOT, TTCN_START);
    r = r && StartTimerStatement_3(b, l + 1);
    exit_section_(b, m, START_TIMER_STATEMENT, r);
    return r;
  }

  // ( TTCN_LP Expression TTCN_RP )?
  private static boolean StartTimerStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartTimerStatement_3")) return false;
    StartTimerStatement_3_0(b, l + 1);
    return true;
  }

  // TTCN_LP Expression TTCN_RP
  private static boolean StartTimerStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StartTimerStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LP);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_LB FunctionDefList* FunctionStatementList* TTCN_RB
  public static boolean StatementBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementBlock")) return false;
    if (!nextTokenIs(b, TTCN_LB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LB);
    r = r && StatementBlock_1(b, l + 1);
    r = r && StatementBlock_2(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, STATEMENT_BLOCK, r);
    return r;
  }

  // FunctionDefList*
  private static boolean StatementBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementBlock_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!FunctionDefList(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StatementBlock_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // FunctionStatementList*
  private static boolean StatementBlock_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementBlock_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!FunctionStatementList(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StatementBlock_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // PortOrAll TTCN_DOT TTCN_STOP
  public static boolean StopStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StopStatement")) return false;
    if (!nextTokenIs(b, "<stop statement>", TTCN_ALL, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<stop statement>");
    r = PortOrAll(b, l + 1);
    r = r && consumeTokens(b, 0, TTCN_DOT, TTCN_STOP);
    exit_section_(b, l, m, STOP_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_STOP | ( ComponentReferenceOrLiteral | TTCN_ALL TTCN_COMPONENT ) TTCN_DOT TTCN_STOP
  public static boolean StopTCStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StopTCStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<stop tc statement>");
    r = consumeToken(b, TTCN_STOP);
    if (!r) r = StopTCStatement_1(b, l + 1);
    exit_section_(b, l, m, STOP_TC_STATEMENT, r, false, null);
    return r;
  }

  // ( ComponentReferenceOrLiteral | TTCN_ALL TTCN_COMPONENT ) TTCN_DOT TTCN_STOP
  private static boolean StopTCStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StopTCStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StopTCStatement_1_0(b, l + 1);
    r = r && consumeTokens(b, 0, TTCN_DOT, TTCN_STOP);
    exit_section_(b, m, null, r);
    return r;
  }

  // ComponentReferenceOrLiteral | TTCN_ALL TTCN_COMPONENT
  private static boolean StopTCStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StopTCStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ComponentReferenceOrLiteral(b, l + 1);
    if (!r) r = parseTokens(b, 0, TTCN_ALL, TTCN_COMPONENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TimerRefOrAll TTCN_DOT TTCN_STOP
  public static boolean StopTimerStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StopTimerStatement")) return false;
    if (!nextTokenIs(b, "<stop timer statement>", TTCN_ALL, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<stop timer statement>");
    r = TimerRefOrAll(b, l + 1);
    r = r && consumeTokens(b, 0, TTCN_DOT, TTCN_STOP);
    exit_section_(b, l, m, STOP_TIMER_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_LENGTH TTCN_LP SingleExpression ( TTCN_POINT_CONNECT Bound )? TTCN_RP
  static boolean StringLength(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLength")) return false;
    if (!nextTokenIs(b, TTCN_LENGTH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_LENGTH, TTCN_LP);
    r = r && SingleExpression(b, l + 1);
    r = r && StringLength_3(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_POINT_CONNECT Bound )?
  private static boolean StringLength_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLength_3")) return false;
    StringLength_3_0(b, l + 1);
    return true;
  }

  // TTCN_POINT_CONNECT Bound
  private static boolean StringLength_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLength_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_POINT_CONNECT);
    r = r && Bound(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( Identifier | AddressKeyword ) TTCN_LB (StructFieldDef ( TTCN_COMMA StructFieldDef )* )? TTCN_RB
  static boolean StructDefBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDefBody")) return false;
    if (!nextTokenIs(b, "", TTCN_ADDRESS, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StructDefBody_0(b, l + 1);
    r = r && consumeToken(b, TTCN_LB);
    r = r && StructDefBody_2(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier | AddressKeyword
  private static boolean StructDefBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDefBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    if (!r) r = AddressKeyword(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (StructFieldDef ( TTCN_COMMA StructFieldDef )* )?
  private static boolean StructDefBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDefBody_2")) return false;
    StructDefBody_2_0(b, l + 1);
    return true;
  }

  // StructFieldDef ( TTCN_COMMA StructFieldDef )*
  private static boolean StructDefBody_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDefBody_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StructFieldDef(b, l + 1);
    r = r && StructDefBody_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_COMMA StructFieldDef )*
  private static boolean StructDefBody_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDefBody_2_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!StructDefBody_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StructDefBody_2_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA StructFieldDef
  private static boolean StructDefBody_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDefBody_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && StructFieldDef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( Type | NestedTypeDef ) Identifier ArrayDef? SubTypeSpec? TTCN_OPTIONAL?
  static boolean StructFieldDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructFieldDef")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StructFieldDef_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && StructFieldDef_2(b, l + 1);
    r = r && StructFieldDef_3(b, l + 1);
    r = r && StructFieldDef_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Type | NestedTypeDef
  private static boolean StructFieldDef_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructFieldDef_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Type(b, l + 1);
    if (!r) r = NestedTypeDef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ArrayDef?
  private static boolean StructFieldDef_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructFieldDef_2")) return false;
    ArrayDef(b, l + 1);
    return true;
  }

  // SubTypeSpec?
  private static boolean StructFieldDef_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructFieldDef_3")) return false;
    SubTypeSpec(b, l + 1);
    return true;
  }

  // TTCN_OPTIONAL?
  private static boolean StructFieldDef_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructFieldDef_4")) return false;
    consumeToken(b, TTCN_OPTIONAL);
    return true;
  }

  /* ********************************************************** */
  // Identifier | PredefinedType | TypeReference
  public static boolean StructFieldRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructFieldRef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<struct field ref>");
    r = Identifier(b, l + 1);
    if (!r) r = PredefinedType(b, l + 1);
    if (!r) r = TypeReference(b, l + 1);
    exit_section_(b, l, m, STRUCT_FIELD_REF, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( Type | NestedTypeDef ) ( Identifier | AddressKeyword ) SubTypeSpec?
  static boolean StructOfDefBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructOfDefBody")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StructOfDefBody_0(b, l + 1);
    r = r && StructOfDefBody_1(b, l + 1);
    r = r && StructOfDefBody_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Type | NestedTypeDef
  private static boolean StructOfDefBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructOfDefBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Type(b, l + 1);
    if (!r) r = NestedTypeDef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier | AddressKeyword
  private static boolean StructOfDefBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructOfDefBody_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    if (!r) r = AddressKeyword(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SubTypeSpec?
  private static boolean StructOfDefBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructOfDefBody_2")) return false;
    SubTypeSpec(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // RecordDef | UnionDef | SetDef | RecordOfDef | SetOfDef | EnumDef | PortDef | ComponentDef
  static boolean StructuredTypeDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructuredTypeDef")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RecordDef(b, l + 1);
    if (!r) r = UnionDef(b, l + 1);
    if (!r) r = SetDef(b, l + 1);
    if (!r) r = RecordOfDef(b, l + 1);
    if (!r) r = SetOfDef(b, l + 1);
    if (!r) r = EnumDef(b, l + 1);
    if (!r) r = PortDef(b, l + 1);
    if (!r) r = ComponentDef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Type ( Identifier | AddressKeyword ) ArrayDef? SubTypeSpec?
  static boolean SubTypeDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubTypeDef")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Type(b, l + 1);
    r = r && SubTypeDef_1(b, l + 1);
    r = r && SubTypeDef_2(b, l + 1);
    r = r && SubTypeDef_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier | AddressKeyword
  private static boolean SubTypeDef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubTypeDef_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    if (!r) r = AddressKeyword(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ArrayDef?
  private static boolean SubTypeDef_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubTypeDef_2")) return false;
    ArrayDef(b, l + 1);
    return true;
  }

  // SubTypeSpec?
  private static boolean SubTypeDef_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubTypeDef_3")) return false;
    SubTypeSpec(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // AllowedValuesSpec StringLength? | StringLength
  public static boolean SubTypeSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubTypeSpec")) return false;
    if (!nextTokenIs(b, "<sub type spec>", TTCN_LENGTH, TTCN_LP)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<sub type spec>");
    r = SubTypeSpec_0(b, l + 1);
    if (!r) r = StringLength(b, l + 1);
    exit_section_(b, l, m, SUB_TYPE_SPEC, r, false, null);
    return r;
  }

  // AllowedValuesSpec StringLength?
  private static boolean SubTypeSpec_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubTypeSpec_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AllowedValuesSpec(b, l + 1);
    r = r && SubTypeSpec_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // StringLength?
  private static boolean SubTypeSpec_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubTypeSpec_0_1")) return false;
    StringLength(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TTCN_SUBSET ListOfTemplates
  public static boolean SubsetMatch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubsetMatch")) return false;
    if (!nextTokenIs(b, TTCN_SUBSET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_SUBSET);
    r = r && ListOfTemplates(b, l + 1);
    exit_section_(b, m, SUBSET_MATCH, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_SUPERSET ListOfTemplates
  public static boolean SupersetMatch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SupersetMatch")) return false;
    if (!nextTokenIs(b, TTCN_SUPERSET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_SUPERSET);
    r = r && ListOfTemplates(b, l + 1);
    exit_section_(b, m, SUPERSET_MATCH, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_SYSTEM ComponentType
  public static boolean SystemSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SystemSpec")) return false;
    if (!nextTokenIs(b, TTCN_SYSTEM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_SYSTEM);
    r = r && ComponentType(b, l + 1);
    exit_section_(b, m, SYSTEM_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // SingleTempVarInstance ( TTCN_COMMA SingleTempVarInstance)*
  public static boolean TempVarList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TempVarList")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SingleTempVarInstance(b, l + 1);
    r = r && TempVarList_1(b, l + 1);
    exit_section_(b, m, TEMP_VAR_LIST, r);
    return r;
  }

  // ( TTCN_COMMA SingleTempVarInstance)*
  private static boolean TempVarList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TempVarList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TempVarList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TempVarList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA SingleTempVarInstance
  private static boolean TempVarList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TempVarList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && SingleTempVarInstance(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_LP ( ( TemplateInstanceActualPar ( TTCN_COMMA TemplateInstanceActualPar )* ) | ( TemplateInstanceAssignment ( TTCN_COMMA TemplateInstanceAssignment )* ) )? TTCN_RP
  public static boolean TemplateActualParList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateActualParList")) return false;
    if (!nextTokenIs(b, TTCN_LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LP);
    r = r && TemplateActualParList_1(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, TEMPLATE_ACTUAL_PAR_LIST, r);
    return r;
  }

  // ( ( TemplateInstanceActualPar ( TTCN_COMMA TemplateInstanceActualPar )* ) | ( TemplateInstanceAssignment ( TTCN_COMMA TemplateInstanceAssignment )* ) )?
  private static boolean TemplateActualParList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateActualParList_1")) return false;
    TemplateActualParList_1_0(b, l + 1);
    return true;
  }

  // ( TemplateInstanceActualPar ( TTCN_COMMA TemplateInstanceActualPar )* ) | ( TemplateInstanceAssignment ( TTCN_COMMA TemplateInstanceAssignment )* )
  private static boolean TemplateActualParList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateActualParList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateActualParList_1_0_0(b, l + 1);
    if (!r) r = TemplateActualParList_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TemplateInstanceActualPar ( TTCN_COMMA TemplateInstanceActualPar )*
  private static boolean TemplateActualParList_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateActualParList_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateInstanceActualPar(b, l + 1);
    r = r && TemplateActualParList_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_COMMA TemplateInstanceActualPar )*
  private static boolean TemplateActualParList_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateActualParList_1_0_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TemplateActualParList_1_0_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TemplateActualParList_1_0_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA TemplateInstanceActualPar
  private static boolean TemplateActualParList_1_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateActualParList_1_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && TemplateInstanceActualPar(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TemplateInstanceAssignment ( TTCN_COMMA TemplateInstanceAssignment )*
  private static boolean TemplateActualParList_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateActualParList_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateInstanceAssignment(b, l + 1);
    r = r && TemplateActualParList_1_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_COMMA TemplateInstanceAssignment )*
  private static boolean TemplateActualParList_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateActualParList_1_0_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TemplateActualParList_1_0_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TemplateActualParList_1_0_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA TemplateInstanceAssignment
  private static boolean TemplateActualParList_1_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateActualParList_1_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && TemplateInstanceAssignment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( SimpleSpec | FieldSpecList | ArrayValueOrAttrib ) ExtraMatchingAttributes?
  public static boolean TemplateBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<template body>");
    r = TemplateBody_0(b, l + 1);
    r = r && TemplateBody_1(b, l + 1);
    exit_section_(b, l, m, TEMPLATE_BODY, r, false, null);
    return r;
  }

  // SimpleSpec | FieldSpecList | ArrayValueOrAttrib
  private static boolean TemplateBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SimpleSpec(b, l + 1);
    if (!r) r = FieldSpecList(b, l + 1);
    if (!r) r = ArrayValueOrAttrib(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ExtraMatchingAttributes?
  private static boolean TemplateBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateBody_1")) return false;
    ExtraMatchingAttributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TTCN_TEMPLATE TemplateRestriction? TTCN_AT_FUZZY? BaseTemplate DerivedDef? TTCN_ASSIGN TemplateBody
  public static boolean TemplateDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateDef")) return false;
    if (!nextTokenIs(b, TTCN_TEMPLATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_TEMPLATE);
    r = r && TemplateDef_1(b, l + 1);
    r = r && TemplateDef_2(b, l + 1);
    r = r && BaseTemplate(b, l + 1);
    r = r && TemplateDef_4(b, l + 1);
    r = r && consumeToken(b, TTCN_ASSIGN);
    r = r && TemplateBody(b, l + 1);
    exit_section_(b, m, TEMPLATE_DEF, r);
    return r;
  }

  // TemplateRestriction?
  private static boolean TemplateDef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateDef_1")) return false;
    TemplateRestriction(b, l + 1);
    return true;
  }

  // TTCN_AT_FUZZY?
  private static boolean TemplateDef_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateDef_2")) return false;
    consumeToken(b, TTCN_AT_FUZZY);
    return true;
  }

  // DerivedDef?
  private static boolean TemplateDef_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateDef_4")) return false;
    DerivedDef(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // InLineTemplate | TTCN_SUB
  public static boolean TemplateInstanceActualPar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateInstanceActualPar")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<template instance actual par>");
    r = InLineTemplate(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_SUB);
    exit_section_(b, l, m, TEMPLATE_INSTANCE_ACTUAL_PAR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Identifier TTCN_ASSIGN InLineTemplate
  public static boolean TemplateInstanceAssignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateInstanceAssignment")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, TTCN_ASSIGN);
    r = r && InLineTemplate(b, l + 1);
    exit_section_(b, m, TEMPLATE_INSTANCE_ASSIGNMENT, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_LP TemplateBody (TTCN_COMMA TemplateBody)+ TTCN_RP
  public static boolean TemplateList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateList")) return false;
    if (!nextTokenIs(b, TTCN_LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LP);
    r = r && TemplateBody(b, l + 1);
    r = r && TemplateList_2(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, TEMPLATE_LIST, r);
    return r;
  }

  // (TTCN_COMMA TemplateBody)+
  private static boolean TemplateList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateList_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateList_2_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!TemplateList_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TemplateList_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_COMMA TemplateBody
  private static boolean TemplateList_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateList_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && TemplateBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TemplateBody | AllElementsFrom
  public static boolean TemplateListItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateListItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<template list item>");
    r = TemplateBody(b, l + 1);
    if (!r) r = AllElementsFrom(b, l + 1);
    exit_section_(b, l, m, TEMPLATE_LIST_ITEM, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // MatchOp | ValueofOp
  public static boolean TemplateOps(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateOps")) return false;
    if (!nextTokenIs(b, "<template ops>", TTCN_MATCH, TTCN_VALUEOF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<template ops>");
    r = MatchOp(b, l + 1);
    if (!r) r = ValueofOp(b, l + 1);
    exit_section_(b, l, m, TEMPLATE_OPS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // RangeDef | TemplateBody | Type
  public static boolean TemplateOrRange(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateOrRange")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<template or range>");
    r = RangeDef(b, l + 1);
    if (!r) r = TemplateBody(b, l + 1);
    if (!r) r = Type(b, l + 1);
    exit_section_(b, l, m, TEMPLATE_OR_RANGE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FormalValuePar | FormalTemplatePar
  static boolean TemplateOrValueFormalPar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateOrValueFormalPar")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FormalValuePar(b, l + 1);
    if (!r) r = FormalTemplatePar(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TemplateOrValueFormalPar ( TTCN_COMMA TemplateOrValueFormalPar )*
  static boolean TemplateOrValueFormalParList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateOrValueFormalParList")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateOrValueFormalPar(b, l + 1);
    r = r && TemplateOrValueFormalParList_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_COMMA TemplateOrValueFormalPar )*
  private static boolean TemplateOrValueFormalParList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateOrValueFormalParList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TemplateOrValueFormalParList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TemplateOrValueFormalParList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA TemplateOrValueFormalPar
  private static boolean TemplateOrValueFormalParList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateOrValueFormalParList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && TemplateOrValueFormalPar(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ExtendedIdentifier TemplateActualParList?
  public static boolean TemplateRefWithParList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateRefWithParList")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExtendedIdentifier(b, l + 1);
    r = r && TemplateRefWithParList_1(b, l + 1);
    exit_section_(b, m, TEMPLATE_REF_WITH_PAR_LIST, r);
    return r;
  }

  // TemplateActualParList?
  private static boolean TemplateRefWithParList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateRefWithParList_1")) return false;
    TemplateActualParList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TTCN_LP ( OmitKeyword | TTCN_VALUE | TTCN_PRESENT ) TTCN_RP
  static boolean TemplateRestriction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateRestriction")) return false;
    if (!nextTokenIs(b, TTCN_LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LP);
    r = r && TemplateRestriction_1(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // OmitKeyword | TTCN_VALUE | TTCN_PRESENT
  private static boolean TemplateRestriction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateRestriction_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OmitKeyword(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_VALUE);
    if (!r) r = consumeToken(b, TTCN_PRESENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( TemplateInstanceActualPar (TTCN_COMMA TemplateInstanceActualPar)* ) | ( TemplateInstanceAssignment ( TTCN_COMMA TemplateInstanceAssignment )* )
  public static boolean TestcaseActualParList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TestcaseActualParList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<testcase actual par list>");
    r = TestcaseActualParList_0(b, l + 1);
    if (!r) r = TestcaseActualParList_1(b, l + 1);
    exit_section_(b, l, m, TESTCASE_ACTUAL_PAR_LIST, r, false, null);
    return r;
  }

  // TemplateInstanceActualPar (TTCN_COMMA TemplateInstanceActualPar)*
  private static boolean TestcaseActualParList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TestcaseActualParList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateInstanceActualPar(b, l + 1);
    r = r && TestcaseActualParList_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TTCN_COMMA TemplateInstanceActualPar)*
  private static boolean TestcaseActualParList_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TestcaseActualParList_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TestcaseActualParList_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TestcaseActualParList_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA TemplateInstanceActualPar
  private static boolean TestcaseActualParList_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TestcaseActualParList_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && TemplateInstanceActualPar(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TemplateInstanceAssignment ( TTCN_COMMA TemplateInstanceAssignment )*
  private static boolean TestcaseActualParList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TestcaseActualParList_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateInstanceAssignment(b, l + 1);
    r = r && TestcaseActualParList_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_COMMA TemplateInstanceAssignment )*
  private static boolean TestcaseActualParList_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TestcaseActualParList_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TestcaseActualParList_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TestcaseActualParList_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA TemplateInstanceAssignment
  private static boolean TestcaseActualParList_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TestcaseActualParList_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && TemplateInstanceAssignment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_TESTCASE Identifier TTCN_LP TemplateOrValueFormalParList? TTCN_RP ConfigSpec StatementBlock
  public static boolean TestcaseDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TestcaseDef")) return false;
    if (!nextTokenIs(b, TTCN_TESTCASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_TESTCASE);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, TTCN_LP);
    r = r && TestcaseDef_3(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    r = r && ConfigSpec(b, l + 1);
    r = r && StatementBlock(b, l + 1);
    exit_section_(b, m, TESTCASE_DEF, r);
    return r;
  }

  // TemplateOrValueFormalParList?
  private static boolean TestcaseDef_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TestcaseDef_3")) return false;
    TemplateOrValueFormalParList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TTCN_EXECUTE TTCN_LP ExtendedIdentifier TTCN_LP TestcaseActualParList? TTCN_RP (TTCN_COMMA ( Expression | TTCN_SUB ) (TTCN_COMMA SingleExpression)? )? TTCN_RP
  public static boolean TestcaseInstance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TestcaseInstance")) return false;
    if (!nextTokenIs(b, TTCN_EXECUTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_EXECUTE, TTCN_LP);
    r = r && ExtendedIdentifier(b, l + 1);
    r = r && consumeToken(b, TTCN_LP);
    r = r && TestcaseInstance_4(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    r = r && TestcaseInstance_6(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, TESTCASE_INSTANCE, r);
    return r;
  }

  // TestcaseActualParList?
  private static boolean TestcaseInstance_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TestcaseInstance_4")) return false;
    TestcaseActualParList(b, l + 1);
    return true;
  }

  // (TTCN_COMMA ( Expression | TTCN_SUB ) (TTCN_COMMA SingleExpression)? )?
  private static boolean TestcaseInstance_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TestcaseInstance_6")) return false;
    TestcaseInstance_6_0(b, l + 1);
    return true;
  }

  // TTCN_COMMA ( Expression | TTCN_SUB ) (TTCN_COMMA SingleExpression)?
  private static boolean TestcaseInstance_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TestcaseInstance_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && TestcaseInstance_6_0_1(b, l + 1);
    r = r && TestcaseInstance_6_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression | TTCN_SUB
  private static boolean TestcaseInstance_6_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TestcaseInstance_6_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_SUB);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TTCN_COMMA SingleExpression)?
  private static boolean TestcaseInstance_6_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TestcaseInstance_6_0_2")) return false;
    TestcaseInstance_6_0_2_0(b, l + 1);
    return true;
  }

  // TTCN_COMMA SingleExpression
  private static boolean TestcaseInstance_6_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TestcaseInstance_6_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && SingleExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_TESTCASE TTCN_DOT TTCN_STOP (TTCN_LP ( ( FreeText | InLineTemplate ) (TTCN_COMMA)? )* TTCN_RP)?
  public static boolean TestcaseOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TestcaseOperation")) return false;
    if (!nextTokenIs(b, TTCN_TESTCASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_TESTCASE, TTCN_DOT, TTCN_STOP);
    r = r && TestcaseOperation_3(b, l + 1);
    exit_section_(b, m, TESTCASE_OPERATION, r);
    return r;
  }

  // (TTCN_LP ( ( FreeText | InLineTemplate ) (TTCN_COMMA)? )* TTCN_RP)?
  private static boolean TestcaseOperation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TestcaseOperation_3")) return false;
    TestcaseOperation_3_0(b, l + 1);
    return true;
  }

  // TTCN_LP ( ( FreeText | InLineTemplate ) (TTCN_COMMA)? )* TTCN_RP
  private static boolean TestcaseOperation_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TestcaseOperation_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LP);
    r = r && TestcaseOperation_3_0_1(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( FreeText | InLineTemplate ) (TTCN_COMMA)? )*
  private static boolean TestcaseOperation_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TestcaseOperation_3_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TestcaseOperation_3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TestcaseOperation_3_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ( FreeText | InLineTemplate ) (TTCN_COMMA)?
  private static boolean TestcaseOperation_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TestcaseOperation_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TestcaseOperation_3_0_1_0_0(b, l + 1);
    r = r && TestcaseOperation_3_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // FreeText | InLineTemplate
  private static boolean TestcaseOperation_3_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TestcaseOperation_3_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FreeText(b, l + 1);
    if (!r) r = InLineTemplate(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TTCN_COMMA)?
  private static boolean TestcaseOperation_3_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TestcaseOperation_3_0_1_0_1")) return false;
    consumeToken(b, TTCN_COMMA);
    return true;
  }

  /* ********************************************************** */
  // TimerRefOrAny TTCN_DOT TTCN_TIMEOUT IndexAssignment?
  public static boolean TimeoutStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TimeoutStatement")) return false;
    if (!nextTokenIs(b, "<timeout statement>", TTCN_ANY, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<timeout statement>");
    r = TimerRefOrAny(b, l + 1);
    r = r && consumeTokens(b, 0, TTCN_DOT, TTCN_TIMEOUT);
    r = r && TimeoutStatement_3(b, l + 1);
    exit_section_(b, l, m, TIMEOUT_STATEMENT, r, false, null);
    return r;
  }

  // IndexAssignment?
  private static boolean TimeoutStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TimeoutStatement_3")) return false;
    IndexAssignment(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TTCN_TIMER VarList
  public static boolean TimerInstance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TimerInstance")) return false;
    if (!nextTokenIs(b, TTCN_TIMER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_TIMER);
    r = r && VarList(b, l + 1);
    exit_section_(b, m, TIMER_INSTANCE, r);
    return r;
  }

  /* ********************************************************** */
  // ReadTimerOp | RunningTimerOp
  public static boolean TimerOps(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TimerOps")) return false;
    if (!nextTokenIs(b, "<timer ops>", TTCN_ANY, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<timer ops>");
    r = ReadTimerOp(b, l + 1);
    if (!r) r = RunningTimerOp(b, l + 1);
    exit_section_(b, l, m, TIMER_OPS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ArrayIdentifierRef | TTCN_ALL TTCN_TIMER
  public static boolean TimerRefOrAll(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TimerRefOrAll")) return false;
    if (!nextTokenIs(b, "<timer ref or all>", TTCN_ALL, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<timer ref or all>");
    r = ArrayIdentifierRef(b, l + 1);
    if (!r) r = parseTokens(b, 0, TTCN_ALL, TTCN_TIMER);
    exit_section_(b, l, m, TIMER_REF_OR_ALL, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ArrayIdentifierRef | ( TTCN_ANY TTCN_TIMER ) | ( TTCN_ANY TTCN_FROM Identifier )
  public static boolean TimerRefOrAny(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TimerRefOrAny")) return false;
    if (!nextTokenIs(b, "<timer ref or any>", TTCN_ANY, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<timer ref or any>");
    r = ArrayIdentifierRef(b, l + 1);
    if (!r) r = TimerRefOrAny_1(b, l + 1);
    if (!r) r = TimerRefOrAny_2(b, l + 1);
    exit_section_(b, l, m, TIMER_REF_OR_ANY, r, false, null);
    return r;
  }

  // TTCN_ANY TTCN_TIMER
  private static boolean TimerRefOrAny_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TimerRefOrAny_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_ANY, TTCN_TIMER);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_ANY TTCN_FROM Identifier
  private static boolean TimerRefOrAny_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TimerRefOrAny_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_ANY, TTCN_FROM);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // StartTimerStatement | StopTimerStatement | TimeoutStatement
  public static boolean TimerStatements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TimerStatements")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<timer statements>");
    r = StartTimerStatement(b, l + 1);
    if (!r) r = StopTimerStatement(b, l + 1);
    if (!r) r = TimeoutStatement(b, l + 1);
    exit_section_(b, l, m, TIMER_STATEMENTS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_TO ( InLineTemplate | AddressRefList | TTCN_ALL TTCN_COMPONENT )
  public static boolean ToClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ToClause")) return false;
    if (!nextTokenIs(b, TTCN_TO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_TO);
    r = r && ToClause_1(b, l + 1);
    exit_section_(b, m, TO_CLAUSE, r);
    return r;
  }

  // InLineTemplate | AddressRefList | TTCN_ALL TTCN_COMPONENT
  private static boolean ToClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ToClause_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InLineTemplate(b, l + 1);
    if (!r) r = AddressRefList(b, l + 1);
    if (!r) r = parseTokens(b, 0, TTCN_ALL, TTCN_COMPONENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PortOrAny TTCN_DOT PortTriggerOp
  public static boolean TriggerStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TriggerStatement")) return false;
    if (!nextTokenIs(b, "<trigger statement>", TTCN_ANY, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<trigger statement>");
    r = PortOrAny(b, l + 1);
    r = r && consumeToken(b, TTCN_DOT);
    r = r && PortTriggerOp(b, l + 1);
    exit_section_(b, l, m, TRIGGER_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PredefinedType | ReferencedType
  public static boolean Type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<type>");
    r = PredefinedType(b, l + 1);
    if (!r) r = ReferencedType(b, l + 1);
    exit_section_(b, l, m, TYPE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_TYPE TypeDefBody
  public static boolean TypeDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeDef")) return false;
    if (!nextTokenIs(b, TTCN_TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_TYPE);
    r = r && TypeDefBody(b, l + 1);
    exit_section_(b, m, TYPE_DEF, r);
    return r;
  }

  /* ********************************************************** */
  // StructuredTypeDef | SubTypeDef
  static boolean TypeDefBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeDefBody")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StructuredTypeDef(b, l + 1);
    if (!r) r = SubTypeDef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Type ( TTCN_COMMA Type )*
  public static boolean TypeList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<type list>");
    r = Type(b, l + 1);
    r = r && TypeList_1(b, l + 1);
    exit_section_(b, l, m, TYPE_LIST, r, false, null);
    return r;
  }

  // ( TTCN_COMMA Type )*
  private static boolean TypeList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TypeList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA Type
  private static boolean TypeList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier
  public static boolean TypeReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeReference")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    exit_section_(b, m, TYPE_REFERENCE, r);
    return r;
  }

  /* ********************************************************** */
  // UnaryOp? Primary
  static boolean UnaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnaryExpression_0(b, l + 1);
    r = r && Primary(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // UnaryOp?
  private static boolean UnaryExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_0")) return false;
    UnaryOp(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TTCN_ADD | TTCN_SUB
  public static boolean UnaryOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryOp")) return false;
    if (!nextTokenIs(b, "<unary op>", TTCN_ADD, TTCN_SUB)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<unary op>");
    r = consumeToken(b, TTCN_ADD);
    if (!r) r = consumeToken(b, TTCN_SUB);
    exit_section_(b, l, m, UNARY_OP, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_UNION UnionDefBody
  public static boolean UnionDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionDef")) return false;
    if (!nextTokenIs(b, TTCN_UNION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_UNION);
    r = r && UnionDefBody(b, l + 1);
    exit_section_(b, m, UNION_DEF, r);
    return r;
  }

  /* ********************************************************** */
  // ( Identifier | AddressKeyword ) TTCN_LB UnionFieldDef ( TTCN_COMMA UnionFieldDef )* TTCN_RB
  static boolean UnionDefBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionDefBody")) return false;
    if (!nextTokenIs(b, "", TTCN_ADDRESS, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnionDefBody_0(b, l + 1);
    r = r && consumeToken(b, TTCN_LB);
    r = r && UnionFieldDef(b, l + 1);
    r = r && UnionDefBody_3(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier | AddressKeyword
  private static boolean UnionDefBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionDefBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    if (!r) r = AddressKeyword(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_COMMA UnionFieldDef )*
  private static boolean UnionDefBody_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionDefBody_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!UnionDefBody_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UnionDefBody_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA UnionFieldDef
  private static boolean UnionDefBody_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionDefBody_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && UnionFieldDef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( Type | NestedTypeDef ) Identifier ArrayDef? SubTypeSpec?
  static boolean UnionFieldDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionFieldDef")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnionFieldDef_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && UnionFieldDef_2(b, l + 1);
    r = r && UnionFieldDef_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Type | NestedTypeDef
  private static boolean UnionFieldDef_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionFieldDef_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Type(b, l + 1);
    if (!r) r = NestedTypeDef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ArrayDef?
  private static boolean UnionFieldDef_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionFieldDef_2")) return false;
    ArrayDef(b, l + 1);
    return true;
  }

  // SubTypeSpec?
  private static boolean UnionFieldDef_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionFieldDef_3")) return false;
    SubTypeSpec(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // UniversalKeyword CharStringKeyword
  static boolean UniversalCharString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UniversalCharString")) return false;
    if (!nextTokenIs(b, TTCN_UNIVERSAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UniversalKeyword(b, l + 1);
    r = r && CharStringKeyword(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_UNIVERSAL
  static boolean UniversalKeyword(PsiBuilder b, int l) {
    return consumeToken(b, TTCN_UNIVERSAL);
  }

  /* ********************************************************** */
  // TTCN_UNMAP TTCN_PARAM TTCN_LP FormalValuePar (TTCN_COMMA FormalValuePar)* TTCN_RP
  public static boolean UnmapParamDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnmapParamDef")) return false;
    if (!nextTokenIs(b, TTCN_UNMAP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_UNMAP, TTCN_PARAM, TTCN_LP);
    r = r && FormalValuePar(b, l + 1);
    r = r && UnmapParamDef_4(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, UNMAP_PARAM_DEF, r);
    return r;
  }

  // (TTCN_COMMA FormalValuePar)*
  private static boolean UnmapParamDef_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnmapParamDef_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!UnmapParamDef_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UnmapParamDef_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA FormalValuePar
  private static boolean UnmapParamDef_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnmapParamDef_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && FormalValuePar(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_UNMAP (SingleConnectionSpec ParamClause? | AllConnectionsSpec ParamClause? | AllPortsSpec | AllCompsAllPortsSpec)?
  public static boolean UnmapStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnmapStatement")) return false;
    if (!nextTokenIs(b, TTCN_UNMAP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_UNMAP);
    r = r && UnmapStatement_1(b, l + 1);
    exit_section_(b, m, UNMAP_STATEMENT, r);
    return r;
  }

  // (SingleConnectionSpec ParamClause? | AllConnectionsSpec ParamClause? | AllPortsSpec | AllCompsAllPortsSpec)?
  private static boolean UnmapStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnmapStatement_1")) return false;
    UnmapStatement_1_0(b, l + 1);
    return true;
  }

  // SingleConnectionSpec ParamClause? | AllConnectionsSpec ParamClause? | AllPortsSpec | AllCompsAllPortsSpec
  private static boolean UnmapStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnmapStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnmapStatement_1_0_0(b, l + 1);
    if (!r) r = UnmapStatement_1_0_1(b, l + 1);
    if (!r) r = AllPortsSpec(b, l + 1);
    if (!r) r = AllCompsAllPortsSpec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SingleConnectionSpec ParamClause?
  private static boolean UnmapStatement_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnmapStatement_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SingleConnectionSpec(b, l + 1);
    r = r && UnmapStatement_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ParamClause?
  private static boolean UnmapStatement_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnmapStatement_1_0_0_1")) return false;
    ParamClause(b, l + 1);
    return true;
  }

  // AllConnectionsSpec ParamClause?
  private static boolean UnmapStatement_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnmapStatement_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AllConnectionsSpec(b, l + 1);
    r = r && UnmapStatement_1_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ParamClause?
  private static boolean UnmapStatement_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnmapStatement_1_0_1_1")) return false;
    ParamClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // PredefinedValue | ReferencedValue
  public static boolean Value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<value>");
    r = PredefinedValue(b, l + 1);
    if (!r) r = ReferencedValue(b, l + 1);
    exit_section_(b, l, m, VALUE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_VALUE InLineTemplate
  public static boolean ValueMatchSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ValueMatchSpec")) return false;
    if (!nextTokenIs(b, TTCN_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_VALUE);
    r = r && InLineTemplate(b, l + 1);
    exit_section_(b, m, VALUE_MATCH_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_VALUE ( VariableRef | ( TTCN_LP SingleValueSpec ( TTCN_COMMA SingleValueSpec )* TTCN_RP ) )
  public static boolean ValueSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ValueSpec")) return false;
    if (!nextTokenIs(b, TTCN_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_VALUE);
    r = r && ValueSpec_1(b, l + 1);
    exit_section_(b, m, VALUE_SPEC, r);
    return r;
  }

  // VariableRef | ( TTCN_LP SingleValueSpec ( TTCN_COMMA SingleValueSpec )* TTCN_RP )
  private static boolean ValueSpec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ValueSpec_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableRef(b, l + 1);
    if (!r) r = ValueSpec_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_LP SingleValueSpec ( TTCN_COMMA SingleValueSpec )* TTCN_RP
  private static boolean ValueSpec_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ValueSpec_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LP);
    r = r && SingleValueSpec(b, l + 1);
    r = r && ValueSpec_1_1_2(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_COMMA SingleValueSpec )*
  private static boolean ValueSpec_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ValueSpec_1_1_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ValueSpec_1_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ValueSpec_1_1_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA SingleValueSpec
  private static boolean ValueSpec_1_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ValueSpec_1_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && SingleValueSpec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_VALUEOF TTCN_LP InLineTemplate TTCN_RP
  public static boolean ValueofOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ValueofOp")) return false;
    if (!nextTokenIs(b, TTCN_VALUEOF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_VALUEOF, TTCN_LP);
    r = r && InLineTemplate(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, VALUEOF_OP, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_VAR ( ( (TTCN_AT_LAZY | TTCN_AT_FUZZY)? Type VarList ) | ( ( TTCN_TEMPLATE | RestrictedTemplate ) (TTCN_AT_LAZY | TTCN_AT_FUZZY)? Type TempVarList ) )
  public static boolean VarInstance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarInstance")) return false;
    if (!nextTokenIs(b, TTCN_VAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_VAR);
    r = r && VarInstance_1(b, l + 1);
    exit_section_(b, m, VAR_INSTANCE, r);
    return r;
  }

  // ( (TTCN_AT_LAZY | TTCN_AT_FUZZY)? Type VarList ) | ( ( TTCN_TEMPLATE | RestrictedTemplate ) (TTCN_AT_LAZY | TTCN_AT_FUZZY)? Type TempVarList )
  private static boolean VarInstance_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarInstance_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VarInstance_1_0(b, l + 1);
    if (!r) r = VarInstance_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TTCN_AT_LAZY | TTCN_AT_FUZZY)? Type VarList
  private static boolean VarInstance_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarInstance_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VarInstance_1_0_0(b, l + 1);
    r = r && Type(b, l + 1);
    r = r && VarList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TTCN_AT_LAZY | TTCN_AT_FUZZY)?
  private static boolean VarInstance_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarInstance_1_0_0")) return false;
    VarInstance_1_0_0_0(b, l + 1);
    return true;
  }

  // TTCN_AT_LAZY | TTCN_AT_FUZZY
  private static boolean VarInstance_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarInstance_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_AT_LAZY);
    if (!r) r = consumeToken(b, TTCN_AT_FUZZY);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_TEMPLATE | RestrictedTemplate ) (TTCN_AT_LAZY | TTCN_AT_FUZZY)? Type TempVarList
  private static boolean VarInstance_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarInstance_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VarInstance_1_1_0(b, l + 1);
    r = r && VarInstance_1_1_1(b, l + 1);
    r = r && Type(b, l + 1);
    r = r && TempVarList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTCN_TEMPLATE | RestrictedTemplate
  private static boolean VarInstance_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarInstance_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_TEMPLATE);
    if (!r) r = RestrictedTemplate(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TTCN_AT_LAZY | TTCN_AT_FUZZY)?
  private static boolean VarInstance_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarInstance_1_1_1")) return false;
    VarInstance_1_1_1_0(b, l + 1);
    return true;
  }

  // TTCN_AT_LAZY | TTCN_AT_FUZZY
  private static boolean VarInstance_1_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarInstance_1_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_AT_LAZY);
    if (!r) r = consumeToken(b, TTCN_AT_FUZZY);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SingleVarInstance ( TTCN_COMMA SingleVarInstance )*
  public static boolean VarList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarList")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SingleVarInstance(b, l + 1);
    r = r && VarList_1(b, l + 1);
    exit_section_(b, m, VAR_LIST, r);
    return r;
  }

  // ( TTCN_COMMA SingleVarInstance )*
  private static boolean VarList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!VarList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VarList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA SingleVarInstance
  private static boolean VarList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && SingleVarInstance(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VariableRef TTCN_ASSIGN Identifier
  public static boolean VariableAssignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableAssignment")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableRef(b, l + 1);
    r = r && consumeToken(b, TTCN_ASSIGN);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, VARIABLE_ASSIGNMENT, r);
    return r;
  }

  /* ********************************************************** */
  // VariableRef | TTCN_SUB
  public static boolean VariableEntry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableEntry")) return false;
    if (!nextTokenIs(b, "<variable entry>", TTCN_ID, TTCN_SUB)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<variable entry>");
    r = VariableRef(b, l + 1);
    if (!r) r = consumeToken(b, TTCN_SUB);
    exit_section_(b, l, m, VARIABLE_ENTRY, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // VariableEntry (TTCN_COMMA VariableEntry)*
  public static boolean VariableList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableList")) return false;
    if (!nextTokenIs(b, "<variable list>", TTCN_ID, TTCN_SUB)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<variable list>");
    r = VariableEntry(b, l + 1);
    r = r && VariableList_1(b, l + 1);
    exit_section_(b, l, m, VARIABLE_LIST, r, false, null);
    return r;
  }

  // (TTCN_COMMA VariableEntry)*
  private static boolean VariableList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!VariableList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VariableList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_COMMA VariableEntry
  private static boolean VariableList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_COMMA);
    r = r && VariableEntry(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier ExtendedFieldReference?
  public static boolean VariableRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableRef")) return false;
    if (!nextTokenIs(b, TTCN_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && VariableRef_1(b, l + 1);
    exit_section_(b, m, VARIABLE_REF, r);
    return r;
  }

  // ExtendedFieldReference?
  private static boolean VariableRef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableRef_1")) return false;
    ExtendedFieldReference(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TTCN_VERDICTTYPE
  static boolean VerdictTypeKeyword(PsiBuilder b, int l) {
    return consumeToken(b, TTCN_VERDICTTYPE);
  }

  /* ********************************************************** */
  // TTCN_PASS | TTCN_FAIL | TTCN_INCONC | TTCN_NONE | TTCN_ERROR
  public static boolean VerdictTypeValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VerdictTypeValue")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<verdict type value>");
    r = consumeToken(b, TTCN_PASS);
    if (!r) r = consumeToken(b, TTCN_FAIL);
    if (!r) r = consumeToken(b, TTCN_INCONC);
    if (!r) r = consumeToken(b, TTCN_NONE);
    if (!r) r = consumeToken(b, TTCN_ERROR);
    exit_section_(b, l, m, VERDICT_TYPE_VALUE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TTCN_PUBLIC | TTCN_FRIEND| TTCN_PRIVATE
  static boolean Visibility(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Visibility")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_PUBLIC);
    if (!r) r = consumeToken(b, TTCN_FRIEND);
    if (!r) r = consumeToken(b, TTCN_PRIVATE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_WHILE TTCN_LP BooleanExpression TTCN_RP StatementBlock
  public static boolean WhileStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStatement")) return false;
    if (!nextTokenIs(b, TTCN_WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_WHILE, TTCN_LP);
    r = r && BooleanExpression(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    r = r && StatementBlock(b, l + 1);
    exit_section_(b, m, WHILE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_LENGTH TTCN_LP SingleExpression TTCN_RP
  public static boolean WildcardLengthMatch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WildcardLengthMatch")) return false;
    if (!nextTokenIs(b, TTCN_LENGTH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TTCN_LENGTH, TTCN_LP);
    r = r && SingleExpression(b, l + 1);
    r = r && consumeToken(b, TTCN_RP);
    exit_section_(b, m, WILDCARD_LENGTH_MATCH, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_LB MultiWithAttrib TTCN_RB
  static boolean WithAttribList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WithAttribList")) return false;
    if (!nextTokenIs(b, TTCN_LB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_LB);
    r = r && MultiWithAttrib(b, l + 1);
    r = r && consumeToken(b, TTCN_RB);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TTCN_WITH WithAttribList
  public static boolean WithStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WithStatement")) return false;
    if (!nextTokenIs(b, TTCN_WITH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_WITH);
    r = r && WithAttribList(b, l + 1);
    exit_section_(b, m, WITH_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // AndExpression ( TTCN_XOR AndExpression )*
  static boolean XorExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XorExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AndExpression(b, l + 1);
    r = r && XorExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TTCN_XOR AndExpression )*
  private static boolean XorExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XorExpression_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!XorExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "XorExpression_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TTCN_XOR AndExpression
  private static boolean XorExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XorExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTCN_XOR);
    r = r && AndExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !<<eof>> Module
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    if (!nextTokenIs(b, TTCN_MODULE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = root_0(b, l + 1);
    p = r; // pin = 1
    r = r && Module(b, l + 1);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  // !<<eof>>
  private static boolean root_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !eof(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

}
