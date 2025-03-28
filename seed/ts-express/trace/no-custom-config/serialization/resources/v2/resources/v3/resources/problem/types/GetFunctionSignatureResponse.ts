/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../../../../../index";
import * as SeedTrace from "../../../../../../../../api/index";
import * as core from "../../../../../../../../core";

export const GetFunctionSignatureResponse: core.serialization.ObjectSchema<
    serializers.v2.v3.GetFunctionSignatureResponse.Raw,
    SeedTrace.v2.v3.GetFunctionSignatureResponse
> = core.serialization.object({
    functionByLanguage: core.serialization.record(
        core.serialization.lazy(() => serializers.Language),
        core.serialization.string().optional(),
    ),
});

export declare namespace GetFunctionSignatureResponse {
    export interface Raw {
        functionByLanguage: Record<serializers.Language.Raw, string | null | undefined>;
    }
}
