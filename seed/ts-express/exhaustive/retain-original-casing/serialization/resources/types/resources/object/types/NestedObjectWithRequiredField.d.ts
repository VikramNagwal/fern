/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "../../../../..";
import * as SeedExhaustive from "../../../../../../api";
import * as core from "../../../../../../core";
export declare const NestedObjectWithRequiredField: core.serialization.ObjectSchema<serializers.types.NestedObjectWithRequiredField.Raw, SeedExhaustive.types.NestedObjectWithRequiredField>;
export declare namespace NestedObjectWithRequiredField {
    interface Raw {
        string: string;
        NestedObject: serializers.types.ObjectWithOptionalField.Raw;
    }
}