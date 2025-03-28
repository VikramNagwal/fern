# This file was auto-generated by Fern from our API Definition.

from seed import SeedExhaustive
from seed import AsyncSeedExhaustive
import typing
from ..utilities import validate_response
from seed.types.object import ObjectWithRequiredField


async def test_get_and_return_list_of_primitives(client: SeedExhaustive, async_client: AsyncSeedExhaustive) -> None:
    expected_response: typing.Any = ["string", "string"]
    expected_types: typing.Tuple[typing.Any, typing.Any] = ("list", {0: None, 1: None})
    response = client.endpoints.container.get_and_return_list_of_primitives(request=["string", "string"])
    validate_response(response, expected_response, expected_types)

    async_response = await async_client.endpoints.container.get_and_return_list_of_primitives(
        request=["string", "string"]
    )
    validate_response(async_response, expected_response, expected_types)


async def test_get_and_return_list_of_objects(client: SeedExhaustive, async_client: AsyncSeedExhaustive) -> None:
    expected_response: typing.Any = [{"string": "string"}, {"string": "string"}]
    expected_types: typing.Tuple[typing.Any, typing.Any] = (
        "list",
        {0: {"string": None}, 1: {"string": None}},
    )
    response = client.endpoints.container.get_and_return_list_of_objects(
        request=[
            ObjectWithRequiredField(string="string"),
            ObjectWithRequiredField(string="string"),
        ]
    )
    validate_response(response, expected_response, expected_types)

    async_response = await async_client.endpoints.container.get_and_return_list_of_objects(
        request=[
            ObjectWithRequiredField(string="string"),
            ObjectWithRequiredField(string="string"),
        ]
    )
    validate_response(async_response, expected_response, expected_types)


async def test_get_and_return_set_of_primitives(client: SeedExhaustive, async_client: AsyncSeedExhaustive) -> None:
    expected_response: typing.Any = ["string"]
    expected_types: typing.Tuple[typing.Any, typing.Any] = ("set", {0: None})
    response = client.endpoints.container.get_and_return_set_of_primitives(request={"string"})
    validate_response(response, expected_response, expected_types)

    async_response = await async_client.endpoints.container.get_and_return_set_of_primitives(request={"string"})
    validate_response(async_response, expected_response, expected_types)


async def test_get_and_return_set_of_objects(client: SeedExhaustive, async_client: AsyncSeedExhaustive) -> None:
    expected_response: typing.Any = [{"string": "string"}]
    expected_types: typing.Tuple[typing.Any, typing.Any] = (
        "set",
        {0: {"string": None}},
    )
    response = client.endpoints.container.get_and_return_set_of_objects(
        request=[ObjectWithRequiredField(string="string")]
    )
    validate_response(response, expected_response, expected_types)

    async_response = await async_client.endpoints.container.get_and_return_set_of_objects(
        request=[ObjectWithRequiredField(string="string")]
    )
    validate_response(async_response, expected_response, expected_types)


async def test_get_and_return_map_prim_to_prim(client: SeedExhaustive, async_client: AsyncSeedExhaustive) -> None:
    expected_response: typing.Any = {"string": "string"}
    expected_types: typing.Tuple[typing.Any, typing.Any] = ("dict", {0: (None, None)})
    response = client.endpoints.container.get_and_return_map_prim_to_prim(request={"string": "string"})
    validate_response(response, expected_response, expected_types)

    async_response = await async_client.endpoints.container.get_and_return_map_prim_to_prim(
        request={"string": "string"}
    )
    validate_response(async_response, expected_response, expected_types)


async def test_get_and_return_map_of_prim_to_object(client: SeedExhaustive, async_client: AsyncSeedExhaustive) -> None:
    expected_response: typing.Any = {"string": {"string": "string"}}
    expected_types: typing.Tuple[typing.Any, typing.Any] = (
        "dict",
        {0: (None, {"string": None})},
    )
    response = client.endpoints.container.get_and_return_map_of_prim_to_object(
        request={"string": ObjectWithRequiredField(string="string")}
    )
    validate_response(response, expected_response, expected_types)

    async_response = await async_client.endpoints.container.get_and_return_map_of_prim_to_object(
        request={"string": ObjectWithRequiredField(string="string")}
    )
    validate_response(async_response, expected_response, expected_types)


async def test_get_and_return_optional(client: SeedExhaustive, async_client: AsyncSeedExhaustive) -> None:
    expected_response: typing.Any = {"string": "string"}
    expected_types: typing.Any = {"string": None}
    response = client.endpoints.container.get_and_return_optional(request=ObjectWithRequiredField(string="string"))
    validate_response(response, expected_response, expected_types)

    async_response = await async_client.endpoints.container.get_and_return_optional(
        request=ObjectWithRequiredField(string="string")
    )
    validate_response(async_response, expected_response, expected_types)
