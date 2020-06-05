/**
 * Copyright (C) 2015-2020 Jason van Zyl
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing permissions and limitations under the License.
 */
package ca.vanzyl.provisio.model;

import com.google.common.collect.Lists;
import java.io.File;
import java.util.List;

public class ProvisioningResult {

  private List<ProvisioArchive> archives;
  private final ProvisioningRequest request;

  public ProvisioningResult(ProvisioningRequest request) {
    this.request = request;
  }

  public File getOutputDirectory() {
    return request.getOutputDirectory();
  }

  public List<ProvisioArchive> getArchives() {
    return archives;
  }

  public void addArchive(ProvisioArchive archive) {
    if (archives == null) {
      archives = Lists.newArrayList();
    }
    archives.add(archive);
  }
}
