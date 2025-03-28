/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../index";
import * as FernOpenapiIr from "../../../../api/index";
import * as core from "../../../../core";
import { SchemaId } from "../../commons/types/SchemaId";
import { ObjectPropertyConflictInfo } from "./ObjectPropertyConflictInfo";
import { WithAvailability } from "../../commons/types/WithAvailability";

export const ObjectProperty: core.serialization.ObjectSchema<
    serializers.ObjectProperty.Raw,
    FernOpenapiIr.ObjectProperty
> = core.serialization
    .objectWithoutOptionalProperties({
        key: core.serialization.string(),
        schema: core.serialization.lazy(() => serializers.Schema),
        readonly: core.serialization.boolean().optional(),
        writeonly: core.serialization.boolean().optional(),
        conflict: core.serialization.record(SchemaId, ObjectPropertyConflictInfo),
        generatedName: core.serialization.string(),
        nameOverride: core.serialization.string().optional(),
        audiences: core.serialization.list(core.serialization.string()),
    })
    .extend(WithAvailability);

export declare namespace ObjectProperty {
    export interface Raw extends WithAvailability.Raw {
        key: string;
        schema: serializers.Schema.Raw;
        readonly?: boolean | null;
        writeonly?: boolean | null;
        conflict: Record<SchemaId.Raw, ObjectPropertyConflictInfo.Raw>;
        generatedName: string;
        nameOverride?: string | null;
        audiences: string[];
    }
}
