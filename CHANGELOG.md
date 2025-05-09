# Changelog

## 0.1.0-alpha.1 (2025-05-09)

Full Changelog: [v0.0.1-alpha.0...v0.1.0-alpha.1](https://github.com/minskimm/stainless-twilio-voice-java/compare/v0.0.1-alpha.0...v0.1.0-alpha.1)

### ⚠ BREAKING CHANGES

* **client:** extract auto pagination to shared classes
* **client:** **Migration:** - If you were referencing the `AutoPager` class on a specific `*Page` or `*PageAsync` type, then you should instead reference the shared `AutoPager` and `AutoPagerAsync` types, under the `core` package
    - `AutoPagerAsync` now has different usage. You can call `.subscribe(...)` on the returned object instead to get called back each page item. You can also call `onCompleteFuture()` to get a future that completes when all items have been processed. Finally, you can call `.close()` on the returned object to stop auto-paginating early
    - If you were referencing `getNextPage` or `getNextPageParams`:
       - Swap to `nextPage()` and `nextPageParams()`
       - Note that these both now return non-optional types (use `hasNextPage()` before calling these, since they will throw if it's impossible to get another page)
* **client:** refactor exception structure and methods
* **client:** **Migration:** Previously you would access error JSON on an exception via `exception.error()._additionalProperties()`, which would return `Map<String, JsonValue>`. Now you would access this via `exception.body()`, which returns `JsonValue`. You should no longer assume that the returned error JSON is an object. You can check via `exception.body().asObject()`.
* **client:** move classes into subpackages and shorten names

### Features

* **api:** update via SDK Studio ([4ff4291](https://github.com/minskimm/stainless-twilio-voice-java/commit/4ff429180e7b6e91adcc632ccff1fb93f3f57b73))
* **api:** update via SDK Studio ([2a57783](https://github.com/minskimm/stainless-twilio-voice-java/commit/2a5778353436930b2a59902db7631a80ad64f36b))
* **client:** accept `InputStream` and `Path` for file params ([82ceea4](https://github.com/minskimm/stainless-twilio-voice-java/commit/82ceea430a10510cb7254bb5a916698b3817c674))
* **client:** add enum validation method ([7414c18](https://github.com/minskimm/stainless-twilio-voice-java/commit/7414c18490946d147fdb51ffa2dfc7fb80af7334))
* **client:** allow providing some params positionally ([f3eb2a9](https://github.com/minskimm/stainless-twilio-voice-java/commit/f3eb2a90a2eff940225dbae8cadf69ef61d7af96))
* **client:** detect binary incompatible jackson versions ([df2b1ef](https://github.com/minskimm/stainless-twilio-voice-java/commit/df2b1efd05534cd2fe924ba04f09569bfefcdaff))
* **client:** don't require params for some service methods ([95b001a](https://github.com/minskimm/stainless-twilio-voice-java/commit/95b001a1060fa1a36696840253161e55b8063aa4))
* **client:** expose request body setter and getter ([#15](https://github.com/minskimm/stainless-twilio-voice-java/issues/15)) ([08151ac](https://github.com/minskimm/stainless-twilio-voice-java/commit/08151ac4214c308a33e20746a6ae2508a6fc7cbb))
* **client:** extract auto pagination to shared classes ([75bef42](https://github.com/minskimm/stainless-twilio-voice-java/commit/75bef420a221d0e7059863886b68b392301d0e1c))
* **client:** make datetime deserialization more lenient ([#14](https://github.com/minskimm/stainless-twilio-voice-java/issues/14)) ([6819e1a](https://github.com/minskimm/stainless-twilio-voice-java/commit/6819e1af3fad6e13585bc47c4c482a3e108380e4))
* **client:** make union deserialization more robust ([#13](https://github.com/minskimm/stainless-twilio-voice-java/issues/13)) ([7414c18](https://github.com/minskimm/stainless-twilio-voice-java/commit/7414c18490946d147fdb51ffa2dfc7fb80af7334))
* **client:** support a lower jackson version ([#8](https://github.com/minskimm/stainless-twilio-voice-java/issues/8)) ([661a04a](https://github.com/minskimm/stainless-twilio-voice-java/commit/661a04af30cc1f4126bb9ba8d94df8f8ade6c201))
* **client:** support setting base URL via env var ([f2bdb42](https://github.com/minskimm/stainless-twilio-voice-java/commit/f2bdb423dd687ca9819028ec4cb9b1a44f909033))
* **client:** throw on incompatible jackson version ([661a04a](https://github.com/minskimm/stainless-twilio-voice-java/commit/661a04af30cc1f4126bb9ba8d94df8f8ade6c201))
* generate and publish docs ([524ef1a](https://github.com/minskimm/stainless-twilio-voice-java/commit/524ef1a1c3fdb03e809b1e8d6109e30f3413b577))


### Bug Fixes

* **client:** bump to better jackson version ([8ce024c](https://github.com/minskimm/stainless-twilio-voice-java/commit/8ce024cdac5d9707abed2d5bdc86611475c90160))
* **client:** don't call `validate()` during deserialization if we don't have to ([#10](https://github.com/minskimm/stainless-twilio-voice-java/issues/10)) ([b218803](https://github.com/minskimm/stainless-twilio-voice-java/commit/b2188032fc2e7ec656266c9ecd910c29d34573d2))
* **client:** limit json deserialization coercion ([#11](https://github.com/minskimm/stainless-twilio-voice-java/issues/11)) ([3839503](https://github.com/minskimm/stainless-twilio-voice-java/commit/3839503f0c774ef09a9de408cc77ff219b7f5dc9))
* **client:** map deserialization bug ([65bf132](https://github.com/minskimm/stainless-twilio-voice-java/commit/65bf132f1b3c730ef9fe8ec6c728233b336c056c))
* **client:** return `Optional&lt;T&gt;` instead of `Optional<? extends T>` ([#18](https://github.com/minskimm/stainless-twilio-voice-java/issues/18)) ([4a58e4f](https://github.com/minskimm/stainless-twilio-voice-java/commit/4a58e4f3303cd758711d77c8e6cb2f34e4630763))
* **client:** support kotlin 1.8 runtime ([2016790](https://github.com/minskimm/stainless-twilio-voice-java/commit/2016790b765959aace2b9f380ef2769b2b0708ab))
* fix casing in tests ([ed3a86c](https://github.com/minskimm/stainless-twilio-voice-java/commit/ed3a86c18b2f62bcf6f8a98671dc7fac171c0857))
* pluralize `list` response variables ([#12](https://github.com/minskimm/stainless-twilio-voice-java/issues/12)) ([af4c847](https://github.com/minskimm/stainless-twilio-voice-java/commit/af4c847a8c31738b4695019ae6048e725d05056b))


### Performance Improvements

* **client:** cached parsed type in `HttpResponseFor` ([#16](https://github.com/minskimm/stainless-twilio-voice-java/issues/16)) ([650ccee](https://github.com/minskimm/stainless-twilio-voice-java/commit/650cceed9a620b61fa47acb20151874ef00ad08b))
* **internal:** improve compilation+test speed ([5611a0b](https://github.com/minskimm/stainless-twilio-voice-java/commit/5611a0bf8ea5030d6e9bc58907d9f926c70dd665))


### Chores

* **ci:** add timeout thresholds for CI jobs ([a4f79d8](https://github.com/minskimm/stainless-twilio-voice-java/commit/a4f79d81b5f808bd904a09072fcbef44fe640c78))
* **ci:** only use depot for staging repos ([2f2f32a](https://github.com/minskimm/stainless-twilio-voice-java/commit/2f2f32a9255c4566289902716229ecbbb21e87a2))
* **client:** move classes into subpackages and shorten names ([b33be27](https://github.com/minskimm/stainless-twilio-voice-java/commit/b33be272255fb073980dc2698380ece9e74d7ca7))
* **client:** refactor exception structure and methods ([d1277c7](https://github.com/minskimm/stainless-twilio-voice-java/commit/d1277c7e0dc1c473b0bd77ed7b711f90d5b8ce5c))
* **client:** remove unnecessary json state from some query param classes ([7414c18](https://github.com/minskimm/stainless-twilio-voice-java/commit/7414c18490946d147fdb51ffa2dfc7fb80af7334))
* configure new SDK language ([f3a8e2b](https://github.com/minskimm/stainless-twilio-voice-java/commit/f3a8e2b8ff631d96849f0949f0cf8737320731fe))
* go live ([#1](https://github.com/minskimm/stainless-twilio-voice-java/issues/1)) ([65ff569](https://github.com/minskimm/stainless-twilio-voice-java/commit/65ff5691dd52ba76ad7aa475935334468e23908f))
* **internal:** add invalid json deserialization tests ([7414c18](https://github.com/minskimm/stainless-twilio-voice-java/commit/7414c18490946d147fdb51ffa2dfc7fb80af7334))
* **internal:** add json roundtripping tests ([7414c18](https://github.com/minskimm/stainless-twilio-voice-java/commit/7414c18490946d147fdb51ffa2dfc7fb80af7334))
* **internal:** codegen related update ([e590a00](https://github.com/minskimm/stainless-twilio-voice-java/commit/e590a002aa0e9d70e4124137694ddbf46da07c3c))
* **internal:** codegen related update ([0b466dd](https://github.com/minskimm/stainless-twilio-voice-java/commit/0b466dd74fe7a3d6e5644468fc87c4fa4556e7da))
* **internal:** codegen related update ([dcf50d4](https://github.com/minskimm/stainless-twilio-voice-java/commit/dcf50d41db6493fbcd358d5af232120507a9d107))
* **internal:** codegen related update ([4f02f6b](https://github.com/minskimm/stainless-twilio-voice-java/commit/4f02f6b8bf1c310914d17421806311ce94ecb75f))
* **internal:** codegen related update ([56a785a](https://github.com/minskimm/stainless-twilio-voice-java/commit/56a785a6366d494dd7e1850bd473e98194823b35))
* **internal:** codegen related update ([f494e56](https://github.com/minskimm/stainless-twilio-voice-java/commit/f494e56c438b9b92eac3837ea1bd3f0f4c6d15f3))
* **internal:** codegen related update ([7bcf888](https://github.com/minskimm/stainless-twilio-voice-java/commit/7bcf888aca20525391302af8c834d79abf42396c))
* **internal:** codegen related update ([82988e6](https://github.com/minskimm/stainless-twilio-voice-java/commit/82988e6ee760a4a160b62b2e11488193bc5e7a4a))
* **internal:** codegen related update ([0dd6d90](https://github.com/minskimm/stainless-twilio-voice-java/commit/0dd6d90439651d3489249638ca4535a2366aa829))
* **internal:** codegen related update ([11eb3da](https://github.com/minskimm/stainless-twilio-voice-java/commit/11eb3daa855a8e39fdf3c50360f54ef1529e1622))
* **internal:** codegen related update ([f8a20d7](https://github.com/minskimm/stainless-twilio-voice-java/commit/f8a20d773dfdf3dd0d9d19748836b70a577a3d4d))
* **internal:** codegen related update ([0fe17c7](https://github.com/minskimm/stainless-twilio-voice-java/commit/0fe17c787d0c5e2e70af66ce3caeb9827be75b12))
* **internal:** codegen related update ([12650aa](https://github.com/minskimm/stainless-twilio-voice-java/commit/12650aad051e57308d9b046ba264463943d4525e))
* **internal:** codegen related update ([#5](https://github.com/minskimm/stainless-twilio-voice-java/issues/5)) ([6172798](https://github.com/minskimm/stainless-twilio-voice-java/commit/6172798d9014f74c911b484aa3c6f713ae5a3dbf))
* **internal:** delete duplicate tests ([99c148a](https://github.com/minskimm/stainless-twilio-voice-java/commit/99c148a95bd6c1135312698590d7861eff23c237))
* **internal:** delete unused methods and annotations ([#9](https://github.com/minskimm/stainless-twilio-voice-java/issues/9)) ([65bf132](https://github.com/minskimm/stainless-twilio-voice-java/commit/65bf132f1b3c730ef9fe8ec6c728233b336c056c))
* **internal:** don't use `JvmOverloads` in interfaces ([71178c1](https://github.com/minskimm/stainless-twilio-voice-java/commit/71178c122357be97b84ee130b625b2d8e48e8a07))
* **internal:** expand CI branch coverage ([6722500](https://github.com/minskimm/stainless-twilio-voice-java/commit/67225000cefc502deadb68f4eaf228735b36ec96))
* **internal:** fix example formatting ([#4](https://github.com/minskimm/stainless-twilio-voice-java/issues/4)) ([4ab88ad](https://github.com/minskimm/stainless-twilio-voice-java/commit/4ab88ad91d2f11daa656f03465f980df6875df59))
* **internal:** java 17 -&gt; 21 on ci ([03a0d78](https://github.com/minskimm/stainless-twilio-voice-java/commit/03a0d7842a1b205db28e2c13c685a176c5f5952d))
* **internal:** make multipart assertions more robust ([7b5fbc8](https://github.com/minskimm/stainless-twilio-voice-java/commit/7b5fbc872500d65a135444bc15f6e07e5bc70220))
* **internal:** reduce CI branch coverage ([b4ed13b](https://github.com/minskimm/stainless-twilio-voice-java/commit/b4ed13b30369e6e7ed16d95345546fb95ab5ffe0))
* **internal:** reenable warnings as errors ([71178c1](https://github.com/minskimm/stainless-twilio-voice-java/commit/71178c122357be97b84ee130b625b2d8e48e8a07))
* **internal:** refactor query param serialization impl and tests ([89406d3](https://github.com/minskimm/stainless-twilio-voice-java/commit/89406d31515e615dfb0128e94831f5ad7465499b))
* **internal:** refactor some test assertions ([99c148a](https://github.com/minskimm/stainless-twilio-voice-java/commit/99c148a95bd6c1135312698590d7861eff23c237))
* **internal:** remove extra empty newlines ([1929694](https://github.com/minskimm/stainless-twilio-voice-java/commit/1929694c1abef59002498aac98bb433147fde0ca))
* **internal:** remove flaky `-Xbackend-threads=0` option ([3c0c0e7](https://github.com/minskimm/stainless-twilio-voice-java/commit/3c0c0e7032180e121e226f3e5a4966dd687ffc00))
* **internal:** remove unnecessary `assertNotNull` calls ([7b5fbc8](https://github.com/minskimm/stainless-twilio-voice-java/commit/7b5fbc872500d65a135444bc15f6e07e5bc70220))
* **internal:** rename `getPathParam` ([99c148a](https://github.com/minskimm/stainless-twilio-voice-java/commit/99c148a95bd6c1135312698590d7861eff23c237))
* **internal:** reorder some params methodsc ([99c148a](https://github.com/minskimm/stainless-twilio-voice-java/commit/99c148a95bd6c1135312698590d7861eff23c237))
* **internal:** swap from `getNullable` to `getOptional` ([#17](https://github.com/minskimm/stainless-twilio-voice-java/issues/17)) ([e27d4be](https://github.com/minskimm/stainless-twilio-voice-java/commit/e27d4be7e912b188c91f70fb95e03e62a5bc97b8))
* **internal:** update java toolchain ([cd26492](https://github.com/minskimm/stainless-twilio-voice-java/commit/cd264925cf046efa5721924d3b86e7091948d552))
* **internal:** use `getOrNull` instead of `orElse(null)` ([284cb55](https://github.com/minskimm/stainless-twilio-voice-java/commit/284cb55d2ff9db03ededbc62937770760137fa9c))
* **tests:** improve enum examples ([#20](https://github.com/minskimm/stainless-twilio-voice-java/issues/20)) ([a8b7499](https://github.com/minskimm/stainless-twilio-voice-java/commit/a8b7499c5751867eb0777c1ce8578475b0dd95a0))


### Documentation

* add `build` method comments ([f5e9436](https://github.com/minskimm/stainless-twilio-voice-java/commit/f5e94361024e31971edd75c924d21d6b53749e47))
* add comments to `JsonField` classes ([4a58e4f](https://github.com/minskimm/stainless-twilio-voice-java/commit/4a58e4f3303cd758711d77c8e6cb2f34e4630763))
* **client:** update jackson compat error message ([3ec8ab3](https://github.com/minskimm/stainless-twilio-voice-java/commit/3ec8ab30d2b7ebd18240154365ab6744e56f8da4))
* deduplicate and refine comments ([7e5d0ad](https://github.com/minskimm/stainless-twilio-voice-java/commit/7e5d0ad64d2e83028d7695977110242b39913e11))
* document `JsonValue` construction in readme ([db2c2bd](https://github.com/minskimm/stainless-twilio-voice-java/commit/db2c2bd591f2e37f4c0c12d4427dc285e6f4a706))
* document how to forcibly omit required field ([2b57770](https://github.com/minskimm/stainless-twilio-voice-java/commit/2b57770d01057f6dac5ccb72abcf308cf0cac69d))
* explain http client customization ([620d8ee](https://github.com/minskimm/stainless-twilio-voice-java/commit/620d8eee756d842abd4577dd136f76b072217b5b))
* explain jackson compat in readme ([2d12707](https://github.com/minskimm/stainless-twilio-voice-java/commit/2d12707afdd41865eb0e0983f064b5fc2f016fc6))
* minor readme tweak ([#7](https://github.com/minskimm/stainless-twilio-voice-java/issues/7)) ([53f4bab](https://github.com/minskimm/stainless-twilio-voice-java/commit/53f4bab9034fb2b260e10f253448e38ba5ed8803))
* refine comments on multipart params ([#3](https://github.com/minskimm/stainless-twilio-voice-java/issues/3)) ([7b5fbc8](https://github.com/minskimm/stainless-twilio-voice-java/commit/7b5fbc872500d65a135444bc15f6e07e5bc70220))
* remove or fix invalid readme examples ([ddb9123](https://github.com/minskimm/stainless-twilio-voice-java/commit/ddb9123fe2ebe528fdbf4244918ddeda5e58f56a))
* revise readme docs about nested params ([e815a8c](https://github.com/minskimm/stainless-twilio-voice-java/commit/e815a8c4f7bf45764b850ec2da0bab9239dcdb13))
* swap examples used in readme ([#19](https://github.com/minskimm/stainless-twilio-voice-java/issues/19)) ([2b57770](https://github.com/minskimm/stainless-twilio-voice-java/commit/2b57770d01057f6dac5ccb72abcf308cf0cac69d))
* update documentation links to be more uniform ([9413cab](https://github.com/minskimm/stainless-twilio-voice-java/commit/9413cabcb7e4a48572e63dd2029d46af1d38805a))
* update readme exception docs ([#6](https://github.com/minskimm/stainless-twilio-voice-java/issues/6)) ([c030ccc](https://github.com/minskimm/stainless-twilio-voice-java/commit/c030ccc330b589e85a31d40119cca381b6957030))
