/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as FernOpenapiIr from "../../..";

export type OneOfSchema = FernOpenapiIr.OneOfSchema.Discriminated | FernOpenapiIr.OneOfSchema.Undisciminated;

export declare namespace OneOfSchema {
    interface Discriminated extends FernOpenapiIr.DiscriminatedOneOfSchema, _Utils {
        type: "discriminated";
    }

    interface Undisciminated extends FernOpenapiIr.UnDiscriminatedOneOfSchema, _Utils {
        type: "undisciminated";
    }

    interface _Utils {
        _visit: <_Result>(visitor: FernOpenapiIr.OneOfSchema._Visitor<_Result>) => _Result;
    }

    interface _Visitor<_Result> {
        discriminated: (value: FernOpenapiIr.DiscriminatedOneOfSchema) => _Result;
        undisciminated: (value: FernOpenapiIr.UnDiscriminatedOneOfSchema) => _Result;
        _other: (value: { type: string }) => _Result;
    }
}

export const OneOfSchema = {
    discriminated: (value: FernOpenapiIr.DiscriminatedOneOfSchema): FernOpenapiIr.OneOfSchema.Discriminated => {
        return {
            ...value,
            type: "discriminated",
            _visit: function <_Result>(
                this: FernOpenapiIr.OneOfSchema.Discriminated,
                visitor: FernOpenapiIr.OneOfSchema._Visitor<_Result>
            ) {
                return FernOpenapiIr.OneOfSchema._visit(this, visitor);
            },
        };
    },

    undisciminated: (value: FernOpenapiIr.UnDiscriminatedOneOfSchema): FernOpenapiIr.OneOfSchema.Undisciminated => {
        return {
            ...value,
            type: "undisciminated",
            _visit: function <_Result>(
                this: FernOpenapiIr.OneOfSchema.Undisciminated,
                visitor: FernOpenapiIr.OneOfSchema._Visitor<_Result>
            ) {
                return FernOpenapiIr.OneOfSchema._visit(this, visitor);
            },
        };
    },

    _visit: <_Result>(
        value: FernOpenapiIr.OneOfSchema,
        visitor: FernOpenapiIr.OneOfSchema._Visitor<_Result>
    ): _Result => {
        switch (value.type) {
            case "discriminated":
                return visitor.discriminated(value);
            case "undisciminated":
                return visitor.undisciminated(value);
            default:
                return visitor._other(value as any);
        }
    },
} as const;