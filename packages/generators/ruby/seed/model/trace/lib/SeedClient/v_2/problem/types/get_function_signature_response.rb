# frozen_string_literal: true
require "json"

module SeedClient
  module V2
    module Problem
      class GetFunctionSignatureResponse
        attr_reader :function_by_language, :additional_properties
        # @param function_by_language [Hash{Commons::Language => Commons::Language}] 
        # @param additional_properties [OpenStruct] Additional properties unmapped to the current class definition
        # @return [V2::Problem::GetFunctionSignatureResponse] 
        def initialze(function_by_language:, additional_properties: nil)
          # @type [Hash{Commons::Language => Commons::Language}] 
          @function_by_language = function_by_language
          # @type [OpenStruct] 
          @additional_properties = additional_properties
        end
        # Deserialize a JSON object to an instance of GetFunctionSignatureResponse
        #
        # @param json_object [JSON] 
        # @return [V2::Problem::GetFunctionSignatureResponse] 
        def self.from_json(json_object:)
          struct = JSON.parse(json_object, object_class: OpenStruct)
          function_by_language = struct.functionByLanguage.transform_values() do | v |
 Commons::Language.from_json(json_object: v)
end
          new(function_by_language: function_by_language, additional_properties: struct)
        end
        # Serialize an instance of GetFunctionSignatureResponse to a JSON object
        #
        # @return [JSON] 
        def to_json
          {
 functionByLanguage: @function_by_language.transform_values() do | v |\n Commons::Language.from_json(json_object: v)\nend
}.to_json()
        end
      end
    end
  end
end