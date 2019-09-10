/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package marquez.client.models;

import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;
import lombok.Builder;
import lombok.Value;
import marquez.client.utils.JsonUtils;

@Value
@Builder
public class JobRunMeta {
  @Nullable Instant nominalStartTime;
  @Nullable Instant nominalEndTime;
  @Nullable String runArgs;

  public Optional<Instant> getNominalStartTime() {
    return Optional.ofNullable(nominalStartTime);
  }

  public Optional<Instant> getNominalEndTime() {
    return Optional.ofNullable(nominalEndTime);
  }

  public Optional<String> getRunArgs() {
    return Optional.ofNullable(runArgs);
  }

  public String toJson() {
    return JsonUtils.toJson(this);
  }
}