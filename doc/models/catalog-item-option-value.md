## Catalog Item Option Value

An enumerated value that can link a
`CatalogItemVariation` to an item option as one of
its item option values.

### Structure

`CatalogItemOptionValue`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `ItemOptionId` | `String` | Optional | Unique ID of the associated item option. |
| `Name` | `String` | Optional | Name of this item option value. Searchable. |
| `Description` | `String` | Optional | A human-readable description for the option value. |
| `Color` | `String` | Optional | The HTML-supported hex color for the item option (e.g., "#ff8d4e85").<br>Only displayed if `show_colors` is enabled on the parent `ItemOption`. When<br>left unset, `color` defaults to white ("#ffffff") when `show_colors` is<br>enabled on the parent `ItemOption`. |
| `Ordinal` | `Integer` | Optional | Determines where this option value appears in a list of option values. |
| `ItemVariationCount` | `Long` | Optional | The number of `CatalogItemVariation`s that<br>currently make use of this Item Option value. Present only if `retrieve_counts`<br>was specified on the request used to retrieve the parent Item Option of this<br>value.<br><br>Maximum: 100 counts. |

### Example (as JSON)

```json
{
  "item_option_id": null,
  "name": null,
  "description": null,
  "color": null,
  "ordinal": null,
  "item_variation_count": null
}
```

