# This file was auto-generated by Fern from our API Definition.

from __future__ import annotations

import datetime as dt
import typing

import typing_extensions

from ...core.datetime_utils import serialize_datetime
from .test_case_hidden_grade import TestCaseHiddenGrade
from .test_case_non_hidden_grade import TestCaseNonHiddenGrade

try:
    import pydantic.v1 as pydantic  # type: ignore
except ImportError:
    import pydantic  # type: ignore

T_Result = typing.TypeVar("T_Result")


class _Factory:
    def hidden(self, value: TestCaseHiddenGrade) -> TestCaseGrade:
        return TestCaseGrade(__root__=_TestCaseGrade.Hidden(**value.dict(exclude_unset=True), type="hidden"))

    def non_hidden(self, value: TestCaseNonHiddenGrade) -> TestCaseGrade:
        return TestCaseGrade(__root__=_TestCaseGrade.NonHidden(**value.dict(exclude_unset=True), type="nonHidden"))


class TestCaseGrade(pydantic.BaseModel):
    factory: typing.ClassVar[_Factory] = _Factory()

    def get_as_union(self) -> typing.Union[_TestCaseGrade.Hidden, _TestCaseGrade.NonHidden]:
        return self.__root__

    def visit(
        self,
        hidden: typing.Callable[[TestCaseHiddenGrade], T_Result],
        non_hidden: typing.Callable[[TestCaseNonHiddenGrade], T_Result],
    ) -> T_Result:
        if self.__root__.type == "hidden":
            return hidden(TestCaseHiddenGrade(**self.__root__.dict(exclude_unset=True, exclude={"type"})))
        if self.__root__.type == "nonHidden":
            return non_hidden(TestCaseNonHiddenGrade(**self.__root__.dict(exclude_unset=True, exclude={"type"})))

    __root__: typing_extensions.Annotated[
        typing.Union[_TestCaseGrade.Hidden, _TestCaseGrade.NonHidden], pydantic.Field(discriminator="type")
    ]

    def json(self, **kwargs: typing.Any) -> str:
        kwargs_with_defaults: typing.Any = {"by_alias": True, "exclude_unset": True, **kwargs}
        return super().json(**kwargs_with_defaults)

    def dict(self, **kwargs: typing.Any) -> typing.Dict[str, typing.Any]:
        kwargs_with_defaults: typing.Any = {"by_alias": True, "exclude_unset": True, **kwargs}
        return super().dict(**kwargs_with_defaults)

    class Config:
        extra = pydantic.Extra.forbid
        json_encoders = {dt.datetime: serialize_datetime}


class _TestCaseGrade:
    class Hidden(TestCaseHiddenGrade):
        type: typing_extensions.Literal["hidden"]

        class Config:
            allow_population_by_field_name = True

    class NonHidden(TestCaseNonHiddenGrade):
        type: typing_extensions.Literal["nonHidden"]

        class Config:
            allow_population_by_field_name = True


TestCaseGrade.update_forward_refs()