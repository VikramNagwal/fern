# This file was auto-generated by Fern from our API Definition.

from ....core.client_wrapper import SyncClientWrapper
import typing
from ....core.request_options import RequestOptions
from ....types.types.exception import Exception
from ....core.jsonable_encoder import jsonable_encoder
from ....core.pydantic_utilities import parse_obj_as
from json.decoder import JSONDecodeError
from ....core.api_error import ApiError
from ....core.client_wrapper import AsyncClientWrapper


class ServiceClient:
    def __init__(self, *, client_wrapper: SyncClientWrapper):
        self._client_wrapper = client_wrapper

    def get_exception(
        self,
        notification_id: str,
        *,
        request_options: typing.Optional[RequestOptions] = None,
    ) -> Exception:
        """
        Parameters
        ----------
        notification_id : str

        request_options : typing.Optional[RequestOptions]
            Request-specific configuration.

        Returns
        -------
        Exception

        Examples
        --------
        from seed import SeedExhaustive
        from seed.environment import SeedExhaustiveEnvironment

        client = SeedExhaustive(
            token="YOUR_TOKEN",
            environment=SeedExhaustiveEnvironment.PRODUCTION,
        )
        client.file.notification.service.get_exception(
            notification_id="notification-hsy129x",
        )
        """
        _response = self._client_wrapper.httpx_client.request(
            f"file/notification/{jsonable_encoder(notification_id)}",
            method="GET",
            request_options=request_options,
        )
        try:
            if 200 <= _response.status_code < 300:
                return typing.cast(
                    Exception,
                    parse_obj_as(
                        type_=Exception,  # type: ignore
                        object_=_response.json(),
                    ),
                )
            _response_json = _response.json()
        except JSONDecodeError:
            raise ApiError(status_code=_response.status_code, body=_response.text)
        raise ApiError(status_code=_response.status_code, body=_response_json)


class AsyncServiceClient:
    def __init__(self, *, client_wrapper: AsyncClientWrapper):
        self._client_wrapper = client_wrapper

    async def get_exception(
        self,
        notification_id: str,
        *,
        request_options: typing.Optional[RequestOptions] = None,
    ) -> Exception:
        """
        Parameters
        ----------
        notification_id : str

        request_options : typing.Optional[RequestOptions]
            Request-specific configuration.

        Returns
        -------
        Exception

        Examples
        --------
        import asyncio

        from seed import AsyncSeedExhaustive
        from seed.environment import SeedExhaustiveEnvironment

        client = AsyncSeedExhaustive(
            token="YOUR_TOKEN",
            environment=SeedExhaustiveEnvironment.PRODUCTION,
        )


        async def main() -> None:
            await client.file.notification.service.get_exception(
                notification_id="notification-hsy129x",
            )


        asyncio.run(main())
        """
        _response = await self._client_wrapper.httpx_client.request(
            f"file/notification/{jsonable_encoder(notification_id)}",
            method="GET",
            request_options=request_options,
        )
        try:
            if 200 <= _response.status_code < 300:
                return typing.cast(
                    Exception,
                    parse_obj_as(
                        type_=Exception,  # type: ignore
                        object_=_response.json(),
                    ),
                )
            _response_json = _response.json()
        except JSONDecodeError:
            raise ApiError(status_code=_response.status_code, body=_response.text)
        raise ApiError(status_code=_response.status_code, body=_response_json)
