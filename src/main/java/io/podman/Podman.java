package io.podman;

public @de.dentrassi.varlink.spi.Interface(name = "io.podman", factory = PodmanImpl.Factory.class) interface Podman {
	public static class Volume {
		private java.lang.String name;

		public java.lang.String getName() {
			return this.name;
		}

		public void setName(java.lang.String name) {
			this.name = name;
		}

		private java.util.Map<java.lang.String, java.lang.String> labels;

		public java.util.Map<java.lang.String, java.lang.String> getLabels() {
			return this.labels;
		}

		public void setLabels(java.util.Map<java.lang.String, java.lang.String> labels) {
			this.labels = labels;
		}

		private java.lang.String mountPoint;

		public java.lang.String getMountPoint() {
			return this.mountPoint;
		}

		public void setMountPoint(java.lang.String mountPoint) {
			this.mountPoint = mountPoint;
		}

		private java.lang.String driver;

		public java.lang.String getDriver() {
			return this.driver;
		}

		public void setDriver(java.lang.String driver) {
			this.driver = driver;
		}

		private java.util.Map<java.lang.String, java.lang.String> options;

		public java.util.Map<java.lang.String, java.lang.String> getOptions() {
			return this.options;
		}

		public void setOptions(java.util.Map<java.lang.String, java.lang.String> options) {
			this.options = options;
		}

		private java.lang.String scope;

		public java.lang.String getScope() {
			return this.scope;
		}

		public void setScope(java.lang.String scope) {
			this.scope = scope;
		}
	}

	public static class NotImplemented {
		private java.lang.String comment;

		public java.lang.String getComment() {
			return this.comment;
		}

		public void setComment(java.lang.String comment) {
			this.comment = comment;
		}
	}

	public static class StringResponse {
		private java.lang.String message;

		public java.lang.String getMessage() {
			return this.message;
		}

		public void setMessage(java.lang.String message) {
			this.message = message;
		}
	}

	public static class LogLine {
		private java.lang.String device;

		public java.lang.String getDevice() {
			return this.device;
		}

		public void setDevice(java.lang.String device) {
			this.device = device;
		}

		private java.lang.String parseLogType;

		public java.lang.String getParseLogType() {
			return this.parseLogType;
		}

		public void setParseLogType(java.lang.String parseLogType) {
			this.parseLogType = parseLogType;
		}

		private java.lang.String time;

		public java.lang.String getTime() {
			return this.time;
		}

		public void setTime(java.lang.String time) {
			this.time = time;
		}

		private java.lang.String msg;

		public java.lang.String getMsg() {
			return this.msg;
		}

		public void setMsg(java.lang.String msg) {
			this.msg = msg;
		}

		private java.lang.String cid;

		public java.lang.String getCid() {
			return this.cid;
		}

		public void setCid(java.lang.String cid) {
			this.cid = cid;
		}
	}

	public static class ContainerChanges {
		private java.util.List<java.lang.String> changed;

		public java.util.List<java.lang.String> getChanged() {
			return this.changed;
		}

		public void setChanged(java.util.List<java.lang.String> changed) {
			this.changed = changed;
		}

		private java.util.List<java.lang.String> added;

		public java.util.List<java.lang.String> getAdded() {
			return this.added;
		}

		public void setAdded(java.util.List<java.lang.String> added) {
			this.added = added;
		}

		private java.util.List<java.lang.String> deleted;

		public java.util.List<java.lang.String> getDeleted() {
			return this.deleted;
		}

		public void setDeleted(java.util.List<java.lang.String> deleted) {
			this.deleted = deleted;
		}
	}

	public static class ImageSaveOptions {
		private java.lang.String name;

		public java.lang.String getName() {
			return this.name;
		}

		public void setName(java.lang.String name) {
			this.name = name;
		}

		private java.lang.String format;

		public java.lang.String getFormat() {
			return this.format;
		}

		public void setFormat(java.lang.String format) {
			this.format = format;
		}

		private java.lang.String output;

		public java.lang.String getOutput() {
			return this.output;
		}

		public void setOutput(java.lang.String output) {
			this.output = output;
		}

		private java.lang.String outputType;

		public java.lang.String getOutputType() {
			return this.outputType;
		}

		public void setOutputType(java.lang.String outputType) {
			this.outputType = outputType;
		}

		private java.util.List<java.lang.String> moreTags;

		public java.util.List<java.lang.String> getMoreTags() {
			return this.moreTags;
		}

		public void setMoreTags(java.util.List<java.lang.String> moreTags) {
			this.moreTags = moreTags;
		}

		private java.lang.Boolean quiet;

		public java.lang.Boolean getQuiet() {
			return this.quiet;
		}

		public void setQuiet(java.lang.Boolean quiet) {
			this.quiet = quiet;
		}

		private java.lang.Boolean compress;

		public java.lang.Boolean getCompress() {
			return this.compress;
		}

		public void setCompress(java.lang.Boolean compress) {
			this.compress = compress;
		}
	}

	public static class VolumeCreateOpts {
		private java.lang.String volumeName;

		public java.lang.String getVolumeName() {
			return this.volumeName;
		}

		public void setVolumeName(java.lang.String volumeName) {
			this.volumeName = volumeName;
		}

		private java.lang.String driver;

		public java.lang.String getDriver() {
			return this.driver;
		}

		public void setDriver(java.lang.String driver) {
			this.driver = driver;
		}

		private java.util.Map<java.lang.String, java.lang.String> labels;

		public java.util.Map<java.lang.String, java.lang.String> getLabels() {
			return this.labels;
		}

		public void setLabels(java.util.Map<java.lang.String, java.lang.String> labels) {
			this.labels = labels;
		}

		private java.util.Map<java.lang.String, java.lang.String> options;

		public java.util.Map<java.lang.String, java.lang.String> getOptions() {
			return this.options;
		}

		public void setOptions(java.util.Map<java.lang.String, java.lang.String> options) {
			this.options = options;
		}
	}

	public static class VolumeRemoveOpts {
		private java.util.List<java.lang.String> volumes;

		public java.util.List<java.lang.String> getVolumes() {
			return this.volumes;
		}

		public void setVolumes(java.util.List<java.lang.String> volumes) {
			this.volumes = volumes;
		}

		private java.lang.Boolean all;

		public java.lang.Boolean getAll() {
			return this.all;
		}

		public void setAll(java.lang.Boolean all) {
			this.all = all;
		}

		private java.lang.Boolean force;

		public java.lang.Boolean getForce() {
			return this.force;
		}

		public void setForce(java.lang.Boolean force) {
			this.force = force;
		}
	}

	public static class Image {
		private java.lang.String id;

		public java.lang.String getId() {
			return this.id;
		}

		public void setId(java.lang.String id) {
			this.id = id;
		}

		private java.lang.String digest;

		public java.lang.String getDigest() {
			return this.digest;
		}

		public void setDigest(java.lang.String digest) {
			this.digest = digest;
		}

		private java.lang.String parentId;

		public java.lang.String getParentId() {
			return this.parentId;
		}

		public void setParentId(java.lang.String parentId) {
			this.parentId = parentId;
		}

		private java.util.List<java.lang.String> repoTags;

		public java.util.List<java.lang.String> getRepoTags() {
			return this.repoTags;
		}

		public void setRepoTags(java.util.List<java.lang.String> repoTags) {
			this.repoTags = repoTags;
		}

		private java.util.List<java.lang.String> repoDigests;

		public java.util.List<java.lang.String> getRepoDigests() {
			return this.repoDigests;
		}

		public void setRepoDigests(java.util.List<java.lang.String> repoDigests) {
			this.repoDigests = repoDigests;
		}

		private java.lang.String created;

		public java.lang.String getCreated() {
			return this.created;
		}

		public void setCreated(java.lang.String created) {
			this.created = created;
		}

		private java.lang.Long size;

		public java.lang.Long getSize() {
			return this.size;
		}

		public void setSize(java.lang.Long size) {
			this.size = size;
		}

		private java.lang.Long virtualSize;

		public java.lang.Long getVirtualSize() {
			return this.virtualSize;
		}

		public void setVirtualSize(java.lang.Long virtualSize) {
			this.virtualSize = virtualSize;
		}

		private java.lang.Long containers;

		public java.lang.Long getContainers() {
			return this.containers;
		}

		public void setContainers(java.lang.Long containers) {
			this.containers = containers;
		}

		private java.util.Map<java.lang.String, java.lang.String> labels;

		public java.util.Map<java.lang.String, java.lang.String> getLabels() {
			return this.labels;
		}

		public void setLabels(java.util.Map<java.lang.String, java.lang.String> labels) {
			this.labels = labels;
		}

		private java.lang.Boolean isParent;

		public java.lang.Boolean getIsParent() {
			return this.isParent;
		}

		public void setIsParent(java.lang.Boolean isParent) {
			this.isParent = isParent;
		}

		private java.lang.String topLayer;

		public java.lang.String getTopLayer() {
			return this.topLayer;
		}

		public void setTopLayer(java.lang.String topLayer) {
			this.topLayer = topLayer;
		}
	}

	public static class ImageHistory {
		private java.lang.String id;

		public java.lang.String getId() {
			return this.id;
		}

		public void setId(java.lang.String id) {
			this.id = id;
		}

		private java.lang.String created;

		public java.lang.String getCreated() {
			return this.created;
		}

		public void setCreated(java.lang.String created) {
			this.created = created;
		}

		private java.lang.String createdBy;

		public java.lang.String getCreatedBy() {
			return this.createdBy;
		}

		public void setCreatedBy(java.lang.String createdBy) {
			this.createdBy = createdBy;
		}

		private java.util.List<java.lang.String> tags;

		public java.util.List<java.lang.String> getTags() {
			return this.tags;
		}

		public void setTags(java.util.List<java.lang.String> tags) {
			this.tags = tags;
		}

		private java.lang.Long size;

		public java.lang.Long getSize() {
			return this.size;
		}

		public void setSize(java.lang.Long size) {
			this.size = size;
		}

		private java.lang.String comment;

		public java.lang.String getComment() {
			return this.comment;
		}

		public void setComment(java.lang.String comment) {
			this.comment = comment;
		}
	}

	public static class ImageSearchResult {
		private java.lang.String description;

		public java.lang.String getDescription() {
			return this.description;
		}

		public void setDescription(java.lang.String description) {
			this.description = description;
		}

		private java.lang.Boolean is_official;

		public java.lang.Boolean getIs_official() {
			return this.is_official;
		}

		public void setIs_official(java.lang.Boolean is_official) {
			this.is_official = is_official;
		}

		private java.lang.Boolean is_automated;

		public java.lang.Boolean getIs_automated() {
			return this.is_automated;
		}

		public void setIs_automated(java.lang.Boolean is_automated) {
			this.is_automated = is_automated;
		}

		private java.lang.String registry;

		public java.lang.String getRegistry() {
			return this.registry;
		}

		public void setRegistry(java.lang.String registry) {
			this.registry = registry;
		}

		private java.lang.String name;

		public java.lang.String getName() {
			return this.name;
		}

		public void setName(java.lang.String name) {
			this.name = name;
		}

		private java.lang.Long star_count;

		public java.lang.Long getStar_count() {
			return this.star_count;
		}

		public void setStar_count(java.lang.Long star_count) {
			this.star_count = star_count;
		}
	}

	public static class ImageSearchFilter {
		private java.util.Optional<java.lang.Boolean> is_official;

		public java.util.Optional<java.lang.Boolean> getIs_official() {
			return this.is_official;
		}

		public void setIs_official(java.util.Optional<java.lang.Boolean> is_official) {
			this.is_official = is_official;
		}

		private java.util.Optional<java.lang.Boolean> is_automated;

		public java.util.Optional<java.lang.Boolean> getIs_automated() {
			return this.is_automated;
		}

		public void setIs_automated(java.util.Optional<java.lang.Boolean> is_automated) {
			this.is_automated = is_automated;
		}

		private java.lang.Long star_count;

		public java.lang.Long getStar_count() {
			return this.star_count;
		}

		public void setStar_count(java.lang.Long star_count) {
			this.star_count = star_count;
		}
	}

	public static class KubePodService {
		private java.lang.String pod;

		public java.lang.String getPod() {
			return this.pod;
		}

		public void setPod(java.lang.String pod) {
			this.pod = pod;
		}

		private java.lang.String service;

		public java.lang.String getService() {
			return this.service;
		}

		public void setService(java.lang.String service) {
			this.service = service;
		}
	}

	public static class Container {
		private java.lang.String id;

		public java.lang.String getId() {
			return this.id;
		}

		public void setId(java.lang.String id) {
			this.id = id;
		}

		private java.lang.String image;

		public java.lang.String getImage() {
			return this.image;
		}

		public void setImage(java.lang.String image) {
			this.image = image;
		}

		private java.lang.String imageid;

		public java.lang.String getImageid() {
			return this.imageid;
		}

		public void setImageid(java.lang.String imageid) {
			this.imageid = imageid;
		}

		private java.util.List<java.lang.String> command;

		public java.util.List<java.lang.String> getCommand() {
			return this.command;
		}

		public void setCommand(java.util.List<java.lang.String> command) {
			this.command = command;
		}

		private java.lang.String createdat;

		public java.lang.String getCreatedat() {
			return this.createdat;
		}

		public void setCreatedat(java.lang.String createdat) {
			this.createdat = createdat;
		}

		private java.lang.String runningfor;

		public java.lang.String getRunningfor() {
			return this.runningfor;
		}

		public void setRunningfor(java.lang.String runningfor) {
			this.runningfor = runningfor;
		}

		private java.lang.String status;

		public java.lang.String getStatus() {
			return this.status;
		}

		public void setStatus(java.lang.String status) {
			this.status = status;
		}

		private java.util.List<ContainerPortMappings> ports;

		public java.util.List<ContainerPortMappings> getPorts() {
			return this.ports;
		}

		public void setPorts(java.util.List<ContainerPortMappings> ports) {
			this.ports = ports;
		}

		private java.lang.Long rootfssize;

		public java.lang.Long getRootfssize() {
			return this.rootfssize;
		}

		public void setRootfssize(java.lang.Long rootfssize) {
			this.rootfssize = rootfssize;
		}

		private java.lang.Long rwsize;

		public java.lang.Long getRwsize() {
			return this.rwsize;
		}

		public void setRwsize(java.lang.Long rwsize) {
			this.rwsize = rwsize;
		}

		private java.lang.String names;

		public java.lang.String getNames() {
			return this.names;
		}

		public void setNames(java.lang.String names) {
			this.names = names;
		}

		private java.util.Map<java.lang.String, java.lang.String> labels;

		public java.util.Map<java.lang.String, java.lang.String> getLabels() {
			return this.labels;
		}

		public void setLabels(java.util.Map<java.lang.String, java.lang.String> labels) {
			this.labels = labels;
		}

		private java.util.List<ContainerMount> mounts;

		public java.util.List<ContainerMount> getMounts() {
			return this.mounts;
		}

		public void setMounts(java.util.List<ContainerMount> mounts) {
			this.mounts = mounts;
		}

		private java.lang.Boolean containerrunning;

		public java.lang.Boolean getContainerrunning() {
			return this.containerrunning;
		}

		public void setContainerrunning(java.lang.Boolean containerrunning) {
			this.containerrunning = containerrunning;
		}

		private ContainerNameSpace namespaces;

		public ContainerNameSpace getNamespaces() {
			return this.namespaces;
		}

		public void setNamespaces(ContainerNameSpace namespaces) {
			this.namespaces = namespaces;
		}
	}

	public static class ContainerStats {
		private java.lang.String id;

		public java.lang.String getId() {
			return this.id;
		}

		public void setId(java.lang.String id) {
			this.id = id;
		}

		private java.lang.String name;

		public java.lang.String getName() {
			return this.name;
		}

		public void setName(java.lang.String name) {
			this.name = name;
		}

		private java.lang.Double cpu;

		public java.lang.Double getCpu() {
			return this.cpu;
		}

		public void setCpu(java.lang.Double cpu) {
			this.cpu = cpu;
		}

		private java.lang.Long cpu_nano;

		public java.lang.Long getCpu_nano() {
			return this.cpu_nano;
		}

		public void setCpu_nano(java.lang.Long cpu_nano) {
			this.cpu_nano = cpu_nano;
		}

		private java.lang.Long system_nano;

		public java.lang.Long getSystem_nano() {
			return this.system_nano;
		}

		public void setSystem_nano(java.lang.Long system_nano) {
			this.system_nano = system_nano;
		}

		private java.lang.Long mem_usage;

		public java.lang.Long getMem_usage() {
			return this.mem_usage;
		}

		public void setMem_usage(java.lang.Long mem_usage) {
			this.mem_usage = mem_usage;
		}

		private java.lang.Long mem_limit;

		public java.lang.Long getMem_limit() {
			return this.mem_limit;
		}

		public void setMem_limit(java.lang.Long mem_limit) {
			this.mem_limit = mem_limit;
		}

		private java.lang.Double mem_perc;

		public java.lang.Double getMem_perc() {
			return this.mem_perc;
		}

		public void setMem_perc(java.lang.Double mem_perc) {
			this.mem_perc = mem_perc;
		}

		private java.lang.Long net_input;

		public java.lang.Long getNet_input() {
			return this.net_input;
		}

		public void setNet_input(java.lang.Long net_input) {
			this.net_input = net_input;
		}

		private java.lang.Long net_output;

		public java.lang.Long getNet_output() {
			return this.net_output;
		}

		public void setNet_output(java.lang.Long net_output) {
			this.net_output = net_output;
		}

		private java.lang.Long block_output;

		public java.lang.Long getBlock_output() {
			return this.block_output;
		}

		public void setBlock_output(java.lang.Long block_output) {
			this.block_output = block_output;
		}

		private java.lang.Long block_input;

		public java.lang.Long getBlock_input() {
			return this.block_input;
		}

		public void setBlock_input(java.lang.Long block_input) {
			this.block_input = block_input;
		}

		private java.lang.Long pids;

		public java.lang.Long getPids() {
			return this.pids;
		}

		public void setPids(java.lang.Long pids) {
			this.pids = pids;
		}
	}

	public static class PsOpts {
		private java.lang.Boolean all;

		public java.lang.Boolean getAll() {
			return this.all;
		}

		public void setAll(java.lang.Boolean all) {
			this.all = all;
		}

		private java.util.Optional<java.util.List<java.lang.String>> filters;

		public java.util.Optional<java.util.List<java.lang.String>> getFilters() {
			return this.filters;
		}

		public void setFilters(java.util.Optional<java.util.List<java.lang.String>> filters) {
			this.filters = filters;
		}

		private java.util.Optional<java.lang.Long> last;

		public java.util.Optional<java.lang.Long> getLast() {
			return this.last;
		}

		public void setLast(java.util.Optional<java.lang.Long> last) {
			this.last = last;
		}

		private java.util.Optional<java.lang.Boolean> latest;

		public java.util.Optional<java.lang.Boolean> getLatest() {
			return this.latest;
		}

		public void setLatest(java.util.Optional<java.lang.Boolean> latest) {
			this.latest = latest;
		}

		private java.util.Optional<java.lang.Boolean> noTrunc;

		public java.util.Optional<java.lang.Boolean> getNoTrunc() {
			return this.noTrunc;
		}

		public void setNoTrunc(java.util.Optional<java.lang.Boolean> noTrunc) {
			this.noTrunc = noTrunc;
		}

		private java.util.Optional<java.lang.Boolean> pod;

		public java.util.Optional<java.lang.Boolean> getPod() {
			return this.pod;
		}

		public void setPod(java.util.Optional<java.lang.Boolean> pod) {
			this.pod = pod;
		}

		private java.util.Optional<java.lang.Boolean> quiet;

		public java.util.Optional<java.lang.Boolean> getQuiet() {
			return this.quiet;
		}

		public void setQuiet(java.util.Optional<java.lang.Boolean> quiet) {
			this.quiet = quiet;
		}

		private java.util.Optional<java.lang.String> sort;

		public java.util.Optional<java.lang.String> getSort() {
			return this.sort;
		}

		public void setSort(java.util.Optional<java.lang.String> sort) {
			this.sort = sort;
		}

		private java.util.Optional<java.lang.Boolean> sync;

		public java.util.Optional<java.lang.Boolean> getSync() {
			return this.sync;
		}

		public void setSync(java.util.Optional<java.lang.Boolean> sync) {
			this.sync = sync;
		}
	}

	public static class PsContainer {
		private java.lang.String id;

		public java.lang.String getId() {
			return this.id;
		}

		public void setId(java.lang.String id) {
			this.id = id;
		}

		private java.lang.String image;

		public java.lang.String getImage() {
			return this.image;
		}

		public void setImage(java.lang.String image) {
			this.image = image;
		}

		private java.lang.String command;

		public java.lang.String getCommand() {
			return this.command;
		}

		public void setCommand(java.lang.String command) {
			this.command = command;
		}

		private java.lang.String created;

		public java.lang.String getCreated() {
			return this.created;
		}

		public void setCreated(java.lang.String created) {
			this.created = created;
		}

		private java.lang.String ports;

		public java.lang.String getPorts() {
			return this.ports;
		}

		public void setPorts(java.lang.String ports) {
			this.ports = ports;
		}

		private java.lang.String names;

		public java.lang.String getNames() {
			return this.names;
		}

		public void setNames(java.lang.String names) {
			this.names = names;
		}

		private java.lang.Boolean isInfra;

		public java.lang.Boolean getIsInfra() {
			return this.isInfra;
		}

		public void setIsInfra(java.lang.Boolean isInfra) {
			this.isInfra = isInfra;
		}

		private java.lang.String status;

		public java.lang.String getStatus() {
			return this.status;
		}

		public void setStatus(java.lang.String status) {
			this.status = status;
		}

		private java.lang.String state;

		public java.lang.String getState() {
			return this.state;
		}

		public void setState(java.lang.String state) {
			this.state = state;
		}

		private java.lang.Long pidNum;

		public java.lang.Long getPidNum() {
			return this.pidNum;
		}

		public void setPidNum(java.lang.Long pidNum) {
			this.pidNum = pidNum;
		}

		private java.lang.Long rootFsSize;

		public java.lang.Long getRootFsSize() {
			return this.rootFsSize;
		}

		public void setRootFsSize(java.lang.Long rootFsSize) {
			this.rootFsSize = rootFsSize;
		}

		private java.lang.Long rwSize;

		public java.lang.Long getRwSize() {
			return this.rwSize;
		}

		public void setRwSize(java.lang.Long rwSize) {
			this.rwSize = rwSize;
		}

		private java.lang.String pod;

		public java.lang.String getPod() {
			return this.pod;
		}

		public void setPod(java.lang.String pod) {
			this.pod = pod;
		}

		private java.lang.String createdAt;

		public java.lang.String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(java.lang.String createdAt) {
			this.createdAt = createdAt;
		}

		private java.lang.String exitedAt;

		public java.lang.String getExitedAt() {
			return this.exitedAt;
		}

		public void setExitedAt(java.lang.String exitedAt) {
			this.exitedAt = exitedAt;
		}

		private java.lang.String startedAt;

		public java.lang.String getStartedAt() {
			return this.startedAt;
		}

		public void setStartedAt(java.lang.String startedAt) {
			this.startedAt = startedAt;
		}

		private java.util.Map<java.lang.String, java.lang.String> labels;

		public java.util.Map<java.lang.String, java.lang.String> getLabels() {
			return this.labels;
		}

		public void setLabels(java.util.Map<java.lang.String, java.lang.String> labels) {
			this.labels = labels;
		}

		private java.lang.String nsPid;

		public java.lang.String getNsPid() {
			return this.nsPid;
		}

		public void setNsPid(java.lang.String nsPid) {
			this.nsPid = nsPid;
		}

		private java.lang.String cgroup;

		public java.lang.String getCgroup() {
			return this.cgroup;
		}

		public void setCgroup(java.lang.String cgroup) {
			this.cgroup = cgroup;
		}

		private java.lang.String ipc;

		public java.lang.String getIpc() {
			return this.ipc;
		}

		public void setIpc(java.lang.String ipc) {
			this.ipc = ipc;
		}

		private java.lang.String mnt;

		public java.lang.String getMnt() {
			return this.mnt;
		}

		public void setMnt(java.lang.String mnt) {
			this.mnt = mnt;
		}

		private java.lang.String net;

		public java.lang.String getNet() {
			return this.net;
		}

		public void setNet(java.lang.String net) {
			this.net = net;
		}

		private java.lang.String pidNs;

		public java.lang.String getPidNs() {
			return this.pidNs;
		}

		public void setPidNs(java.lang.String pidNs) {
			this.pidNs = pidNs;
		}

		private java.lang.String user;

		public java.lang.String getUser() {
			return this.user;
		}

		public void setUser(java.lang.String user) {
			this.user = user;
		}

		private java.lang.String uts;

		public java.lang.String getUts() {
			return this.uts;
		}

		public void setUts(java.lang.String uts) {
			this.uts = uts;
		}

		private java.lang.String mounts;

		public java.lang.String getMounts() {
			return this.mounts;
		}

		public void setMounts(java.lang.String mounts) {
			this.mounts = mounts;
		}
	}

	public static class ContainerMount {
		private java.lang.String destination;

		public java.lang.String getDestination() {
			return this.destination;
		}

		public void setDestination(java.lang.String destination) {
			this.destination = destination;
		}

		private java.lang.String type;

		public java.lang.String getType() {
			return this.type;
		}

		public void setType(java.lang.String type) {
			this.type = type;
		}

		private java.lang.String source;

		public java.lang.String getSource() {
			return this.source;
		}

		public void setSource(java.lang.String source) {
			this.source = source;
		}

		private java.util.List<java.lang.String> options;

		public java.util.List<java.lang.String> getOptions() {
			return this.options;
		}

		public void setOptions(java.util.List<java.lang.String> options) {
			this.options = options;
		}
	}

	public static class ContainerPortMappings {
		private java.lang.String host_port;

		public java.lang.String getHost_port() {
			return this.host_port;
		}

		public void setHost_port(java.lang.String host_port) {
			this.host_port = host_port;
		}

		private java.lang.String host_ip;

		public java.lang.String getHost_ip() {
			return this.host_ip;
		}

		public void setHost_ip(java.lang.String host_ip) {
			this.host_ip = host_ip;
		}

		private java.lang.String protocol;

		public java.lang.String getProtocol() {
			return this.protocol;
		}

		public void setProtocol(java.lang.String protocol) {
			this.protocol = protocol;
		}

		private java.lang.String container_port;

		public java.lang.String getContainer_port() {
			return this.container_port;
		}

		public void setContainer_port(java.lang.String container_port) {
			this.container_port = container_port;
		}
	}

	public static class ContainerNameSpace {
		private java.lang.String user;

		public java.lang.String getUser() {
			return this.user;
		}

		public void setUser(java.lang.String user) {
			this.user = user;
		}

		private java.lang.String uts;

		public java.lang.String getUts() {
			return this.uts;
		}

		public void setUts(java.lang.String uts) {
			this.uts = uts;
		}

		private java.lang.String pidns;

		public java.lang.String getPidns() {
			return this.pidns;
		}

		public void setPidns(java.lang.String pidns) {
			this.pidns = pidns;
		}

		private java.lang.String pid;

		public java.lang.String getPid() {
			return this.pid;
		}

		public void setPid(java.lang.String pid) {
			this.pid = pid;
		}

		private java.lang.String cgroup;

		public java.lang.String getCgroup() {
			return this.cgroup;
		}

		public void setCgroup(java.lang.String cgroup) {
			this.cgroup = cgroup;
		}

		private java.lang.String net;

		public java.lang.String getNet() {
			return this.net;
		}

		public void setNet(java.lang.String net) {
			this.net = net;
		}

		private java.lang.String mnt;

		public java.lang.String getMnt() {
			return this.mnt;
		}

		public void setMnt(java.lang.String mnt) {
			this.mnt = mnt;
		}

		private java.lang.String ipc;

		public java.lang.String getIpc() {
			return this.ipc;
		}

		public void setIpc(java.lang.String ipc) {
			this.ipc = ipc;
		}
	}

	public static class InfoDistribution {
		private java.lang.String distribution;

		public java.lang.String getDistribution() {
			return this.distribution;
		}

		public void setDistribution(java.lang.String distribution) {
			this.distribution = distribution;
		}

		private java.lang.String version;

		public java.lang.String getVersion() {
			return this.version;
		}

		public void setVersion(java.lang.String version) {
			this.version = version;
		}
	}

	public static class InfoHost {
		private java.lang.String buildah_version;

		public java.lang.String getBuildah_version() {
			return this.buildah_version;
		}

		public void setBuildah_version(java.lang.String buildah_version) {
			this.buildah_version = buildah_version;
		}

		private InfoDistribution distribution;

		public InfoDistribution getDistribution() {
			return this.distribution;
		}

		public void setDistribution(InfoDistribution distribution) {
			this.distribution = distribution;
		}

		private java.lang.Long mem_free;

		public java.lang.Long getMem_free() {
			return this.mem_free;
		}

		public void setMem_free(java.lang.Long mem_free) {
			this.mem_free = mem_free;
		}

		private java.lang.Long mem_total;

		public java.lang.Long getMem_total() {
			return this.mem_total;
		}

		public void setMem_total(java.lang.Long mem_total) {
			this.mem_total = mem_total;
		}

		private java.lang.Long swap_free;

		public java.lang.Long getSwap_free() {
			return this.swap_free;
		}

		public void setSwap_free(java.lang.Long swap_free) {
			this.swap_free = swap_free;
		}

		private java.lang.Long swap_total;

		public java.lang.Long getSwap_total() {
			return this.swap_total;
		}

		public void setSwap_total(java.lang.Long swap_total) {
			this.swap_total = swap_total;
		}

		private java.lang.String arch;

		public java.lang.String getArch() {
			return this.arch;
		}

		public void setArch(java.lang.String arch) {
			this.arch = arch;
		}

		private java.lang.Long cpus;

		public java.lang.Long getCpus() {
			return this.cpus;
		}

		public void setCpus(java.lang.Long cpus) {
			this.cpus = cpus;
		}

		private java.lang.String hostname;

		public java.lang.String getHostname() {
			return this.hostname;
		}

		public void setHostname(java.lang.String hostname) {
			this.hostname = hostname;
		}

		private java.lang.String kernel;

		public java.lang.String getKernel() {
			return this.kernel;
		}

		public void setKernel(java.lang.String kernel) {
			this.kernel = kernel;
		}

		private java.lang.String os;

		public java.lang.String getOs() {
			return this.os;
		}

		public void setOs(java.lang.String os) {
			this.os = os;
		}

		private java.lang.String uptime;

		public java.lang.String getUptime() {
			return this.uptime;
		}

		public void setUptime(java.lang.String uptime) {
			this.uptime = uptime;
		}
	}

	public static class InfoGraphStatus {
		private java.lang.String backing_filesystem;

		public java.lang.String getBacking_filesystem() {
			return this.backing_filesystem;
		}

		public void setBacking_filesystem(java.lang.String backing_filesystem) {
			this.backing_filesystem = backing_filesystem;
		}

		private java.lang.String native_overlay_diff;

		public java.lang.String getNative_overlay_diff() {
			return this.native_overlay_diff;
		}

		public void setNative_overlay_diff(java.lang.String native_overlay_diff) {
			this.native_overlay_diff = native_overlay_diff;
		}

		private java.lang.String supports_d_type;

		public java.lang.String getSupports_d_type() {
			return this.supports_d_type;
		}

		public void setSupports_d_type(java.lang.String supports_d_type) {
			this.supports_d_type = supports_d_type;
		}
	}

	public static class InfoStore {
		private java.lang.Long containers;

		public java.lang.Long getContainers() {
			return this.containers;
		}

		public void setContainers(java.lang.Long containers) {
			this.containers = containers;
		}

		private java.lang.Long images;

		public java.lang.Long getImages() {
			return this.images;
		}

		public void setImages(java.lang.Long images) {
			this.images = images;
		}

		private java.lang.String graph_driver_name;

		public java.lang.String getGraph_driver_name() {
			return this.graph_driver_name;
		}

		public void setGraph_driver_name(java.lang.String graph_driver_name) {
			this.graph_driver_name = graph_driver_name;
		}

		private java.lang.String graph_driver_options;

		public java.lang.String getGraph_driver_options() {
			return this.graph_driver_options;
		}

		public void setGraph_driver_options(java.lang.String graph_driver_options) {
			this.graph_driver_options = graph_driver_options;
		}

		private java.lang.String graph_root;

		public java.lang.String getGraph_root() {
			return this.graph_root;
		}

		public void setGraph_root(java.lang.String graph_root) {
			this.graph_root = graph_root;
		}

		private InfoGraphStatus graph_status;

		public InfoGraphStatus getGraph_status() {
			return this.graph_status;
		}

		public void setGraph_status(InfoGraphStatus graph_status) {
			this.graph_status = graph_status;
		}

		private java.lang.String run_root;

		public java.lang.String getRun_root() {
			return this.run_root;
		}

		public void setRun_root(java.lang.String run_root) {
			this.run_root = run_root;
		}
	}

	public static class InfoPodmanBinary {
		private java.lang.String compiler;

		public java.lang.String getCompiler() {
			return this.compiler;
		}

		public void setCompiler(java.lang.String compiler) {
			this.compiler = compiler;
		}

		private java.lang.String go_version;

		public java.lang.String getGo_version() {
			return this.go_version;
		}

		public void setGo_version(java.lang.String go_version) {
			this.go_version = go_version;
		}

		private java.lang.String podman_version;

		public java.lang.String getPodman_version() {
			return this.podman_version;
		}

		public void setPodman_version(java.lang.String podman_version) {
			this.podman_version = podman_version;
		}

		private java.lang.String git_commit;

		public java.lang.String getGit_commit() {
			return this.git_commit;
		}

		public void setGit_commit(java.lang.String git_commit) {
			this.git_commit = git_commit;
		}
	}

	public static class PodmanInfo {
		private InfoHost host;

		public InfoHost getHost() {
			return this.host;
		}

		public void setHost(InfoHost host) {
			this.host = host;
		}

		private java.util.List<java.lang.String> registries;

		public java.util.List<java.lang.String> getRegistries() {
			return this.registries;
		}

		public void setRegistries(java.util.List<java.lang.String> registries) {
			this.registries = registries;
		}

		private java.util.List<java.lang.String> insecure_registries;

		public java.util.List<java.lang.String> getInsecure_registries() {
			return this.insecure_registries;
		}

		public void setInsecure_registries(java.util.List<java.lang.String> insecure_registries) {
			this.insecure_registries = insecure_registries;
		}

		private InfoStore store;

		public InfoStore getStore() {
			return this.store;
		}

		public void setStore(InfoStore store) {
			this.store = store;
		}

		private InfoPodmanBinary podman;

		public InfoPodmanBinary getPodman() {
			return this.podman;
		}

		public void setPodman(InfoPodmanBinary podman) {
			this.podman = podman;
		}
	}

	public static class Sockets {
		private java.lang.String container_id;

		public java.lang.String getContainer_id() {
			return this.container_id;
		}

		public void setContainer_id(java.lang.String container_id) {
			this.container_id = container_id;
		}

		private java.lang.String io_socket;

		public java.lang.String getIo_socket() {
			return this.io_socket;
		}

		public void setIo_socket(java.lang.String io_socket) {
			this.io_socket = io_socket;
		}

		private java.lang.String control_socket;

		public java.lang.String getControl_socket() {
			return this.control_socket;
		}

		public void setControl_socket(java.lang.String control_socket) {
			this.control_socket = control_socket;
		}
	}

	public static class Create {
		private java.util.List<java.lang.String> args;

		public java.util.List<java.lang.String> getArgs() {
			return this.args;
		}

		public void setArgs(java.util.List<java.lang.String> args) {
			this.args = args;
		}

		private java.util.Optional<java.util.List<java.lang.String>> addHost;

		public java.util.Optional<java.util.List<java.lang.String>> getAddHost() {
			return this.addHost;
		}

		public void setAddHost(java.util.Optional<java.util.List<java.lang.String>> addHost) {
			this.addHost = addHost;
		}

		private java.util.Optional<java.util.List<java.lang.String>> annotation;

		public java.util.Optional<java.util.List<java.lang.String>> getAnnotation() {
			return this.annotation;
		}

		public void setAnnotation(java.util.Optional<java.util.List<java.lang.String>> annotation) {
			this.annotation = annotation;
		}

		private java.util.Optional<java.util.List<java.lang.String>> attach;

		public java.util.Optional<java.util.List<java.lang.String>> getAttach() {
			return this.attach;
		}

		public void setAttach(java.util.Optional<java.util.List<java.lang.String>> attach) {
			this.attach = attach;
		}

		private java.util.Optional<java.lang.String> blkioWeight;

		public java.util.Optional<java.lang.String> getBlkioWeight() {
			return this.blkioWeight;
		}

		public void setBlkioWeight(java.util.Optional<java.lang.String> blkioWeight) {
			this.blkioWeight = blkioWeight;
		}

		private java.util.Optional<java.util.List<java.lang.String>> blkioWeightDevice;

		public java.util.Optional<java.util.List<java.lang.String>> getBlkioWeightDevice() {
			return this.blkioWeightDevice;
		}

		public void setBlkioWeightDevice(java.util.Optional<java.util.List<java.lang.String>> blkioWeightDevice) {
			this.blkioWeightDevice = blkioWeightDevice;
		}

		private java.util.Optional<java.util.List<java.lang.String>> capAdd;

		public java.util.Optional<java.util.List<java.lang.String>> getCapAdd() {
			return this.capAdd;
		}

		public void setCapAdd(java.util.Optional<java.util.List<java.lang.String>> capAdd) {
			this.capAdd = capAdd;
		}

		private java.util.Optional<java.util.List<java.lang.String>> capDrop;

		public java.util.Optional<java.util.List<java.lang.String>> getCapDrop() {
			return this.capDrop;
		}

		public void setCapDrop(java.util.Optional<java.util.List<java.lang.String>> capDrop) {
			this.capDrop = capDrop;
		}

		private java.util.Optional<java.lang.String> cgroupParent;

		public java.util.Optional<java.lang.String> getCgroupParent() {
			return this.cgroupParent;
		}

		public void setCgroupParent(java.util.Optional<java.lang.String> cgroupParent) {
			this.cgroupParent = cgroupParent;
		}

		private java.util.Optional<java.lang.String> cidFile;

		public java.util.Optional<java.lang.String> getCidFile() {
			return this.cidFile;
		}

		public void setCidFile(java.util.Optional<java.lang.String> cidFile) {
			this.cidFile = cidFile;
		}

		private java.util.Optional<java.lang.String> conmonPidfile;

		public java.util.Optional<java.lang.String> getConmonPidfile() {
			return this.conmonPidfile;
		}

		public void setConmonPidfile(java.util.Optional<java.lang.String> conmonPidfile) {
			this.conmonPidfile = conmonPidfile;
		}

		private java.util.Optional<java.util.List<java.lang.String>> command;

		public java.util.Optional<java.util.List<java.lang.String>> getCommand() {
			return this.command;
		}

		public void setCommand(java.util.Optional<java.util.List<java.lang.String>> command) {
			this.command = command;
		}

		private java.util.Optional<java.lang.Long> cpuPeriod;

		public java.util.Optional<java.lang.Long> getCpuPeriod() {
			return this.cpuPeriod;
		}

		public void setCpuPeriod(java.util.Optional<java.lang.Long> cpuPeriod) {
			this.cpuPeriod = cpuPeriod;
		}

		private java.util.Optional<java.lang.Long> cpuQuota;

		public java.util.Optional<java.lang.Long> getCpuQuota() {
			return this.cpuQuota;
		}

		public void setCpuQuota(java.util.Optional<java.lang.Long> cpuQuota) {
			this.cpuQuota = cpuQuota;
		}

		private java.util.Optional<java.lang.Long> cpuRtPeriod;

		public java.util.Optional<java.lang.Long> getCpuRtPeriod() {
			return this.cpuRtPeriod;
		}

		public void setCpuRtPeriod(java.util.Optional<java.lang.Long> cpuRtPeriod) {
			this.cpuRtPeriod = cpuRtPeriod;
		}

		private java.util.Optional<java.lang.Long> cpuRtRuntime;

		public java.util.Optional<java.lang.Long> getCpuRtRuntime() {
			return this.cpuRtRuntime;
		}

		public void setCpuRtRuntime(java.util.Optional<java.lang.Long> cpuRtRuntime) {
			this.cpuRtRuntime = cpuRtRuntime;
		}

		private java.util.Optional<java.lang.Long> cpuShares;

		public java.util.Optional<java.lang.Long> getCpuShares() {
			return this.cpuShares;
		}

		public void setCpuShares(java.util.Optional<java.lang.Long> cpuShares) {
			this.cpuShares = cpuShares;
		}

		private java.util.Optional<java.lang.Double> cpus;

		public java.util.Optional<java.lang.Double> getCpus() {
			return this.cpus;
		}

		public void setCpus(java.util.Optional<java.lang.Double> cpus) {
			this.cpus = cpus;
		}

		private java.util.Optional<java.lang.String> cpuSetCpus;

		public java.util.Optional<java.lang.String> getCpuSetCpus() {
			return this.cpuSetCpus;
		}

		public void setCpuSetCpus(java.util.Optional<java.lang.String> cpuSetCpus) {
			this.cpuSetCpus = cpuSetCpus;
		}

		private java.util.Optional<java.lang.String> cpuSetMems;

		public java.util.Optional<java.lang.String> getCpuSetMems() {
			return this.cpuSetMems;
		}

		public void setCpuSetMems(java.util.Optional<java.lang.String> cpuSetMems) {
			this.cpuSetMems = cpuSetMems;
		}

		private java.util.Optional<java.lang.Boolean> detach;

		public java.util.Optional<java.lang.Boolean> getDetach() {
			return this.detach;
		}

		public void setDetach(java.util.Optional<java.lang.Boolean> detach) {
			this.detach = detach;
		}

		private java.util.Optional<java.lang.String> detachKeys;

		public java.util.Optional<java.lang.String> getDetachKeys() {
			return this.detachKeys;
		}

		public void setDetachKeys(java.util.Optional<java.lang.String> detachKeys) {
			this.detachKeys = detachKeys;
		}

		private java.util.Optional<java.util.List<java.lang.String>> device;

		public java.util.Optional<java.util.List<java.lang.String>> getDevice() {
			return this.device;
		}

		public void setDevice(java.util.Optional<java.util.List<java.lang.String>> device) {
			this.device = device;
		}

		private java.util.Optional<java.util.List<java.lang.String>> deviceReadBps;

		public java.util.Optional<java.util.List<java.lang.String>> getDeviceReadBps() {
			return this.deviceReadBps;
		}

		public void setDeviceReadBps(java.util.Optional<java.util.List<java.lang.String>> deviceReadBps) {
			this.deviceReadBps = deviceReadBps;
		}

		private java.util.Optional<java.util.List<java.lang.String>> deviceReadIops;

		public java.util.Optional<java.util.List<java.lang.String>> getDeviceReadIops() {
			return this.deviceReadIops;
		}

		public void setDeviceReadIops(java.util.Optional<java.util.List<java.lang.String>> deviceReadIops) {
			this.deviceReadIops = deviceReadIops;
		}

		private java.util.Optional<java.util.List<java.lang.String>> deviceWriteBps;

		public java.util.Optional<java.util.List<java.lang.String>> getDeviceWriteBps() {
			return this.deviceWriteBps;
		}

		public void setDeviceWriteBps(java.util.Optional<java.util.List<java.lang.String>> deviceWriteBps) {
			this.deviceWriteBps = deviceWriteBps;
		}

		private java.util.Optional<java.util.List<java.lang.String>> deviceWriteIops;

		public java.util.Optional<java.util.List<java.lang.String>> getDeviceWriteIops() {
			return this.deviceWriteIops;
		}

		public void setDeviceWriteIops(java.util.Optional<java.util.List<java.lang.String>> deviceWriteIops) {
			this.deviceWriteIops = deviceWriteIops;
		}

		private java.util.Optional<java.util.List<java.lang.String>> dns;

		public java.util.Optional<java.util.List<java.lang.String>> getDns() {
			return this.dns;
		}

		public void setDns(java.util.Optional<java.util.List<java.lang.String>> dns) {
			this.dns = dns;
		}

		private java.util.Optional<java.util.List<java.lang.String>> dnsOpt;

		public java.util.Optional<java.util.List<java.lang.String>> getDnsOpt() {
			return this.dnsOpt;
		}

		public void setDnsOpt(java.util.Optional<java.util.List<java.lang.String>> dnsOpt) {
			this.dnsOpt = dnsOpt;
		}

		private java.util.Optional<java.util.List<java.lang.String>> dnsSearch;

		public java.util.Optional<java.util.List<java.lang.String>> getDnsSearch() {
			return this.dnsSearch;
		}

		public void setDnsSearch(java.util.Optional<java.util.List<java.lang.String>> dnsSearch) {
			this.dnsSearch = dnsSearch;
		}

		private java.util.Optional<java.util.List<java.lang.String>> dnsServers;

		public java.util.Optional<java.util.List<java.lang.String>> getDnsServers() {
			return this.dnsServers;
		}

		public void setDnsServers(java.util.Optional<java.util.List<java.lang.String>> dnsServers) {
			this.dnsServers = dnsServers;
		}

		private java.util.Optional<java.lang.String> entrypoint;

		public java.util.Optional<java.lang.String> getEntrypoint() {
			return this.entrypoint;
		}

		public void setEntrypoint(java.util.Optional<java.lang.String> entrypoint) {
			this.entrypoint = entrypoint;
		}

		private java.util.Optional<java.util.List<java.lang.String>> env;

		public java.util.Optional<java.util.List<java.lang.String>> getEnv() {
			return this.env;
		}

		public void setEnv(java.util.Optional<java.util.List<java.lang.String>> env) {
			this.env = env;
		}

		private java.util.Optional<java.util.List<java.lang.String>> envFile;

		public java.util.Optional<java.util.List<java.lang.String>> getEnvFile() {
			return this.envFile;
		}

		public void setEnvFile(java.util.Optional<java.util.List<java.lang.String>> envFile) {
			this.envFile = envFile;
		}

		private java.util.Optional<java.util.List<java.lang.String>> expose;

		public java.util.Optional<java.util.List<java.lang.String>> getExpose() {
			return this.expose;
		}

		public void setExpose(java.util.Optional<java.util.List<java.lang.String>> expose) {
			this.expose = expose;
		}

		private java.util.Optional<java.util.List<java.lang.String>> gidmap;

		public java.util.Optional<java.util.List<java.lang.String>> getGidmap() {
			return this.gidmap;
		}

		public void setGidmap(java.util.Optional<java.util.List<java.lang.String>> gidmap) {
			this.gidmap = gidmap;
		}

		private java.util.Optional<java.util.List<java.lang.String>> groupadd;

		public java.util.Optional<java.util.List<java.lang.String>> getGroupadd() {
			return this.groupadd;
		}

		public void setGroupadd(java.util.Optional<java.util.List<java.lang.String>> groupadd) {
			this.groupadd = groupadd;
		}

		private java.util.Optional<java.lang.String> healthcheckCommand;

		public java.util.Optional<java.lang.String> getHealthcheckCommand() {
			return this.healthcheckCommand;
		}

		public void setHealthcheckCommand(java.util.Optional<java.lang.String> healthcheckCommand) {
			this.healthcheckCommand = healthcheckCommand;
		}

		private java.util.Optional<java.lang.String> healthcheckInterval;

		public java.util.Optional<java.lang.String> getHealthcheckInterval() {
			return this.healthcheckInterval;
		}

		public void setHealthcheckInterval(java.util.Optional<java.lang.String> healthcheckInterval) {
			this.healthcheckInterval = healthcheckInterval;
		}

		private java.util.Optional<java.lang.Long> healthcheckRetries;

		public java.util.Optional<java.lang.Long> getHealthcheckRetries() {
			return this.healthcheckRetries;
		}

		public void setHealthcheckRetries(java.util.Optional<java.lang.Long> healthcheckRetries) {
			this.healthcheckRetries = healthcheckRetries;
		}

		private java.util.Optional<java.lang.String> healthcheckStartPeriod;

		public java.util.Optional<java.lang.String> getHealthcheckStartPeriod() {
			return this.healthcheckStartPeriod;
		}

		public void setHealthcheckStartPeriod(java.util.Optional<java.lang.String> healthcheckStartPeriod) {
			this.healthcheckStartPeriod = healthcheckStartPeriod;
		}

		private java.util.Optional<java.lang.String> healthcheckTimeout;

		public java.util.Optional<java.lang.String> getHealthcheckTimeout() {
			return this.healthcheckTimeout;
		}

		public void setHealthcheckTimeout(java.util.Optional<java.lang.String> healthcheckTimeout) {
			this.healthcheckTimeout = healthcheckTimeout;
		}

		private java.util.Optional<java.lang.String> hostname;

		public java.util.Optional<java.lang.String> getHostname() {
			return this.hostname;
		}

		public void setHostname(java.util.Optional<java.lang.String> hostname) {
			this.hostname = hostname;
		}

		private java.util.Optional<java.lang.String> imageVolume;

		public java.util.Optional<java.lang.String> getImageVolume() {
			return this.imageVolume;
		}

		public void setImageVolume(java.util.Optional<java.lang.String> imageVolume) {
			this.imageVolume = imageVolume;
		}

		private java.util.Optional<java.lang.Boolean> init;

		public java.util.Optional<java.lang.Boolean> getInit() {
			return this.init;
		}

		public void setInit(java.util.Optional<java.lang.Boolean> init) {
			this.init = init;
		}

		private java.util.Optional<java.lang.String> initPath;

		public java.util.Optional<java.lang.String> getInitPath() {
			return this.initPath;
		}

		public void setInitPath(java.util.Optional<java.lang.String> initPath) {
			this.initPath = initPath;
		}

		private java.util.Optional<java.lang.Boolean> interactive;

		public java.util.Optional<java.lang.Boolean> getInteractive() {
			return this.interactive;
		}

		public void setInteractive(java.util.Optional<java.lang.Boolean> interactive) {
			this.interactive = interactive;
		}

		private java.util.Optional<java.lang.String> ip;

		public java.util.Optional<java.lang.String> getIp() {
			return this.ip;
		}

		public void setIp(java.util.Optional<java.lang.String> ip) {
			this.ip = ip;
		}

		private java.util.Optional<java.lang.String> ipc;

		public java.util.Optional<java.lang.String> getIpc() {
			return this.ipc;
		}

		public void setIpc(java.util.Optional<java.lang.String> ipc) {
			this.ipc = ipc;
		}

		private java.util.Optional<java.lang.String> kernelMemory;

		public java.util.Optional<java.lang.String> getKernelMemory() {
			return this.kernelMemory;
		}

		public void setKernelMemory(java.util.Optional<java.lang.String> kernelMemory) {
			this.kernelMemory = kernelMemory;
		}

		private java.util.Optional<java.util.List<java.lang.String>> label;

		public java.util.Optional<java.util.List<java.lang.String>> getLabel() {
			return this.label;
		}

		public void setLabel(java.util.Optional<java.util.List<java.lang.String>> label) {
			this.label = label;
		}

		private java.util.Optional<java.util.List<java.lang.String>> labelFile;

		public java.util.Optional<java.util.List<java.lang.String>> getLabelFile() {
			return this.labelFile;
		}

		public void setLabelFile(java.util.Optional<java.util.List<java.lang.String>> labelFile) {
			this.labelFile = labelFile;
		}

		private java.util.Optional<java.lang.String> logDriver;

		public java.util.Optional<java.lang.String> getLogDriver() {
			return this.logDriver;
		}

		public void setLogDriver(java.util.Optional<java.lang.String> logDriver) {
			this.logDriver = logDriver;
		}

		private java.util.Optional<java.util.List<java.lang.String>> logOpt;

		public java.util.Optional<java.util.List<java.lang.String>> getLogOpt() {
			return this.logOpt;
		}

		public void setLogOpt(java.util.Optional<java.util.List<java.lang.String>> logOpt) {
			this.logOpt = logOpt;
		}

		private java.util.Optional<java.lang.String> macAddress;

		public java.util.Optional<java.lang.String> getMacAddress() {
			return this.macAddress;
		}

		public void setMacAddress(java.util.Optional<java.lang.String> macAddress) {
			this.macAddress = macAddress;
		}

		private java.util.Optional<java.lang.String> memory;

		public java.util.Optional<java.lang.String> getMemory() {
			return this.memory;
		}

		public void setMemory(java.util.Optional<java.lang.String> memory) {
			this.memory = memory;
		}

		private java.util.Optional<java.lang.String> memoryReservation;

		public java.util.Optional<java.lang.String> getMemoryReservation() {
			return this.memoryReservation;
		}

		public void setMemoryReservation(java.util.Optional<java.lang.String> memoryReservation) {
			this.memoryReservation = memoryReservation;
		}

		private java.util.Optional<java.lang.String> memorySwap;

		public java.util.Optional<java.lang.String> getMemorySwap() {
			return this.memorySwap;
		}

		public void setMemorySwap(java.util.Optional<java.lang.String> memorySwap) {
			this.memorySwap = memorySwap;
		}

		private java.util.Optional<java.lang.Long> memorySwappiness;

		public java.util.Optional<java.lang.Long> getMemorySwappiness() {
			return this.memorySwappiness;
		}

		public void setMemorySwappiness(java.util.Optional<java.lang.Long> memorySwappiness) {
			this.memorySwappiness = memorySwappiness;
		}

		private java.util.Optional<java.lang.String> name;

		public java.util.Optional<java.lang.String> getName() {
			return this.name;
		}

		public void setName(java.util.Optional<java.lang.String> name) {
			this.name = name;
		}

		private java.util.Optional<java.lang.String> net;

		public java.util.Optional<java.lang.String> getNet() {
			return this.net;
		}

		public void setNet(java.util.Optional<java.lang.String> net) {
			this.net = net;
		}

		private java.util.Optional<java.lang.String> network;

		public java.util.Optional<java.lang.String> getNetwork() {
			return this.network;
		}

		public void setNetwork(java.util.Optional<java.lang.String> network) {
			this.network = network;
		}

		private java.util.Optional<java.lang.Boolean> noHosts;

		public java.util.Optional<java.lang.Boolean> getNoHosts() {
			return this.noHosts;
		}

		public void setNoHosts(java.util.Optional<java.lang.Boolean> noHosts) {
			this.noHosts = noHosts;
		}

		private java.util.Optional<java.lang.Boolean> oomKillDisable;

		public java.util.Optional<java.lang.Boolean> getOomKillDisable() {
			return this.oomKillDisable;
		}

		public void setOomKillDisable(java.util.Optional<java.lang.Boolean> oomKillDisable) {
			this.oomKillDisable = oomKillDisable;
		}

		private java.util.Optional<java.lang.Long> oomScoreAdj;

		public java.util.Optional<java.lang.Long> getOomScoreAdj() {
			return this.oomScoreAdj;
		}

		public void setOomScoreAdj(java.util.Optional<java.lang.Long> oomScoreAdj) {
			this.oomScoreAdj = oomScoreAdj;
		}

		private java.util.Optional<java.lang.String> pid;

		public java.util.Optional<java.lang.String> getPid() {
			return this.pid;
		}

		public void setPid(java.util.Optional<java.lang.String> pid) {
			this.pid = pid;
		}

		private java.util.Optional<java.lang.Long> pidsLimit;

		public java.util.Optional<java.lang.Long> getPidsLimit() {
			return this.pidsLimit;
		}

		public void setPidsLimit(java.util.Optional<java.lang.Long> pidsLimit) {
			this.pidsLimit = pidsLimit;
		}

		private java.util.Optional<java.lang.String> pod;

		public java.util.Optional<java.lang.String> getPod() {
			return this.pod;
		}

		public void setPod(java.util.Optional<java.lang.String> pod) {
			this.pod = pod;
		}

		private java.util.Optional<java.lang.Boolean> privileged;

		public java.util.Optional<java.lang.Boolean> getPrivileged() {
			return this.privileged;
		}

		public void setPrivileged(java.util.Optional<java.lang.Boolean> privileged) {
			this.privileged = privileged;
		}

		private java.util.Optional<java.util.List<java.lang.String>> publish;

		public java.util.Optional<java.util.List<java.lang.String>> getPublish() {
			return this.publish;
		}

		public void setPublish(java.util.Optional<java.util.List<java.lang.String>> publish) {
			this.publish = publish;
		}

		private java.util.Optional<java.lang.Boolean> publishAll;

		public java.util.Optional<java.lang.Boolean> getPublishAll() {
			return this.publishAll;
		}

		public void setPublishAll(java.util.Optional<java.lang.Boolean> publishAll) {
			this.publishAll = publishAll;
		}

		private java.util.Optional<java.lang.Boolean> quiet;

		public java.util.Optional<java.lang.Boolean> getQuiet() {
			return this.quiet;
		}

		public void setQuiet(java.util.Optional<java.lang.Boolean> quiet) {
			this.quiet = quiet;
		}

		private java.util.Optional<java.lang.Boolean> readonly;

		public java.util.Optional<java.lang.Boolean> getReadonly() {
			return this.readonly;
		}

		public void setReadonly(java.util.Optional<java.lang.Boolean> readonly) {
			this.readonly = readonly;
		}

		private java.util.Optional<java.lang.Boolean> readonlytmpfs;

		public java.util.Optional<java.lang.Boolean> getReadonlytmpfs() {
			return this.readonlytmpfs;
		}

		public void setReadonlytmpfs(java.util.Optional<java.lang.Boolean> readonlytmpfs) {
			this.readonlytmpfs = readonlytmpfs;
		}

		private java.util.Optional<java.lang.String> restart;

		public java.util.Optional<java.lang.String> getRestart() {
			return this.restart;
		}

		public void setRestart(java.util.Optional<java.lang.String> restart) {
			this.restart = restart;
		}

		private java.util.Optional<java.lang.Boolean> rm;

		public java.util.Optional<java.lang.Boolean> getRm() {
			return this.rm;
		}

		public void setRm(java.util.Optional<java.lang.Boolean> rm) {
			this.rm = rm;
		}

		private java.util.Optional<java.lang.Boolean> rootfs;

		public java.util.Optional<java.lang.Boolean> getRootfs() {
			return this.rootfs;
		}

		public void setRootfs(java.util.Optional<java.lang.Boolean> rootfs) {
			this.rootfs = rootfs;
		}

		private java.util.Optional<java.util.List<java.lang.String>> securityOpt;

		public java.util.Optional<java.util.List<java.lang.String>> getSecurityOpt() {
			return this.securityOpt;
		}

		public void setSecurityOpt(java.util.Optional<java.util.List<java.lang.String>> securityOpt) {
			this.securityOpt = securityOpt;
		}

		private java.util.Optional<java.lang.String> shmSize;

		public java.util.Optional<java.lang.String> getShmSize() {
			return this.shmSize;
		}

		public void setShmSize(java.util.Optional<java.lang.String> shmSize) {
			this.shmSize = shmSize;
		}

		private java.util.Optional<java.lang.String> stopSignal;

		public java.util.Optional<java.lang.String> getStopSignal() {
			return this.stopSignal;
		}

		public void setStopSignal(java.util.Optional<java.lang.String> stopSignal) {
			this.stopSignal = stopSignal;
		}

		private java.util.Optional<java.lang.Long> stopTimeout;

		public java.util.Optional<java.lang.Long> getStopTimeout() {
			return this.stopTimeout;
		}

		public void setStopTimeout(java.util.Optional<java.lang.Long> stopTimeout) {
			this.stopTimeout = stopTimeout;
		}

		private java.util.Optional<java.util.List<java.lang.String>> storageOpt;

		public java.util.Optional<java.util.List<java.lang.String>> getStorageOpt() {
			return this.storageOpt;
		}

		public void setStorageOpt(java.util.Optional<java.util.List<java.lang.String>> storageOpt) {
			this.storageOpt = storageOpt;
		}

		private java.util.Optional<java.lang.String> subuidname;

		public java.util.Optional<java.lang.String> getSubuidname() {
			return this.subuidname;
		}

		public void setSubuidname(java.util.Optional<java.lang.String> subuidname) {
			this.subuidname = subuidname;
		}

		private java.util.Optional<java.lang.String> subgidname;

		public java.util.Optional<java.lang.String> getSubgidname() {
			return this.subgidname;
		}

		public void setSubgidname(java.util.Optional<java.lang.String> subgidname) {
			this.subgidname = subgidname;
		}

		private java.util.Optional<java.util.List<java.lang.String>> sysctl;

		public java.util.Optional<java.util.List<java.lang.String>> getSysctl() {
			return this.sysctl;
		}

		public void setSysctl(java.util.Optional<java.util.List<java.lang.String>> sysctl) {
			this.sysctl = sysctl;
		}

		private java.util.Optional<java.lang.Boolean> systemd;

		public java.util.Optional<java.lang.Boolean> getSystemd() {
			return this.systemd;
		}

		public void setSystemd(java.util.Optional<java.lang.Boolean> systemd) {
			this.systemd = systemd;
		}

		private java.util.Optional<java.util.List<java.lang.String>> tmpfs;

		public java.util.Optional<java.util.List<java.lang.String>> getTmpfs() {
			return this.tmpfs;
		}

		public void setTmpfs(java.util.Optional<java.util.List<java.lang.String>> tmpfs) {
			this.tmpfs = tmpfs;
		}

		private java.util.Optional<java.lang.Boolean> tty;

		public java.util.Optional<java.lang.Boolean> getTty() {
			return this.tty;
		}

		public void setTty(java.util.Optional<java.lang.Boolean> tty) {
			this.tty = tty;
		}

		private java.util.Optional<java.util.List<java.lang.String>> uidmap;

		public java.util.Optional<java.util.List<java.lang.String>> getUidmap() {
			return this.uidmap;
		}

		public void setUidmap(java.util.Optional<java.util.List<java.lang.String>> uidmap) {
			this.uidmap = uidmap;
		}

		private java.util.Optional<java.util.List<java.lang.String>> ulimit;

		public java.util.Optional<java.util.List<java.lang.String>> getUlimit() {
			return this.ulimit;
		}

		public void setUlimit(java.util.Optional<java.util.List<java.lang.String>> ulimit) {
			this.ulimit = ulimit;
		}

		private java.util.Optional<java.lang.String> user;

		public java.util.Optional<java.lang.String> getUser() {
			return this.user;
		}

		public void setUser(java.util.Optional<java.lang.String> user) {
			this.user = user;
		}

		private java.util.Optional<java.lang.String> userns;

		public java.util.Optional<java.lang.String> getUserns() {
			return this.userns;
		}

		public void setUserns(java.util.Optional<java.lang.String> userns) {
			this.userns = userns;
		}

		private java.util.Optional<java.lang.String> uts;

		public java.util.Optional<java.lang.String> getUts() {
			return this.uts;
		}

		public void setUts(java.util.Optional<java.lang.String> uts) {
			this.uts = uts;
		}

		private java.util.Optional<java.util.List<java.lang.String>> mount;

		public java.util.Optional<java.util.List<java.lang.String>> getMount() {
			return this.mount;
		}

		public void setMount(java.util.Optional<java.util.List<java.lang.String>> mount) {
			this.mount = mount;
		}

		private java.util.Optional<java.util.List<java.lang.String>> volume;

		public java.util.Optional<java.util.List<java.lang.String>> getVolume() {
			return this.volume;
		}

		public void setVolume(java.util.Optional<java.util.List<java.lang.String>> volume) {
			this.volume = volume;
		}

		private java.util.Optional<java.util.List<java.lang.String>> volumesFrom;

		public java.util.Optional<java.util.List<java.lang.String>> getVolumesFrom() {
			return this.volumesFrom;
		}

		public void setVolumesFrom(java.util.Optional<java.util.List<java.lang.String>> volumesFrom) {
			this.volumesFrom = volumesFrom;
		}

		private java.util.Optional<java.lang.String> workDir;

		public java.util.Optional<java.lang.String> getWorkDir() {
			return this.workDir;
		}

		public void setWorkDir(java.util.Optional<java.lang.String> workDir) {
			this.workDir = workDir;
		}
	}

	public static class BuildOptions {
		private java.util.List<java.lang.String> addHosts;

		public java.util.List<java.lang.String> getAddHosts() {
			return this.addHosts;
		}

		public void setAddHosts(java.util.List<java.lang.String> addHosts) {
			this.addHosts = addHosts;
		}

		private java.lang.String cgroupParent;

		public java.lang.String getCgroupParent() {
			return this.cgroupParent;
		}

		public void setCgroupParent(java.lang.String cgroupParent) {
			this.cgroupParent = cgroupParent;
		}

		private java.lang.Long cpuPeriod;

		public java.lang.Long getCpuPeriod() {
			return this.cpuPeriod;
		}

		public void setCpuPeriod(java.lang.Long cpuPeriod) {
			this.cpuPeriod = cpuPeriod;
		}

		private java.lang.Long cpuQuota;

		public java.lang.Long getCpuQuota() {
			return this.cpuQuota;
		}

		public void setCpuQuota(java.lang.Long cpuQuota) {
			this.cpuQuota = cpuQuota;
		}

		private java.lang.Long cpuShares;

		public java.lang.Long getCpuShares() {
			return this.cpuShares;
		}

		public void setCpuShares(java.lang.Long cpuShares) {
			this.cpuShares = cpuShares;
		}

		private java.lang.String cpusetCpus;

		public java.lang.String getCpusetCpus() {
			return this.cpusetCpus;
		}

		public void setCpusetCpus(java.lang.String cpusetCpus) {
			this.cpusetCpus = cpusetCpus;
		}

		private java.lang.String cpusetMems;

		public java.lang.String getCpusetMems() {
			return this.cpusetMems;
		}

		public void setCpusetMems(java.lang.String cpusetMems) {
			this.cpusetMems = cpusetMems;
		}

		private java.lang.Long memory;

		public java.lang.Long getMemory() {
			return this.memory;
		}

		public void setMemory(java.lang.Long memory) {
			this.memory = memory;
		}

		private java.lang.Long memorySwap;

		public java.lang.Long getMemorySwap() {
			return this.memorySwap;
		}

		public void setMemorySwap(java.lang.Long memorySwap) {
			this.memorySwap = memorySwap;
		}

		private java.lang.String shmSize;

		public java.lang.String getShmSize() {
			return this.shmSize;
		}

		public void setShmSize(java.lang.String shmSize) {
			this.shmSize = shmSize;
		}

		private java.util.List<java.lang.String> ulimit;

		public java.util.List<java.lang.String> getUlimit() {
			return this.ulimit;
		}

		public void setUlimit(java.util.List<java.lang.String> ulimit) {
			this.ulimit = ulimit;
		}

		private java.util.List<java.lang.String> volume;

		public java.util.List<java.lang.String> getVolume() {
			return this.volume;
		}

		public void setVolume(java.util.List<java.lang.String> volume) {
			this.volume = volume;
		}
	}

	public static class BuildInfo {
		private java.util.List<java.lang.String> additionalTags;

		public java.util.List<java.lang.String> getAdditionalTags() {
			return this.additionalTags;
		}

		public void setAdditionalTags(java.util.List<java.lang.String> additionalTags) {
			this.additionalTags = additionalTags;
		}

		private java.util.List<java.lang.String> annotations;

		public java.util.List<java.lang.String> getAnnotations() {
			return this.annotations;
		}

		public void setAnnotations(java.util.List<java.lang.String> annotations) {
			this.annotations = annotations;
		}

		private java.util.Map<java.lang.String, java.lang.String> buildArgs;

		public java.util.Map<java.lang.String, java.lang.String> getBuildArgs() {
			return this.buildArgs;
		}

		public void setBuildArgs(java.util.Map<java.lang.String, java.lang.String> buildArgs) {
			this.buildArgs = buildArgs;
		}

		private BuildOptions buildOptions;

		public BuildOptions getBuildOptions() {
			return this.buildOptions;
		}

		public void setBuildOptions(BuildOptions buildOptions) {
			this.buildOptions = buildOptions;
		}

		private java.lang.String cniConfigDir;

		public java.lang.String getCniConfigDir() {
			return this.cniConfigDir;
		}

		public void setCniConfigDir(java.lang.String cniConfigDir) {
			this.cniConfigDir = cniConfigDir;
		}

		private java.lang.String cniPluginDir;

		public java.lang.String getCniPluginDir() {
			return this.cniPluginDir;
		}

		public void setCniPluginDir(java.lang.String cniPluginDir) {
			this.cniPluginDir = cniPluginDir;
		}

		private java.lang.String compression;

		public java.lang.String getCompression() {
			return this.compression;
		}

		public void setCompression(java.lang.String compression) {
			this.compression = compression;
		}

		private java.lang.String contextDir;

		public java.lang.String getContextDir() {
			return this.contextDir;
		}

		public void setContextDir(java.lang.String contextDir) {
			this.contextDir = contextDir;
		}

		private java.lang.String defaultsMountFilePath;

		public java.lang.String getDefaultsMountFilePath() {
			return this.defaultsMountFilePath;
		}

		public void setDefaultsMountFilePath(java.lang.String defaultsMountFilePath) {
			this.defaultsMountFilePath = defaultsMountFilePath;
		}

		private java.util.List<java.lang.String> dockerfiles;

		public java.util.List<java.lang.String> getDockerfiles() {
			return this.dockerfiles;
		}

		public void setDockerfiles(java.util.List<java.lang.String> dockerfiles) {
			this.dockerfiles = dockerfiles;
		}

		private java.lang.String err;

		public java.lang.String getErr() {
			return this.err;
		}

		public void setErr(java.lang.String err) {
			this.err = err;
		}

		private java.lang.Boolean forceRmIntermediateCtrs;

		public java.lang.Boolean getForceRmIntermediateCtrs() {
			return this.forceRmIntermediateCtrs;
		}

		public void setForceRmIntermediateCtrs(java.lang.Boolean forceRmIntermediateCtrs) {
			this.forceRmIntermediateCtrs = forceRmIntermediateCtrs;
		}

		private java.lang.String iidfile;

		public java.lang.String getIidfile() {
			return this.iidfile;
		}

		public void setIidfile(java.lang.String iidfile) {
			this.iidfile = iidfile;
		}

		private java.util.List<java.lang.String> label;

		public java.util.List<java.lang.String> getLabel() {
			return this.label;
		}

		public void setLabel(java.util.List<java.lang.String> label) {
			this.label = label;
		}

		private java.lang.Boolean layers;

		public java.lang.Boolean getLayers() {
			return this.layers;
		}

		public void setLayers(java.lang.Boolean layers) {
			this.layers = layers;
		}

		private java.lang.Boolean nocache;

		public java.lang.Boolean getNocache() {
			return this.nocache;
		}

		public void setNocache(java.lang.Boolean nocache) {
			this.nocache = nocache;
		}

		private java.lang.String out;

		public java.lang.String getOut() {
			return this.out;
		}

		public void setOut(java.lang.String out) {
			this.out = out;
		}

		private java.lang.String output;

		public java.lang.String getOutput() {
			return this.output;
		}

		public void setOutput(java.lang.String output) {
			this.output = output;
		}

		private java.lang.String outputFormat;

		public java.lang.String getOutputFormat() {
			return this.outputFormat;
		}

		public void setOutputFormat(java.lang.String outputFormat) {
			this.outputFormat = outputFormat;
		}

		private java.lang.String pullPolicy;

		public java.lang.String getPullPolicy() {
			return this.pullPolicy;
		}

		public void setPullPolicy(java.lang.String pullPolicy) {
			this.pullPolicy = pullPolicy;
		}

		private java.lang.Boolean quiet;

		public java.lang.Boolean getQuiet() {
			return this.quiet;
		}

		public void setQuiet(java.lang.Boolean quiet) {
			this.quiet = quiet;
		}

		private java.lang.Boolean remoteIntermediateCtrs;

		public java.lang.Boolean getRemoteIntermediateCtrs() {
			return this.remoteIntermediateCtrs;
		}

		public void setRemoteIntermediateCtrs(java.lang.Boolean remoteIntermediateCtrs) {
			this.remoteIntermediateCtrs = remoteIntermediateCtrs;
		}

		private java.lang.String reportWriter;

		public java.lang.String getReportWriter() {
			return this.reportWriter;
		}

		public void setReportWriter(java.lang.String reportWriter) {
			this.reportWriter = reportWriter;
		}

		private java.util.List<java.lang.String> runtimeArgs;

		public java.util.List<java.lang.String> getRuntimeArgs() {
			return this.runtimeArgs;
		}

		public void setRuntimeArgs(java.util.List<java.lang.String> runtimeArgs) {
			this.runtimeArgs = runtimeArgs;
		}

		private java.lang.String signaturePolicyPath;

		public java.lang.String getSignaturePolicyPath() {
			return this.signaturePolicyPath;
		}

		public void setSignaturePolicyPath(java.lang.String signaturePolicyPath) {
			this.signaturePolicyPath = signaturePolicyPath;
		}

		private java.lang.Boolean squash;

		public java.lang.Boolean getSquash() {
			return this.squash;
		}

		public void setSquash(java.lang.Boolean squash) {
			this.squash = squash;
		}
	}

	public static class MoreResponse {
		private java.util.List<java.lang.String> logs;

		public java.util.List<java.lang.String> getLogs() {
			return this.logs;
		}

		public void setLogs(java.util.List<java.lang.String> logs) {
			this.logs = logs;
		}

		private java.lang.String id;

		public java.lang.String getId() {
			return this.id;
		}

		public void setId(java.lang.String id) {
			this.id = id;
		}
	}

	public static class ListPodContainerInfo {
		private java.lang.String name;

		public java.lang.String getName() {
			return this.name;
		}

		public void setName(java.lang.String name) {
			this.name = name;
		}

		private java.lang.String id;

		public java.lang.String getId() {
			return this.id;
		}

		public void setId(java.lang.String id) {
			this.id = id;
		}

		private java.lang.String status;

		public java.lang.String getStatus() {
			return this.status;
		}

		public void setStatus(java.lang.String status) {
			this.status = status;
		}
	}

	public static class PodCreate {
		private java.lang.String name;

		public java.lang.String getName() {
			return this.name;
		}

		public void setName(java.lang.String name) {
			this.name = name;
		}

		private java.lang.String cgroupParent;

		public java.lang.String getCgroupParent() {
			return this.cgroupParent;
		}

		public void setCgroupParent(java.lang.String cgroupParent) {
			this.cgroupParent = cgroupParent;
		}

		private java.util.Map<java.lang.String, java.lang.String> labels;

		public java.util.Map<java.lang.String, java.lang.String> getLabels() {
			return this.labels;
		}

		public void setLabels(java.util.Map<java.lang.String, java.lang.String> labels) {
			this.labels = labels;
		}

		private java.util.List<java.lang.String> share;

		public java.util.List<java.lang.String> getShare() {
			return this.share;
		}

		public void setShare(java.util.List<java.lang.String> share) {
			this.share = share;
		}

		private java.lang.Boolean infra;

		public java.lang.Boolean getInfra() {
			return this.infra;
		}

		public void setInfra(java.lang.Boolean infra) {
			this.infra = infra;
		}

		private java.lang.String infraCommand;

		public java.lang.String getInfraCommand() {
			return this.infraCommand;
		}

		public void setInfraCommand(java.lang.String infraCommand) {
			this.infraCommand = infraCommand;
		}

		private java.lang.String infraImage;

		public java.lang.String getInfraImage() {
			return this.infraImage;
		}

		public void setInfraImage(java.lang.String infraImage) {
			this.infraImage = infraImage;
		}

		private java.util.List<java.lang.String> publish;

		public java.util.List<java.lang.String> getPublish() {
			return this.publish;
		}

		public void setPublish(java.util.List<java.lang.String> publish) {
			this.publish = publish;
		}
	}

	public static class ListPodData {
		private java.lang.String id;

		public java.lang.String getId() {
			return this.id;
		}

		public void setId(java.lang.String id) {
			this.id = id;
		}

		private java.lang.String name;

		public java.lang.String getName() {
			return this.name;
		}

		public void setName(java.lang.String name) {
			this.name = name;
		}

		private java.lang.String createdat;

		public java.lang.String getCreatedat() {
			return this.createdat;
		}

		public void setCreatedat(java.lang.String createdat) {
			this.createdat = createdat;
		}

		private java.lang.String cgroup;

		public java.lang.String getCgroup() {
			return this.cgroup;
		}

		public void setCgroup(java.lang.String cgroup) {
			this.cgroup = cgroup;
		}

		private java.lang.String status;

		public java.lang.String getStatus() {
			return this.status;
		}

		public void setStatus(java.lang.String status) {
			this.status = status;
		}

		private java.util.Map<java.lang.String, java.lang.String> labels;

		public java.util.Map<java.lang.String, java.lang.String> getLabels() {
			return this.labels;
		}

		public void setLabels(java.util.Map<java.lang.String, java.lang.String> labels) {
			this.labels = labels;
		}

		private java.lang.String numberofcontainers;

		public java.lang.String getNumberofcontainers() {
			return this.numberofcontainers;
		}

		public void setNumberofcontainers(java.lang.String numberofcontainers) {
			this.numberofcontainers = numberofcontainers;
		}

		private java.util.List<ListPodContainerInfo> containersinfo;

		public java.util.List<ListPodContainerInfo> getContainersinfo() {
			return this.containersinfo;
		}

		public void setContainersinfo(java.util.List<ListPodContainerInfo> containersinfo) {
			this.containersinfo = containersinfo;
		}
	}

	public static class PodContainerErrorData {
		private java.lang.String containerid;

		public java.lang.String getContainerid() {
			return this.containerid;
		}

		public void setContainerid(java.lang.String containerid) {
			this.containerid = containerid;
		}

		private java.lang.String reason;

		public java.lang.String getReason() {
			return this.reason;
		}

		public void setReason(java.lang.String reason) {
			this.reason = reason;
		}
	}

	public static class Runlabel {
		private java.lang.String image;

		public java.lang.String getImage() {
			return this.image;
		}

		public void setImage(java.lang.String image) {
			this.image = image;
		}

		private java.lang.String authfile;

		public java.lang.String getAuthfile() {
			return this.authfile;
		}

		public void setAuthfile(java.lang.String authfile) {
			this.authfile = authfile;
		}

		private java.lang.String certDir;

		public java.lang.String getCertDir() {
			return this.certDir;
		}

		public void setCertDir(java.lang.String certDir) {
			this.certDir = certDir;
		}

		private java.lang.String creds;

		public java.lang.String getCreds() {
			return this.creds;
		}

		public void setCreds(java.lang.String creds) {
			this.creds = creds;
		}

		private java.lang.Boolean display;

		public java.lang.Boolean getDisplay() {
			return this.display;
		}

		public void setDisplay(java.lang.Boolean display) {
			this.display = display;
		}

		private java.lang.String name;

		public java.lang.String getName() {
			return this.name;
		}

		public void setName(java.lang.String name) {
			this.name = name;
		}

		private java.lang.Boolean pull;

		public java.lang.Boolean getPull() {
			return this.pull;
		}

		public void setPull(java.lang.Boolean pull) {
			this.pull = pull;
		}

		private java.lang.String signaturePolicyPath;

		public java.lang.String getSignaturePolicyPath() {
			return this.signaturePolicyPath;
		}

		public void setSignaturePolicyPath(java.lang.String signaturePolicyPath) {
			this.signaturePolicyPath = signaturePolicyPath;
		}

		private java.util.Optional<java.lang.Boolean> tlsVerify;

		public java.util.Optional<java.lang.Boolean> getTlsVerify() {
			return this.tlsVerify;
		}

		public void setTlsVerify(java.util.Optional<java.lang.Boolean> tlsVerify) {
			this.tlsVerify = tlsVerify;
		}

		private java.lang.String label;

		public java.lang.String getLabel() {
			return this.label;
		}

		public void setLabel(java.lang.String label) {
			this.label = label;
		}

		private java.util.List<java.lang.String> extraArgs;

		public java.util.List<java.lang.String> getExtraArgs() {
			return this.extraArgs;
		}

		public void setExtraArgs(java.util.List<java.lang.String> extraArgs) {
			this.extraArgs = extraArgs;
		}

		private java.util.Map<java.lang.String, java.lang.String> opts;

		public java.util.Map<java.lang.String, java.lang.String> getOpts() {
			return this.opts;
		}

		public void setOpts(java.util.Map<java.lang.String, java.lang.String> opts) {
			this.opts = opts;
		}
	}

	public static class Event {
		private java.lang.String id;

		public java.lang.String getId() {
			return this.id;
		}

		public void setId(java.lang.String id) {
			this.id = id;
		}

		private java.lang.String image;

		public java.lang.String getImage() {
			return this.image;
		}

		public void setImage(java.lang.String image) {
			this.image = image;
		}

		private java.lang.String name;

		public java.lang.String getName() {
			return this.name;
		}

		public void setName(java.lang.String name) {
			this.name = name;
		}

		private java.lang.String status;

		public java.lang.String getStatus() {
			return this.status;
		}

		public void setStatus(java.lang.String status) {
			this.status = status;
		}

		private java.lang.String time;

		public java.lang.String getTime() {
			return this.time;
		}

		public void setTime(java.lang.String time) {
			this.time = time;
		}

		private java.lang.String type;

		public java.lang.String getType() {
			return this.type;
		}

		public void setType(java.lang.String type) {
			this.type = type;
		}
	}

	public static class DiffInfo {
		private java.lang.String path;

		public java.lang.String getPath() {
			return this.path;
		}

		public void setPath(java.lang.String path) {
			this.path = path;
		}

		private java.lang.String changeType;

		public java.lang.String getChangeType() {
			return this.changeType;
		}

		public void setChangeType(java.lang.String changeType) {
			this.changeType = changeType;
		}
	}

	public static class GetVersion_Out {
		private java.lang.String version;

		public java.lang.String getVersion() {
			return this.version;
		}

		public void setVersion(java.lang.String version) {
			this.version = version;
		}

		private java.lang.String go_version;

		public java.lang.String getGo_version() {
			return this.go_version;
		}

		public void setGo_version(java.lang.String go_version) {
			this.go_version = go_version;
		}

		private java.lang.String git_commit;

		public java.lang.String getGit_commit() {
			return this.git_commit;
		}

		public void setGit_commit(java.lang.String git_commit) {
			this.git_commit = git_commit;
		}

		private java.lang.String built;

		public java.lang.String getBuilt() {
			return this.built;
		}

		public void setBuilt(java.lang.String built) {
			this.built = built;
		}

		private java.lang.String os_arch;

		public java.lang.String getOs_arch() {
			return this.os_arch;
		}

		public void setOs_arch(java.lang.String os_arch) {
			this.os_arch = os_arch;
		}

		private java.lang.Long remote_api_version;

		public java.lang.Long getRemote_api_version() {
			return this.remote_api_version;
		}

		public void setRemote_api_version(java.lang.Long remote_api_version) {
			this.remote_api_version = remote_api_version;
		}
	}

	public static class GetPodStats_Out {
		private java.lang.String pod;

		public java.lang.String getPod() {
			return this.pod;
		}

		public void setPod(java.lang.String pod) {
			this.pod = pod;
		}

		private java.util.List<ContainerStats> containers;

		public java.util.List<ContainerStats> getContainers() {
			return this.containers;
		}

		public void setContainers(java.util.List<ContainerStats> containers) {
			this.containers = containers;
		}
	}

	public static class VolumesPrune_Out {
		private java.util.List<java.lang.String> prunedNames;

		public java.util.List<java.lang.String> getPrunedNames() {
			return this.prunedNames;
		}

		public void setPrunedNames(java.util.List<java.lang.String> prunedNames) {
			this.prunedNames = prunedNames;
		}

		private java.util.List<java.lang.String> prunedErrors;

		public java.util.List<java.lang.String> getPrunedErrors() {
			return this.prunedErrors;
		}

		public void setPrunedErrors(java.util.List<java.lang.String> prunedErrors) {
			this.prunedErrors = prunedErrors;
		}
	}

	public static class ImageNotFoundException extends java.lang.RuntimeException {
		private static final long serialVersionUID = 1L;

		public static class Parameters {
			private java.lang.String id;

			public java.lang.String getId() {
				return this.id;
			}

			public void setId(java.lang.String id) {
				this.id = id;
			}

			private java.lang.String reason;

			public java.lang.String getReason() {
				return this.reason;
			}

			public void setReason(java.lang.String reason) {
				this.reason = reason;
			}
		}

		private final Parameters parameters;

		public ImageNotFoundException(final Parameters parameters) {
			this.parameters = parameters;
		}

		public Parameters getParameters() {
			return this.parameters;
		}
	}

	public static class ContainerNotFoundException extends java.lang.RuntimeException {
		private static final long serialVersionUID = 1L;

		public static class Parameters {
			private java.lang.String id;

			public java.lang.String getId() {
				return this.id;
			}

			public void setId(java.lang.String id) {
				this.id = id;
			}

			private java.lang.String reason;

			public java.lang.String getReason() {
				return this.reason;
			}

			public void setReason(java.lang.String reason) {
				this.reason = reason;
			}
		}

		private final Parameters parameters;

		public ContainerNotFoundException(final Parameters parameters) {
			this.parameters = parameters;
		}

		public Parameters getParameters() {
			return this.parameters;
		}
	}

	public static class NoContainerRunningException extends java.lang.RuntimeException {
		private static final long serialVersionUID = 1L;

		public static class Parameters {
		}

		private final Parameters parameters;

		public NoContainerRunningException(final Parameters parameters) {
			this.parameters = parameters;
		}

		public Parameters getParameters() {
			return this.parameters;
		}
	}

	public static class PodNotFoundException extends java.lang.RuntimeException {
		private static final long serialVersionUID = 1L;

		public static class Parameters {
			private java.lang.String name;

			public java.lang.String getName() {
				return this.name;
			}

			public void setName(java.lang.String name) {
				this.name = name;
			}

			private java.lang.String reason;

			public java.lang.String getReason() {
				return this.reason;
			}

			public void setReason(java.lang.String reason) {
				this.reason = reason;
			}
		}

		private final Parameters parameters;

		public PodNotFoundException(final Parameters parameters) {
			this.parameters = parameters;
		}

		public Parameters getParameters() {
			return this.parameters;
		}
	}

	public static class VolumeNotFoundException extends java.lang.RuntimeException {
		private static final long serialVersionUID = 1L;

		public static class Parameters {
			private java.lang.String id;

			public java.lang.String getId() {
				return this.id;
			}

			public void setId(java.lang.String id) {
				this.id = id;
			}

			private java.lang.String reason;

			public java.lang.String getReason() {
				return this.reason;
			}

			public void setReason(java.lang.String reason) {
				this.reason = reason;
			}
		}

		private final Parameters parameters;

		public VolumeNotFoundException(final Parameters parameters) {
			this.parameters = parameters;
		}

		public Parameters getParameters() {
			return this.parameters;
		}
	}

	public static class PodContainerErrorException extends java.lang.RuntimeException {
		private static final long serialVersionUID = 1L;

		public static class Parameters {
			private java.lang.String podname;

			public java.lang.String getPodname() {
				return this.podname;
			}

			public void setPodname(java.lang.String podname) {
				this.podname = podname;
			}

			private java.util.List<PodContainerErrorData> errors;

			public java.util.List<PodContainerErrorData> getErrors() {
				return this.errors;
			}

			public void setErrors(java.util.List<PodContainerErrorData> errors) {
				this.errors = errors;
			}
		}

		private final Parameters parameters;

		public PodContainerErrorException(final Parameters parameters) {
			this.parameters = parameters;
		}

		public Parameters getParameters() {
			return this.parameters;
		}
	}

	public static class NoContainersInPodException extends java.lang.RuntimeException {
		private static final long serialVersionUID = 1L;

		public static class Parameters {
			private java.lang.String name;

			public java.lang.String getName() {
				return this.name;
			}

			public void setName(java.lang.String name) {
				this.name = name;
			}
		}

		private final Parameters parameters;

		public NoContainersInPodException(final Parameters parameters) {
			this.parameters = parameters;
		}

		public Parameters getParameters() {
			return this.parameters;
		}
	}

	public static class InvalidStateException extends java.lang.RuntimeException {
		private static final long serialVersionUID = 1L;

		public static class Parameters {
			private java.lang.String id;

			public java.lang.String getId() {
				return this.id;
			}

			public void setId(java.lang.String id) {
				this.id = id;
			}

			private java.lang.String reason;

			public java.lang.String getReason() {
				return this.reason;
			}

			public void setReason(java.lang.String reason) {
				this.reason = reason;
			}
		}

		private final Parameters parameters;

		public InvalidStateException(final Parameters parameters) {
			this.parameters = parameters;
		}

		public Parameters getParameters() {
			return this.parameters;
		}
	}

	public static class ErrorOccurredException extends java.lang.RuntimeException {
		private static final long serialVersionUID = 1L;

		public static class Parameters {
			private java.lang.String reason;

			public java.lang.String getReason() {
				return this.reason;
			}

			public void setReason(java.lang.String reason) {
				this.reason = reason;
			}
		}

		private final Parameters parameters;

		public ErrorOccurredException(final Parameters parameters) {
			this.parameters = parameters;
		}

		public Parameters getParameters() {
			return this.parameters;
		}
	}

	public static class RuntimeErrorException extends java.lang.RuntimeException {
		private static final long serialVersionUID = 1L;

		public static class Parameters {
			private java.lang.String reason;

			public java.lang.String getReason() {
				return this.reason;
			}

			public void setReason(java.lang.String reason) {
				this.reason = reason;
			}
		}

		private final Parameters parameters;

		public RuntimeErrorException(final Parameters parameters) {
			this.parameters = parameters;
		}

		public Parameters getParameters() {
			return this.parameters;
		}
	}

	public static class WantsMoreRequiredException extends java.lang.RuntimeException {
		private static final long serialVersionUID = 1L;

		public static class Parameters {
			private java.lang.String reason;

			public java.lang.String getReason() {
				return this.reason;
			}

			public void setReason(java.lang.String reason) {
				this.reason = reason;
			}
		}

		private final Parameters parameters;

		public WantsMoreRequiredException(final Parameters parameters) {
			this.parameters = parameters;
		}

		public Parameters getParameters() {
			return this.parameters;
		}
	}

	public interface Async {
		public java.util.concurrent.CompletableFuture<GetVersion_Out> getVersion();

		public java.util.concurrent.CompletableFuture<PodmanInfo> getInfo();

		public java.util.concurrent.CompletableFuture<java.util.List<Container>> listContainers();

		public java.util.concurrent.CompletableFuture<java.util.List<PsContainer>> ps(final PsOpts opts);

		public java.util.concurrent.CompletableFuture<java.util.List<Container>> getContainersByStatus(
				final java.util.List<java.lang.String> status);

		public java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> top(
				final java.lang.String nameOrID, final java.util.List<java.lang.String> descriptors);

		public java.util.concurrent.CompletableFuture<Container> getContainer(final java.lang.String id);

		public java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> getContainersByContext(
				final java.lang.Boolean all, final java.lang.Boolean latest,
				final java.util.List<java.lang.String> args);

		public java.util.concurrent.CompletableFuture<java.lang.String> createContainer(final Create create);

		public java.util.concurrent.CompletableFuture<java.lang.String> inspectContainer(final java.lang.String name);

		public java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> listContainerProcesses(
				final java.lang.String name, final java.util.List<java.lang.String> opts);

		public java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> getContainerLogs(
				final java.lang.String name);

		public java.util.concurrent.CompletableFuture<LogLine> getContainersLogs(
				final java.util.List<java.lang.String> names, final java.lang.Boolean follow,
				final java.lang.Boolean latest, final java.lang.String since, final java.lang.Long tail,
				final java.lang.Boolean timestamps);

		public java.util.concurrent.CompletableFuture<ContainerChanges> listContainerChanges(
				final java.lang.String name);

		public java.util.concurrent.CompletableFuture<java.lang.String> exportContainer(final java.lang.String name,
				final java.lang.String path);

		public java.util.concurrent.CompletableFuture<ContainerStats> getContainerStats(final java.lang.String name);

		public java.util.concurrent.CompletableFuture<ContainerStats> getContainerStatsWithHistory(
				final ContainerStats previousStats);

		public java.util.concurrent.CompletableFuture<java.lang.String> startContainer(final java.lang.String name);

		public java.util.concurrent.CompletableFuture<java.lang.String> stopContainer(final java.lang.String name,
				final java.lang.Long timeout);

		public java.util.concurrent.CompletableFuture<java.lang.String> initContainer(final java.lang.String name);

		public java.util.concurrent.CompletableFuture<java.lang.String> restartContainer(final java.lang.String name,
				final java.lang.Long timeout);

		public java.util.concurrent.CompletableFuture<java.lang.String> killContainer(final java.lang.String name,
				final java.lang.Long signal);

		public java.util.concurrent.CompletableFuture<java.lang.String> pauseContainer(final java.lang.String name);

		public java.util.concurrent.CompletableFuture<java.lang.String> unpauseContainer(final java.lang.String name);

		public java.util.concurrent.CompletableFuture<java.lang.Void> attach(final java.lang.String name,
				final java.lang.String detachKeys, final java.lang.Boolean start);

		public java.util.concurrent.CompletableFuture<java.lang.Void> attachControl(final java.lang.String name);

		public java.util.concurrent.CompletableFuture<Sockets> getAttachSockets(final java.lang.String name);

		public java.util.concurrent.CompletableFuture<java.lang.Long> waitContainer(final java.lang.String name,
				final java.lang.Long interval);

		public java.util.concurrent.CompletableFuture<java.lang.String> removeContainer(final java.lang.String name,
				final java.lang.Boolean force, final java.lang.Boolean removeVolumes);

		public java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> deleteStoppedContainers();

		public java.util.concurrent.CompletableFuture<java.util.List<Image>> listImages();

		public java.util.concurrent.CompletableFuture<Image> getImage(final java.lang.String id);

		public java.util.concurrent.CompletableFuture<MoreResponse> buildImage(final BuildInfo build);

		public java.util.concurrent.CompletableFuture<java.lang.String> inspectImage(final java.lang.String name);

		public java.util.concurrent.CompletableFuture<java.util.List<ImageHistory>> historyImage(
				final java.lang.String name);

		public java.util.concurrent.CompletableFuture<MoreResponse> pushImage(final java.lang.String name,
				final java.lang.String tag, final java.util.Optional<java.lang.Boolean> tlsverify,
				final java.lang.String signaturePolicy, final java.lang.String creds, final java.lang.String certDir,
				final java.lang.Boolean compress, final java.lang.String format,
				final java.lang.Boolean removeSignatures, final java.lang.String signBy);

		public java.util.concurrent.CompletableFuture<java.lang.String> tagImage(final java.lang.String name,
				final java.lang.String tagged);

		public java.util.concurrent.CompletableFuture<java.lang.String> removeImage(final java.lang.String name,
				final java.lang.Boolean force);

		public java.util.concurrent.CompletableFuture<java.util.List<ImageSearchResult>> searchImages(
				final java.lang.String query, final java.util.Optional<java.lang.Long> limit,
				final java.util.Optional<java.lang.Boolean> tlsVerify, final ImageSearchFilter filter);

		public java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> deleteUnusedImages();

		public java.util.concurrent.CompletableFuture<java.lang.String> commit(final java.lang.String name,
				final java.lang.String image_name, final java.util.List<java.lang.String> changes,
				final java.lang.String author, final java.lang.String message, final java.lang.Boolean pause,
				final java.lang.String manifestType);

		public java.util.concurrent.CompletableFuture<java.lang.String> importImage(final java.lang.String source,
				final java.lang.String reference, final java.lang.String message,
				final java.util.List<java.lang.String> changes, final java.lang.Boolean delete);

		public java.util.concurrent.CompletableFuture<java.lang.String> exportImage(final java.lang.String name,
				final java.lang.String destination, final java.lang.Boolean compress,
				final java.util.List<java.lang.String> tags);

		public java.util.concurrent.CompletableFuture<MoreResponse> pullImage(final java.lang.String name,
				final java.lang.String certDir, final java.lang.String creds, final java.lang.String signaturePolicy,
				final java.util.Optional<java.lang.Boolean> tlsVerify);

		public java.util.concurrent.CompletableFuture<java.lang.String> createPod(final PodCreate create);

		public java.util.concurrent.CompletableFuture<java.util.List<ListPodData>> listPods();

		public java.util.concurrent.CompletableFuture<ListPodData> getPod(final java.lang.String name);

		public java.util.concurrent.CompletableFuture<java.lang.String> inspectPod(final java.lang.String name);

		public java.util.concurrent.CompletableFuture<java.lang.String> startPod(final java.lang.String name);

		public java.util.concurrent.CompletableFuture<java.lang.String> stopPod(final java.lang.String name,
				final java.lang.Long timeout);

		public java.util.concurrent.CompletableFuture<java.lang.String> restartPod(final java.lang.String name);

		public java.util.concurrent.CompletableFuture<java.lang.String> killPod(final java.lang.String name,
				final java.lang.Long signal);

		public java.util.concurrent.CompletableFuture<java.lang.String> pausePod(final java.lang.String name);

		public java.util.concurrent.CompletableFuture<java.lang.String> unpausePod(final java.lang.String name);

		public java.util.concurrent.CompletableFuture<java.lang.String> removePod(final java.lang.String name,
				final java.lang.Boolean force);

		public java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> topPod(
				final java.lang.String pod, final java.lang.Boolean latest,
				final java.util.List<java.lang.String> descriptors);

		public java.util.concurrent.CompletableFuture<GetPodStats_Out> getPodStats(final java.lang.String name);

		public java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> getPodsByStatus(
				final java.util.List<java.lang.String> statuses);

		public java.util.concurrent.CompletableFuture<java.lang.Long> imageExists(final java.lang.String name);

		public java.util.concurrent.CompletableFuture<java.lang.Long> containerExists(final java.lang.String name);

		public java.util.concurrent.CompletableFuture<java.lang.String> containerCheckpoint(final java.lang.String name,
				final java.lang.Boolean keep, final java.lang.Boolean leaveRunning,
				final java.lang.Boolean tcpEstablished);

		public java.util.concurrent.CompletableFuture<java.lang.String> containerRestore(final java.lang.String name,
				final java.lang.Boolean keep, final java.lang.Boolean tcpEstablished);

		public java.util.concurrent.CompletableFuture<java.lang.Void> containerRunlabel(final Runlabel runlabel);

		public java.util.concurrent.CompletableFuture<java.util.Map<java.lang.String, java.lang.String>> listContainerMounts();

		public java.util.concurrent.CompletableFuture<java.lang.String> mountContainer(final java.lang.String name);

		public java.util.concurrent.CompletableFuture<java.lang.Void> unmountContainer(final java.lang.String name,
				final java.lang.Boolean force);

		public java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> imagesPrune(
				final java.lang.Boolean all);

		public java.util.concurrent.CompletableFuture<KubePodService> generateKube(final java.lang.String name,
				final java.lang.Boolean service);

		public java.util.concurrent.CompletableFuture<java.lang.String> containerConfig(final java.lang.String name);

		public java.util.concurrent.CompletableFuture<java.lang.String> containerArtifacts(final java.lang.String name,
				final java.lang.String artifactName);

		public java.util.concurrent.CompletableFuture<java.lang.String> containerInspectData(
				final java.lang.String name, final java.lang.Boolean size);

		public java.util.concurrent.CompletableFuture<java.lang.String> containerStateData(final java.lang.String name);

		public java.util.concurrent.CompletableFuture<java.lang.String> podStateData(final java.lang.String name);

		public java.util.concurrent.CompletableFuture<java.lang.String> createFromCC(
				final java.util.List<java.lang.String> in);

		public java.util.concurrent.CompletableFuture<java.lang.String> spec(final java.lang.String name);

		public java.util.concurrent.CompletableFuture<java.lang.String> sendFile(final java.lang.String type,
				final java.lang.Long length);

		public java.util.concurrent.CompletableFuture<java.lang.Long> receiveFile(final java.lang.String path,
				final java.lang.Boolean delete);

		public java.util.concurrent.CompletableFuture<java.lang.String> volumeCreate(final VolumeCreateOpts options);

		public java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> volumeRemove(
				final VolumeRemoveOpts options);

		public java.util.concurrent.CompletableFuture<java.util.List<Volume>> getVolumes(
				final java.util.List<java.lang.String> args, final java.lang.Boolean all);

		public java.util.concurrent.CompletableFuture<VolumesPrune_Out> volumesPrune();

		public java.util.concurrent.CompletableFuture<MoreResponse> imageSave(final ImageSaveOptions options);

		public java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> getPodsByContext(
				final java.lang.Boolean all, final java.lang.Boolean latest,
				final java.util.List<java.lang.String> args);

		public java.util.concurrent.CompletableFuture<MoreResponse> loadImage(final java.lang.String name,
				final java.lang.String inputFile, final java.lang.Boolean quiet, final java.lang.Boolean deleteFile);

		public java.util.concurrent.CompletableFuture<Event> getEvents(final java.util.List<java.lang.String> filter,
				final java.lang.String since, final java.lang.String until);

		public java.util.concurrent.CompletableFuture<java.util.List<DiffInfo>> diff(final java.lang.String name);

		public java.util.concurrent.CompletableFuture<java.lang.String> getLayersMapWithImageInfo();

		public java.util.concurrent.CompletableFuture<java.lang.String> buildImageHierarchyMap(
				final java.lang.String name);

		public java.util.concurrent.CompletableFuture<java.lang.String> generateSystemd(final java.lang.String name,
				final java.lang.String restart, final java.lang.Long timeout, final java.lang.Boolean useName);
	}

	public Async async();

	public interface Sync {
		public GetVersion_Out getVersion();

		public PodmanInfo getInfo();

		public java.util.List<Container> listContainers();

		public java.util.List<PsContainer> ps(final PsOpts opts);

		public java.util.List<Container> getContainersByStatus(final java.util.List<java.lang.String> status);

		public java.util.List<java.lang.String> top(final java.lang.String nameOrID,
				final java.util.List<java.lang.String> descriptors);

		public Container getContainer(final java.lang.String id);

		public java.util.List<java.lang.String> getContainersByContext(final java.lang.Boolean all,
				final java.lang.Boolean latest, final java.util.List<java.lang.String> args);

		public java.lang.String createContainer(final Create create);

		public java.lang.String inspectContainer(final java.lang.String name);

		public java.util.List<java.lang.String> listContainerProcesses(final java.lang.String name,
				final java.util.List<java.lang.String> opts);

		public java.util.List<java.lang.String> getContainerLogs(final java.lang.String name);

		public LogLine getContainersLogs(final java.util.List<java.lang.String> names, final java.lang.Boolean follow,
				final java.lang.Boolean latest, final java.lang.String since, final java.lang.Long tail,
				final java.lang.Boolean timestamps);

		public ContainerChanges listContainerChanges(final java.lang.String name);

		public java.lang.String exportContainer(final java.lang.String name, final java.lang.String path);

		public ContainerStats getContainerStats(final java.lang.String name);

		public ContainerStats getContainerStatsWithHistory(final ContainerStats previousStats);

		public java.lang.String startContainer(final java.lang.String name);

		public java.lang.String stopContainer(final java.lang.String name, final java.lang.Long timeout);

		public java.lang.String initContainer(final java.lang.String name);

		public java.lang.String restartContainer(final java.lang.String name, final java.lang.Long timeout);

		public java.lang.String killContainer(final java.lang.String name, final java.lang.Long signal);

		public java.lang.String pauseContainer(final java.lang.String name);

		public java.lang.String unpauseContainer(final java.lang.String name);

		public void attach(final java.lang.String name, final java.lang.String detachKeys,
				final java.lang.Boolean start);

		public void attachControl(final java.lang.String name);

		public Sockets getAttachSockets(final java.lang.String name);

		public java.lang.Long waitContainer(final java.lang.String name, final java.lang.Long interval);

		public java.lang.String removeContainer(final java.lang.String name, final java.lang.Boolean force,
				final java.lang.Boolean removeVolumes);

		public java.util.List<java.lang.String> deleteStoppedContainers();

		public java.util.List<Image> listImages();

		public Image getImage(final java.lang.String id);

		public MoreResponse buildImage(final BuildInfo build);

		public java.lang.String inspectImage(final java.lang.String name);

		public java.util.List<ImageHistory> historyImage(final java.lang.String name);

		public MoreResponse pushImage(final java.lang.String name, final java.lang.String tag,
				final java.util.Optional<java.lang.Boolean> tlsverify, final java.lang.String signaturePolicy,
				final java.lang.String creds, final java.lang.String certDir, final java.lang.Boolean compress,
				final java.lang.String format, final java.lang.Boolean removeSignatures, final java.lang.String signBy);

		public java.lang.String tagImage(final java.lang.String name, final java.lang.String tagged);

		public java.lang.String removeImage(final java.lang.String name, final java.lang.Boolean force);

		public java.util.List<ImageSearchResult> searchImages(final java.lang.String query,
				final java.util.Optional<java.lang.Long> limit, final java.util.Optional<java.lang.Boolean> tlsVerify,
				final ImageSearchFilter filter);

		public java.util.List<java.lang.String> deleteUnusedImages();

		public java.lang.String commit(final java.lang.String name, final java.lang.String image_name,
				final java.util.List<java.lang.String> changes, final java.lang.String author,
				final java.lang.String message, final java.lang.Boolean pause, final java.lang.String manifestType);

		public java.lang.String importImage(final java.lang.String source, final java.lang.String reference,
				final java.lang.String message, final java.util.List<java.lang.String> changes,
				final java.lang.Boolean delete);

		public java.lang.String exportImage(final java.lang.String name, final java.lang.String destination,
				final java.lang.Boolean compress, final java.util.List<java.lang.String> tags);

		public MoreResponse pullImage(final java.lang.String name, final java.lang.String certDir,
				final java.lang.String creds, final java.lang.String signaturePolicy,
				final java.util.Optional<java.lang.Boolean> tlsVerify);

		public java.lang.String createPod(final PodCreate create);

		public java.util.List<ListPodData> listPods();

		public ListPodData getPod(final java.lang.String name);

		public java.lang.String inspectPod(final java.lang.String name);

		public java.lang.String startPod(final java.lang.String name);

		public java.lang.String stopPod(final java.lang.String name, final java.lang.Long timeout);

		public java.lang.String restartPod(final java.lang.String name);

		public java.lang.String killPod(final java.lang.String name, final java.lang.Long signal);

		public java.lang.String pausePod(final java.lang.String name);

		public java.lang.String unpausePod(final java.lang.String name);

		public java.lang.String removePod(final java.lang.String name, final java.lang.Boolean force);

		public java.util.List<java.lang.String> topPod(final java.lang.String pod, final java.lang.Boolean latest,
				final java.util.List<java.lang.String> descriptors);

		public GetPodStats_Out getPodStats(final java.lang.String name);

		public java.util.List<java.lang.String> getPodsByStatus(final java.util.List<java.lang.String> statuses);

		public java.lang.Long imageExists(final java.lang.String name);

		public java.lang.Long containerExists(final java.lang.String name);

		public java.lang.String containerCheckpoint(final java.lang.String name, final java.lang.Boolean keep,
				final java.lang.Boolean leaveRunning, final java.lang.Boolean tcpEstablished);

		public java.lang.String containerRestore(final java.lang.String name, final java.lang.Boolean keep,
				final java.lang.Boolean tcpEstablished);

		public void containerRunlabel(final Runlabel runlabel);

		public java.util.Map<java.lang.String, java.lang.String> listContainerMounts();

		public java.lang.String mountContainer(final java.lang.String name);

		public void unmountContainer(final java.lang.String name, final java.lang.Boolean force);

		public java.util.List<java.lang.String> imagesPrune(final java.lang.Boolean all);

		public KubePodService generateKube(final java.lang.String name, final java.lang.Boolean service);

		public java.lang.String containerConfig(final java.lang.String name);

		public java.lang.String containerArtifacts(final java.lang.String name, final java.lang.String artifactName);

		public java.lang.String containerInspectData(final java.lang.String name, final java.lang.Boolean size);

		public java.lang.String containerStateData(final java.lang.String name);

		public java.lang.String podStateData(final java.lang.String name);

		public java.lang.String createFromCC(final java.util.List<java.lang.String> in);

		public java.lang.String spec(final java.lang.String name);

		public java.lang.String sendFile(final java.lang.String type, final java.lang.Long length);

		public java.lang.Long receiveFile(final java.lang.String path, final java.lang.Boolean delete);

		public java.lang.String volumeCreate(final VolumeCreateOpts options);

		public java.util.List<java.lang.String> volumeRemove(final VolumeRemoveOpts options);

		public java.util.List<Volume> getVolumes(final java.util.List<java.lang.String> args,
				final java.lang.Boolean all);

		public VolumesPrune_Out volumesPrune();

		public MoreResponse imageSave(final ImageSaveOptions options);

		public java.util.List<java.lang.String> getPodsByContext(final java.lang.Boolean all,
				final java.lang.Boolean latest, final java.util.List<java.lang.String> args);

		public MoreResponse loadImage(final java.lang.String name, final java.lang.String inputFile,
				final java.lang.Boolean quiet, final java.lang.Boolean deleteFile);

		public Event getEvents(final java.util.List<java.lang.String> filter, final java.lang.String since,
				final java.lang.String until);

		public java.util.List<DiffInfo> diff(final java.lang.String name);

		public java.lang.String getLayersMapWithImageInfo();

		public java.lang.String buildImageHierarchyMap(final java.lang.String name);

		public java.lang.String generateSystemd(final java.lang.String name, final java.lang.String restart,
				final java.lang.Long timeout, final java.lang.Boolean useName);
	}

	public default Sync sync() {
		return new Sync() {
			public GetVersion_Out getVersion() {
				return de.dentrassi.varlink.spi.Syncer.await(async().getVersion());
			}

			public PodmanInfo getInfo() {
				return de.dentrassi.varlink.spi.Syncer.await(async().getInfo());
			}

			public java.util.List<Container> listContainers() {
				return de.dentrassi.varlink.spi.Syncer.await(async().listContainers());
			}

			public java.util.List<PsContainer> ps(final PsOpts opts) {
				return de.dentrassi.varlink.spi.Syncer.await(async().ps(opts));
			}

			public java.util.List<Container> getContainersByStatus(final java.util.List<java.lang.String> status) {
				return de.dentrassi.varlink.spi.Syncer.await(async().getContainersByStatus(status));
			}

			public java.util.List<java.lang.String> top(final java.lang.String nameOrID,
					final java.util.List<java.lang.String> descriptors) {
				return de.dentrassi.varlink.spi.Syncer.await(async().top(nameOrID, descriptors));
			}

			public Container getContainer(final java.lang.String id) {
				return de.dentrassi.varlink.spi.Syncer.await(async().getContainer(id));
			}

			public java.util.List<java.lang.String> getContainersByContext(final java.lang.Boolean all,
					final java.lang.Boolean latest, final java.util.List<java.lang.String> args) {
				return de.dentrassi.varlink.spi.Syncer.await(async().getContainersByContext(all, latest, args));
			}

			public java.lang.String createContainer(final Create create) {
				return de.dentrassi.varlink.spi.Syncer.await(async().createContainer(create));
			}

			public java.lang.String inspectContainer(final java.lang.String name) {
				return de.dentrassi.varlink.spi.Syncer.await(async().inspectContainer(name));
			}

			public java.util.List<java.lang.String> listContainerProcesses(final java.lang.String name,
					final java.util.List<java.lang.String> opts) {
				return de.dentrassi.varlink.spi.Syncer.await(async().listContainerProcesses(name, opts));
			}

			public java.util.List<java.lang.String> getContainerLogs(final java.lang.String name) {
				return de.dentrassi.varlink.spi.Syncer.await(async().getContainerLogs(name));
			}

			public LogLine getContainersLogs(final java.util.List<java.lang.String> names,
					final java.lang.Boolean follow, final java.lang.Boolean latest, final java.lang.String since,
					final java.lang.Long tail, final java.lang.Boolean timestamps) {
				return de.dentrassi.varlink.spi.Syncer
						.await(async().getContainersLogs(names, follow, latest, since, tail, timestamps));
			}

			public ContainerChanges listContainerChanges(final java.lang.String name) {
				return de.dentrassi.varlink.spi.Syncer.await(async().listContainerChanges(name));
			}

			public java.lang.String exportContainer(final java.lang.String name, final java.lang.String path) {
				return de.dentrassi.varlink.spi.Syncer.await(async().exportContainer(name, path));
			}

			public ContainerStats getContainerStats(final java.lang.String name) {
				return de.dentrassi.varlink.spi.Syncer.await(async().getContainerStats(name));
			}

			public ContainerStats getContainerStatsWithHistory(final ContainerStats previousStats) {
				return de.dentrassi.varlink.spi.Syncer.await(async().getContainerStatsWithHistory(previousStats));
			}

			public java.lang.String startContainer(final java.lang.String name) {
				return de.dentrassi.varlink.spi.Syncer.await(async().startContainer(name));
			}

			public java.lang.String stopContainer(final java.lang.String name, final java.lang.Long timeout) {
				return de.dentrassi.varlink.spi.Syncer.await(async().stopContainer(name, timeout));
			}

			public java.lang.String initContainer(final java.lang.String name) {
				return de.dentrassi.varlink.spi.Syncer.await(async().initContainer(name));
			}

			public java.lang.String restartContainer(final java.lang.String name, final java.lang.Long timeout) {
				return de.dentrassi.varlink.spi.Syncer.await(async().restartContainer(name, timeout));
			}

			public java.lang.String killContainer(final java.lang.String name, final java.lang.Long signal) {
				return de.dentrassi.varlink.spi.Syncer.await(async().killContainer(name, signal));
			}

			public java.lang.String pauseContainer(final java.lang.String name) {
				return de.dentrassi.varlink.spi.Syncer.await(async().pauseContainer(name));
			}

			public java.lang.String unpauseContainer(final java.lang.String name) {
				return de.dentrassi.varlink.spi.Syncer.await(async().unpauseContainer(name));
			}

			public void attach(final java.lang.String name, final java.lang.String detachKeys,
					final java.lang.Boolean start) {
				de.dentrassi.varlink.spi.Syncer.await(async().attach(name, detachKeys, start));
			}

			public void attachControl(final java.lang.String name) {
				de.dentrassi.varlink.spi.Syncer.await(async().attachControl(name));
			}

			public Sockets getAttachSockets(final java.lang.String name) {
				return de.dentrassi.varlink.spi.Syncer.await(async().getAttachSockets(name));
			}

			public java.lang.Long waitContainer(final java.lang.String name, final java.lang.Long interval) {
				return de.dentrassi.varlink.spi.Syncer.await(async().waitContainer(name, interval));
			}

			public java.lang.String removeContainer(final java.lang.String name, final java.lang.Boolean force,
					final java.lang.Boolean removeVolumes) {
				return de.dentrassi.varlink.spi.Syncer.await(async().removeContainer(name, force, removeVolumes));
			}

			public java.util.List<java.lang.String> deleteStoppedContainers() {
				return de.dentrassi.varlink.spi.Syncer.await(async().deleteStoppedContainers());
			}

			public java.util.List<Image> listImages() {
				return de.dentrassi.varlink.spi.Syncer.await(async().listImages());
			}

			public Image getImage(final java.lang.String id) {
				return de.dentrassi.varlink.spi.Syncer.await(async().getImage(id));
			}

			public MoreResponse buildImage(final BuildInfo build) {
				return de.dentrassi.varlink.spi.Syncer.await(async().buildImage(build));
			}

			public java.lang.String inspectImage(final java.lang.String name) {
				return de.dentrassi.varlink.spi.Syncer.await(async().inspectImage(name));
			}

			public java.util.List<ImageHistory> historyImage(final java.lang.String name) {
				return de.dentrassi.varlink.spi.Syncer.await(async().historyImage(name));
			}

			public MoreResponse pushImage(final java.lang.String name, final java.lang.String tag,
					final java.util.Optional<java.lang.Boolean> tlsverify, final java.lang.String signaturePolicy,
					final java.lang.String creds, final java.lang.String certDir, final java.lang.Boolean compress,
					final java.lang.String format, final java.lang.Boolean removeSignatures,
					final java.lang.String signBy) {
				return de.dentrassi.varlink.spi.Syncer.await(async().pushImage(name, tag, tlsverify, signaturePolicy,
						creds, certDir, compress, format, removeSignatures, signBy));
			}

			public java.lang.String tagImage(final java.lang.String name, final java.lang.String tagged) {
				return de.dentrassi.varlink.spi.Syncer.await(async().tagImage(name, tagged));
			}

			public java.lang.String removeImage(final java.lang.String name, final java.lang.Boolean force) {
				return de.dentrassi.varlink.spi.Syncer.await(async().removeImage(name, force));
			}

			public java.util.List<ImageSearchResult> searchImages(final java.lang.String query,
					final java.util.Optional<java.lang.Long> limit,
					final java.util.Optional<java.lang.Boolean> tlsVerify, final ImageSearchFilter filter) {
				return de.dentrassi.varlink.spi.Syncer.await(async().searchImages(query, limit, tlsVerify, filter));
			}

			public java.util.List<java.lang.String> deleteUnusedImages() {
				return de.dentrassi.varlink.spi.Syncer.await(async().deleteUnusedImages());
			}

			public java.lang.String commit(final java.lang.String name, final java.lang.String image_name,
					final java.util.List<java.lang.String> changes, final java.lang.String author,
					final java.lang.String message, final java.lang.Boolean pause,
					final java.lang.String manifestType) {
				return de.dentrassi.varlink.spi.Syncer
						.await(async().commit(name, image_name, changes, author, message, pause, manifestType));
			}

			public java.lang.String importImage(final java.lang.String source, final java.lang.String reference,
					final java.lang.String message, final java.util.List<java.lang.String> changes,
					final java.lang.Boolean delete) {
				return de.dentrassi.varlink.spi.Syncer
						.await(async().importImage(source, reference, message, changes, delete));
			}

			public java.lang.String exportImage(final java.lang.String name, final java.lang.String destination,
					final java.lang.Boolean compress, final java.util.List<java.lang.String> tags) {
				return de.dentrassi.varlink.spi.Syncer.await(async().exportImage(name, destination, compress, tags));
			}

			public MoreResponse pullImage(final java.lang.String name, final java.lang.String certDir,
					final java.lang.String creds, final java.lang.String signaturePolicy,
					final java.util.Optional<java.lang.Boolean> tlsVerify) {
				return de.dentrassi.varlink.spi.Syncer
						.await(async().pullImage(name, certDir, creds, signaturePolicy, tlsVerify));
			}

			public java.lang.String createPod(final PodCreate create) {
				return de.dentrassi.varlink.spi.Syncer.await(async().createPod(create));
			}

			public java.util.List<ListPodData> listPods() {
				return de.dentrassi.varlink.spi.Syncer.await(async().listPods());
			}

			public ListPodData getPod(final java.lang.String name) {
				return de.dentrassi.varlink.spi.Syncer.await(async().getPod(name));
			}

			public java.lang.String inspectPod(final java.lang.String name) {
				return de.dentrassi.varlink.spi.Syncer.await(async().inspectPod(name));
			}

			public java.lang.String startPod(final java.lang.String name) {
				return de.dentrassi.varlink.spi.Syncer.await(async().startPod(name));
			}

			public java.lang.String stopPod(final java.lang.String name, final java.lang.Long timeout) {
				return de.dentrassi.varlink.spi.Syncer.await(async().stopPod(name, timeout));
			}

			public java.lang.String restartPod(final java.lang.String name) {
				return de.dentrassi.varlink.spi.Syncer.await(async().restartPod(name));
			}

			public java.lang.String killPod(final java.lang.String name, final java.lang.Long signal) {
				return de.dentrassi.varlink.spi.Syncer.await(async().killPod(name, signal));
			}

			public java.lang.String pausePod(final java.lang.String name) {
				return de.dentrassi.varlink.spi.Syncer.await(async().pausePod(name));
			}

			public java.lang.String unpausePod(final java.lang.String name) {
				return de.dentrassi.varlink.spi.Syncer.await(async().unpausePod(name));
			}

			public java.lang.String removePod(final java.lang.String name, final java.lang.Boolean force) {
				return de.dentrassi.varlink.spi.Syncer.await(async().removePod(name, force));
			}

			public java.util.List<java.lang.String> topPod(final java.lang.String pod, final java.lang.Boolean latest,
					final java.util.List<java.lang.String> descriptors) {
				return de.dentrassi.varlink.spi.Syncer.await(async().topPod(pod, latest, descriptors));
			}

			public GetPodStats_Out getPodStats(final java.lang.String name) {
				return de.dentrassi.varlink.spi.Syncer.await(async().getPodStats(name));
			}

			public java.util.List<java.lang.String> getPodsByStatus(final java.util.List<java.lang.String> statuses) {
				return de.dentrassi.varlink.spi.Syncer.await(async().getPodsByStatus(statuses));
			}

			public java.lang.Long imageExists(final java.lang.String name) {
				return de.dentrassi.varlink.spi.Syncer.await(async().imageExists(name));
			}

			public java.lang.Long containerExists(final java.lang.String name) {
				return de.dentrassi.varlink.spi.Syncer.await(async().containerExists(name));
			}

			public java.lang.String containerCheckpoint(final java.lang.String name, final java.lang.Boolean keep,
					final java.lang.Boolean leaveRunning, final java.lang.Boolean tcpEstablished) {
				return de.dentrassi.varlink.spi.Syncer
						.await(async().containerCheckpoint(name, keep, leaveRunning, tcpEstablished));
			}

			public java.lang.String containerRestore(final java.lang.String name, final java.lang.Boolean keep,
					final java.lang.Boolean tcpEstablished) {
				return de.dentrassi.varlink.spi.Syncer.await(async().containerRestore(name, keep, tcpEstablished));
			}

			public void containerRunlabel(final Runlabel runlabel) {
				de.dentrassi.varlink.spi.Syncer.await(async().containerRunlabel(runlabel));
			}

			public java.util.Map<java.lang.String, java.lang.String> listContainerMounts() {
				return de.dentrassi.varlink.spi.Syncer.await(async().listContainerMounts());
			}

			public java.lang.String mountContainer(final java.lang.String name) {
				return de.dentrassi.varlink.spi.Syncer.await(async().mountContainer(name));
			}

			public void unmountContainer(final java.lang.String name, final java.lang.Boolean force) {
				de.dentrassi.varlink.spi.Syncer.await(async().unmountContainer(name, force));
			}

			public java.util.List<java.lang.String> imagesPrune(final java.lang.Boolean all) {
				return de.dentrassi.varlink.spi.Syncer.await(async().imagesPrune(all));
			}

			public KubePodService generateKube(final java.lang.String name, final java.lang.Boolean service) {
				return de.dentrassi.varlink.spi.Syncer.await(async().generateKube(name, service));
			}

			public java.lang.String containerConfig(final java.lang.String name) {
				return de.dentrassi.varlink.spi.Syncer.await(async().containerConfig(name));
			}

			public java.lang.String containerArtifacts(final java.lang.String name,
					final java.lang.String artifactName) {
				return de.dentrassi.varlink.spi.Syncer.await(async().containerArtifacts(name, artifactName));
			}

			public java.lang.String containerInspectData(final java.lang.String name, final java.lang.Boolean size) {
				return de.dentrassi.varlink.spi.Syncer.await(async().containerInspectData(name, size));
			}

			public java.lang.String containerStateData(final java.lang.String name) {
				return de.dentrassi.varlink.spi.Syncer.await(async().containerStateData(name));
			}

			public java.lang.String podStateData(final java.lang.String name) {
				return de.dentrassi.varlink.spi.Syncer.await(async().podStateData(name));
			}

			public java.lang.String createFromCC(final java.util.List<java.lang.String> in) {
				return de.dentrassi.varlink.spi.Syncer.await(async().createFromCC(in));
			}

			public java.lang.String spec(final java.lang.String name) {
				return de.dentrassi.varlink.spi.Syncer.await(async().spec(name));
			}

			public java.lang.String sendFile(final java.lang.String type, final java.lang.Long length) {
				return de.dentrassi.varlink.spi.Syncer.await(async().sendFile(type, length));
			}

			public java.lang.Long receiveFile(final java.lang.String path, final java.lang.Boolean delete) {
				return de.dentrassi.varlink.spi.Syncer.await(async().receiveFile(path, delete));
			}

			public java.lang.String volumeCreate(final VolumeCreateOpts options) {
				return de.dentrassi.varlink.spi.Syncer.await(async().volumeCreate(options));
			}

			public java.util.List<java.lang.String> volumeRemove(final VolumeRemoveOpts options) {
				return de.dentrassi.varlink.spi.Syncer.await(async().volumeRemove(options));
			}

			public java.util.List<Volume> getVolumes(final java.util.List<java.lang.String> args,
					final java.lang.Boolean all) {
				return de.dentrassi.varlink.spi.Syncer.await(async().getVolumes(args, all));
			}

			public VolumesPrune_Out volumesPrune() {
				return de.dentrassi.varlink.spi.Syncer.await(async().volumesPrune());
			}

			public MoreResponse imageSave(final ImageSaveOptions options) {
				return de.dentrassi.varlink.spi.Syncer.await(async().imageSave(options));
			}

			public java.util.List<java.lang.String> getPodsByContext(final java.lang.Boolean all,
					final java.lang.Boolean latest, final java.util.List<java.lang.String> args) {
				return de.dentrassi.varlink.spi.Syncer.await(async().getPodsByContext(all, latest, args));
			}

			public MoreResponse loadImage(final java.lang.String name, final java.lang.String inputFile,
					final java.lang.Boolean quiet, final java.lang.Boolean deleteFile) {
				return de.dentrassi.varlink.spi.Syncer.await(async().loadImage(name, inputFile, quiet, deleteFile));
			}

			public Event getEvents(final java.util.List<java.lang.String> filter, final java.lang.String since,
					final java.lang.String until) {
				return de.dentrassi.varlink.spi.Syncer.await(async().getEvents(filter, since, until));
			}

			public java.util.List<DiffInfo> diff(final java.lang.String name) {
				return de.dentrassi.varlink.spi.Syncer.await(async().diff(name));
			}

			public java.lang.String getLayersMapWithImageInfo() {
				return de.dentrassi.varlink.spi.Syncer.await(async().getLayersMapWithImageInfo());
			}

			public java.lang.String buildImageHierarchyMap(final java.lang.String name) {
				return de.dentrassi.varlink.spi.Syncer.await(async().buildImageHierarchyMap(name));
			}

			public java.lang.String generateSystemd(final java.lang.String name, final java.lang.String restart,
					final java.lang.Long timeout, final java.lang.Boolean useName) {
				return de.dentrassi.varlink.spi.Syncer.await(async().generateSystemd(name, restart, timeout, useName));
			}
		};
	}
}
