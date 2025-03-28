/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../index";
import * as FernDocsConfig from "../../../../api/index";
import * as core from "../../../../core";

export const FeatureFlag: core.serialization.ObjectSchema<serializers.FeatureFlag.Raw, FernDocsConfig.FeatureFlag> =
    core.serialization.object({
        flag: core.serialization.string(),
        fallbackValue: core.serialization.property("fallback-value", core.serialization.unknown().optional()),
        match: core.serialization.unknown().optional(),
    });

export declare namespace FeatureFlag {
    export interface Raw {
        flag: string;
        "fallback-value"?: unknown | null;
        match?: unknown | null;
    }
}
