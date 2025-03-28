/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as Fiddle from "../../../../../index";
import * as core from "../../../../../../core";

export type Error = Fiddle.endpoints.httpMethods.testPut.Error._Unknown;

export namespace Error {
    export interface _Unknown extends _Utils {
        statusCode: void;
        content: core.Fetcher.Error;
    }

    export interface _Utils {
        _visit: <_Result>(visitor: Fiddle.endpoints.httpMethods.testPut.Error._Visitor<_Result>) => _Result;
    }

    export interface _Visitor<_Result> {
        _other: (value: core.Fetcher.Error) => _Result;
    }
}

export const Error = {
    _unknown: (fetcherError: core.Fetcher.Error): Fiddle.endpoints.httpMethods.testPut.Error._Unknown => {
        return {
            statusCode: undefined,
            content: fetcherError,
            _visit: function <_Result>(
                this: Fiddle.endpoints.httpMethods.testPut.Error._Unknown,
                visitor: Fiddle.endpoints.httpMethods.testPut.Error._Visitor<_Result>,
            ) {
                return Fiddle.endpoints.httpMethods.testPut.Error._visit(this, visitor);
            },
        };
    },

    _visit: <_Result>(
        value: Fiddle.endpoints.httpMethods.testPut.Error,
        visitor: Fiddle.endpoints.httpMethods.testPut.Error._Visitor<_Result>,
    ): _Result => {
        switch (value.statusCode) {
            default:
                return visitor._other(value as any);
        }
    },
} as const;
