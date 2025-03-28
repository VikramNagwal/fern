/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../index";
import * as SeedTrace from "../../../../api/index";
import * as core from "../../../../core";

export const Response: core.serialization.Schema<
    serializers.homepage.getHomepageProblems.Response.Raw,
    SeedTrace.ProblemId[]
> = core.serialization.list(core.serialization.lazy(() => serializers.ProblemId));

export declare namespace Response {
    export type Raw = serializers.ProblemId.Raw[];
}
