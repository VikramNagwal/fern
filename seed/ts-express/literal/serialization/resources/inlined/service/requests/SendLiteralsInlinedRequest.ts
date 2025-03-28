/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../../index";
import * as SeedLiteral from "../../../../../api/index";
import * as core from "../../../../../core";

export const SendLiteralsInlinedRequest: core.serialization.Schema<
    serializers.SendLiteralsInlinedRequest.Raw,
    SeedLiteral.SendLiteralsInlinedRequest
> = core.serialization.object({
    prompt: core.serialization.stringLiteral("You are a helpful assistant"),
    context: core.serialization.stringLiteral("You're super wise").optional(),
    query: core.serialization.string(),
    temperature: core.serialization.number().optional(),
    stream: core.serialization.booleanLiteral(false),
    aliasedContext: core.serialization.lazy(() => serializers.SomeAliasedLiteral),
    maybeContext: core.serialization.lazy(() => serializers.SomeAliasedLiteral).optional(),
    objectWithLiteral: core.serialization.lazyObject(() => serializers.ATopLevelLiteral),
});

export declare namespace SendLiteralsInlinedRequest {
    export interface Raw {
        prompt: "You are a helpful assistant";
        context?: "You're super wise" | null;
        query: string;
        temperature?: number | null;
        stream: false;
        aliasedContext: serializers.SomeAliasedLiteral.Raw;
        maybeContext?: serializers.SomeAliasedLiteral.Raw | null;
        objectWithLiteral: serializers.ATopLevelLiteral.Raw;
    }
}
