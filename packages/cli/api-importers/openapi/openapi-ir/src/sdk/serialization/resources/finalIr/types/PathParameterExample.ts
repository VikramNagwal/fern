/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../index";
import * as FernOpenapiIr from "../../../../api/index";
import * as core from "../../../../core";

export const PathParameterExample: core.serialization.ObjectSchema<
    serializers.PathParameterExample.Raw,
    FernOpenapiIr.PathParameterExample
> = core.serialization.objectWithoutOptionalProperties({
    name: core.serialization.string(),
    parameterNameOverride: core.serialization.string().optional(),
    value: core.serialization.lazy(() => serializers.FullExample),
});

export declare namespace PathParameterExample {
    export interface Raw {
        name: string;
        parameterNameOverride?: string | null;
        value: serializers.FullExample.Raw;
    }
}
