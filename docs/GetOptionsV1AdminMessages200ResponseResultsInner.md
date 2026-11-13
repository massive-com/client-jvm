
# GetOptionsV1AdminMessages200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **exchange** | **kotlin.Int** | The exchange ID. See Exchanges mapping for details. |  |
| **id** | **kotlin.String** | The unique identifier for this admin message, composed of the SIP timestamp and the sequence number. |  |
| **message** | **kotlin.String** | The administrative message text as distributed by OPRA. |  |
| **sequenceNumber** | **kotlin.Long** | The sequence number represents the sequence in which admin events happened. These are increasing and unique, but will not always be sequential. |  |
| **timestamp** | **kotlin.Long** | The SIP timestamp in Unix nanoseconds. |  |
| **retransmission** | **kotlin.Boolean** | True if this record was retransmitted. Omitted when false. |  [optional] |



