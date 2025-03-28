/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../../../../../index";
import * as SeedTrace from "../../../../../../../../api/index";
import * as core from "../../../../../../../../core";
import { NonVoidFunctionSignature } from "./NonVoidFunctionSignature";
import { FunctionImplementationForMultipleLanguages } from "./FunctionImplementationForMultipleLanguages";

export const NonVoidFunctionDefinition: core.serialization.ObjectSchema<
    serializers.v2.v3.NonVoidFunctionDefinition.Raw,
    SeedTrace.v2.v3.NonVoidFunctionDefinition
> = core.serialization.object({
    signature: NonVoidFunctionSignature,
    code: FunctionImplementationForMultipleLanguages,
});

export declare namespace NonVoidFunctionDefinition {
    export interface Raw {
        signature: NonVoidFunctionSignature.Raw;
        code: FunctionImplementationForMultipleLanguages.Raw;
    }
}
