package io.podman;

public class PodmanImpl implements Podman {
	public static class Factory implements de.dentrassi.varlink.spi.Factory {
		public @Override <T> T create(final de.dentrassi.varlink.internal.VarlinkImpl varlink, final Class<T> clazz,
				final de.dentrassi.varlink.spi.Connection connection) {
			return clazz.cast(new PodmanImpl(connection, varlink));
		}
	}

	private final de.dentrassi.varlink.spi.Connection connection;
	private final de.dentrassi.varlink.internal.VarlinkImpl varlink;

	private PodmanImpl(final de.dentrassi.varlink.spi.Connection connection,
			final de.dentrassi.varlink.internal.VarlinkImpl varlink) {
		this.connection = connection;
		this.varlink = varlink;
	}

	public void checkError(final de.dentrassi.varlink.spi.CallResponse response) {
		de.dentrassi.varlink.spi.Errors.checkErrors(response, this::mapError);
	}

	public java.lang.RuntimeException mapError(final java.lang.String error,
			final de.dentrassi.varlink.spi.CallResponse response) {
		switch (error) {
		case "io.podman.ImageNotFoundException":
			return new ImageNotFoundException(
					this.varlink.fromJson(ImageNotFoundException.Parameters.class, response.getParameters()));
		case "io.podman.ContainerNotFoundException":
			return new ContainerNotFoundException(
					this.varlink.fromJson(ContainerNotFoundException.Parameters.class, response.getParameters()));
		case "io.podman.NoContainerRunningException":
			return new NoContainerRunningException(
					this.varlink.fromJson(NoContainerRunningException.Parameters.class, response.getParameters()));
		case "io.podman.PodNotFoundException":
			return new PodNotFoundException(
					this.varlink.fromJson(PodNotFoundException.Parameters.class, response.getParameters()));
		case "io.podman.VolumeNotFoundException":
			return new VolumeNotFoundException(
					this.varlink.fromJson(VolumeNotFoundException.Parameters.class, response.getParameters()));
		case "io.podman.PodContainerErrorException":
			return new PodContainerErrorException(
					this.varlink.fromJson(PodContainerErrorException.Parameters.class, response.getParameters()));
		case "io.podman.NoContainersInPodException":
			return new NoContainersInPodException(
					this.varlink.fromJson(NoContainersInPodException.Parameters.class, response.getParameters()));
		case "io.podman.InvalidStateException":
			return new InvalidStateException(
					this.varlink.fromJson(InvalidStateException.Parameters.class, response.getParameters()));
		case "io.podman.ErrorOccurredException":
			return new ErrorOccurredException(
					this.varlink.fromJson(ErrorOccurredException.Parameters.class, response.getParameters()));
		case "io.podman.RuntimeErrorException":
			return new RuntimeErrorException(
					this.varlink.fromJson(RuntimeErrorException.Parameters.class, response.getParameters()));
		case "io.podman.WantsMoreRequiredException":
			return new WantsMoreRequiredException(
					this.varlink.fromJson(WantsMoreRequiredException.Parameters.class, response.getParameters()));
		default:
			return null;
		}
	}

	@Override
	public Async async() {
		return new Async() {
			public java.util.concurrent.CompletableFuture<GetVersion_Out> getVersion() {
				return internalGetVersion();
			}

			public java.util.concurrent.CompletableFuture<PodmanInfo> getInfo() {
				return internalGetInfo();
			}

			public java.util.concurrent.CompletableFuture<java.util.List<Container>> listContainers() {
				return internalListContainers();
			}

			public java.util.concurrent.CompletableFuture<java.util.List<PsContainer>> ps(final PsOpts opts) {
				return internalPs(opts);
			}

			public java.util.concurrent.CompletableFuture<java.util.List<Container>> getContainersByStatus(
					final java.util.List<java.lang.String> status) {
				return internalGetContainersByStatus(status);
			}

			public java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> top(
					final java.lang.String nameOrID, final java.util.List<java.lang.String> descriptors) {
				return internalTop(nameOrID, descriptors);
			}

			public java.util.concurrent.CompletableFuture<Container> getContainer(final java.lang.String id) {
				return internalGetContainer(id);
			}

			public java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> getContainersByContext(
					final java.lang.Boolean all, final java.lang.Boolean latest,
					final java.util.List<java.lang.String> args) {
				return internalGetContainersByContext(all, latest, args);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> createContainer(final Create create) {
				return internalCreateContainer(create);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> inspectContainer(
					final java.lang.String name) {
				return internalInspectContainer(name);
			}

			public java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> listContainerProcesses(
					final java.lang.String name, final java.util.List<java.lang.String> opts) {
				return internalListContainerProcesses(name, opts);
			}

			public java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> getContainerLogs(
					final java.lang.String name) {
				return internalGetContainerLogs(name);
			}

			public java.util.concurrent.CompletableFuture<LogLine> getContainersLogs(
					final java.util.List<java.lang.String> names, final java.lang.Boolean follow,
					final java.lang.Boolean latest, final java.lang.String since, final java.lang.Long tail,
					final java.lang.Boolean timestamps) {
				return internalGetContainersLogs(names, follow, latest, since, tail, timestamps);
			}

			public java.util.concurrent.CompletableFuture<ContainerChanges> listContainerChanges(
					final java.lang.String name) {
				return internalListContainerChanges(name);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> exportContainer(final java.lang.String name,
					final java.lang.String path) {
				return internalExportContainer(name, path);
			}

			public java.util.concurrent.CompletableFuture<ContainerStats> getContainerStats(
					final java.lang.String name) {
				return internalGetContainerStats(name);
			}

			public java.util.concurrent.CompletableFuture<ContainerStats> getContainerStatsWithHistory(
					final ContainerStats previousStats) {
				return internalGetContainerStatsWithHistory(previousStats);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> startContainer(
					final java.lang.String name) {
				return internalStartContainer(name);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> stopContainer(final java.lang.String name,
					final java.lang.Long timeout) {
				return internalStopContainer(name, timeout);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> initContainer(final java.lang.String name) {
				return internalInitContainer(name);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> restartContainer(
					final java.lang.String name, final java.lang.Long timeout) {
				return internalRestartContainer(name, timeout);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> killContainer(final java.lang.String name,
					final java.lang.Long signal) {
				return internalKillContainer(name, signal);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> pauseContainer(
					final java.lang.String name) {
				return internalPauseContainer(name);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> unpauseContainer(
					final java.lang.String name) {
				return internalUnpauseContainer(name);
			}

			public java.util.concurrent.CompletableFuture<java.lang.Void> attach(final java.lang.String name,
					final java.lang.String detachKeys, final java.lang.Boolean start) {
				return internalAttach(name, detachKeys, start);
			}

			public java.util.concurrent.CompletableFuture<java.lang.Void> attachControl(final java.lang.String name) {
				return internalAttachControl(name);
			}

			public java.util.concurrent.CompletableFuture<Sockets> getAttachSockets(final java.lang.String name) {
				return internalGetAttachSockets(name);
			}

			public java.util.concurrent.CompletableFuture<java.lang.Long> waitContainer(final java.lang.String name,
					final java.lang.Long interval) {
				return internalWaitContainer(name, interval);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> removeContainer(final java.lang.String name,
					final java.lang.Boolean force, final java.lang.Boolean removeVolumes) {
				return internalRemoveContainer(name, force, removeVolumes);
			}

			public java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> deleteStoppedContainers() {
				return internalDeleteStoppedContainers();
			}

			public java.util.concurrent.CompletableFuture<java.util.List<Image>> listImages() {
				return internalListImages();
			}

			public java.util.concurrent.CompletableFuture<Image> getImage(final java.lang.String id) {
				return internalGetImage(id);
			}

			public java.util.concurrent.CompletableFuture<MoreResponse> buildImage(final BuildInfo build) {
				return internalBuildImage(build);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> inspectImage(final java.lang.String name) {
				return internalInspectImage(name);
			}

			public java.util.concurrent.CompletableFuture<java.util.List<ImageHistory>> historyImage(
					final java.lang.String name) {
				return internalHistoryImage(name);
			}

			public java.util.concurrent.CompletableFuture<MoreResponse> pushImage(final java.lang.String name,
					final java.lang.String tag, final java.util.Optional<java.lang.Boolean> tlsverify,
					final java.lang.String signaturePolicy, final java.lang.String creds,
					final java.lang.String certDir, final java.lang.Boolean compress, final java.lang.String format,
					final java.lang.Boolean removeSignatures, final java.lang.String signBy) {
				return internalPushImage(name, tag, tlsverify, signaturePolicy, creds, certDir, compress, format,
						removeSignatures, signBy);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> tagImage(final java.lang.String name,
					final java.lang.String tagged) {
				return internalTagImage(name, tagged);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> removeImage(final java.lang.String name,
					final java.lang.Boolean force) {
				return internalRemoveImage(name, force);
			}

			public java.util.concurrent.CompletableFuture<java.util.List<ImageSearchResult>> searchImages(
					final java.lang.String query, final java.util.Optional<java.lang.Long> limit,
					final java.util.Optional<java.lang.Boolean> tlsVerify, final ImageSearchFilter filter) {
				return internalSearchImages(query, limit, tlsVerify, filter);
			}

			public java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> deleteUnusedImages() {
				return internalDeleteUnusedImages();
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> commit(final java.lang.String name,
					final java.lang.String image_name, final java.util.List<java.lang.String> changes,
					final java.lang.String author, final java.lang.String message, final java.lang.Boolean pause,
					final java.lang.String manifestType) {
				return internalCommit(name, image_name, changes, author, message, pause, manifestType);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> importImage(final java.lang.String source,
					final java.lang.String reference, final java.lang.String message,
					final java.util.List<java.lang.String> changes, final java.lang.Boolean delete) {
				return internalImportImage(source, reference, message, changes, delete);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> exportImage(final java.lang.String name,
					final java.lang.String destination, final java.lang.Boolean compress,
					final java.util.List<java.lang.String> tags) {
				return internalExportImage(name, destination, compress, tags);
			}

			public java.util.concurrent.CompletableFuture<MoreResponse> pullImage(final java.lang.String name,
					final java.lang.String certDir, final java.lang.String creds,
					final java.lang.String signaturePolicy, final java.util.Optional<java.lang.Boolean> tlsVerify) {
				return internalPullImage(name, certDir, creds, signaturePolicy, tlsVerify);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> createPod(final PodCreate create) {
				return internalCreatePod(create);
			}

			public java.util.concurrent.CompletableFuture<java.util.List<ListPodData>> listPods() {
				return internalListPods();
			}

			public java.util.concurrent.CompletableFuture<ListPodData> getPod(final java.lang.String name) {
				return internalGetPod(name);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> inspectPod(final java.lang.String name) {
				return internalInspectPod(name);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> startPod(final java.lang.String name) {
				return internalStartPod(name);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> stopPod(final java.lang.String name,
					final java.lang.Long timeout) {
				return internalStopPod(name, timeout);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> restartPod(final java.lang.String name) {
				return internalRestartPod(name);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> killPod(final java.lang.String name,
					final java.lang.Long signal) {
				return internalKillPod(name, signal);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> pausePod(final java.lang.String name) {
				return internalPausePod(name);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> unpausePod(final java.lang.String name) {
				return internalUnpausePod(name);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> removePod(final java.lang.String name,
					final java.lang.Boolean force) {
				return internalRemovePod(name, force);
			}

			public java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> topPod(
					final java.lang.String pod, final java.lang.Boolean latest,
					final java.util.List<java.lang.String> descriptors) {
				return internalTopPod(pod, latest, descriptors);
			}

			public java.util.concurrent.CompletableFuture<GetPodStats_Out> getPodStats(final java.lang.String name) {
				return internalGetPodStats(name);
			}

			public java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> getPodsByStatus(
					final java.util.List<java.lang.String> statuses) {
				return internalGetPodsByStatus(statuses);
			}

			public java.util.concurrent.CompletableFuture<java.lang.Long> imageExists(final java.lang.String name) {
				return internalImageExists(name);
			}

			public java.util.concurrent.CompletableFuture<java.lang.Long> containerExists(final java.lang.String name) {
				return internalContainerExists(name);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> containerCheckpoint(
					final java.lang.String name, final java.lang.Boolean keep, final java.lang.Boolean leaveRunning,
					final java.lang.Boolean tcpEstablished) {
				return internalContainerCheckpoint(name, keep, leaveRunning, tcpEstablished);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> containerRestore(
					final java.lang.String name, final java.lang.Boolean keep, final java.lang.Boolean tcpEstablished) {
				return internalContainerRestore(name, keep, tcpEstablished);
			}

			public java.util.concurrent.CompletableFuture<java.lang.Void> containerRunlabel(final Runlabel runlabel) {
				return internalContainerRunlabel(runlabel);
			}

			public java.util.concurrent.CompletableFuture<java.util.Map<java.lang.String, java.lang.String>> listContainerMounts() {
				return internalListContainerMounts();
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> mountContainer(
					final java.lang.String name) {
				return internalMountContainer(name);
			}

			public java.util.concurrent.CompletableFuture<java.lang.Void> unmountContainer(final java.lang.String name,
					final java.lang.Boolean force) {
				return internalUnmountContainer(name, force);
			}

			public java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> imagesPrune(
					final java.lang.Boolean all) {
				return internalImagesPrune(all);
			}

			public java.util.concurrent.CompletableFuture<KubePodService> generateKube(final java.lang.String name,
					final java.lang.Boolean service) {
				return internalGenerateKube(name, service);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> containerConfig(
					final java.lang.String name) {
				return internalContainerConfig(name);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> containerArtifacts(
					final java.lang.String name, final java.lang.String artifactName) {
				return internalContainerArtifacts(name, artifactName);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> containerInspectData(
					final java.lang.String name, final java.lang.Boolean size) {
				return internalContainerInspectData(name, size);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> containerStateData(
					final java.lang.String name) {
				return internalContainerStateData(name);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> podStateData(final java.lang.String name) {
				return internalPodStateData(name);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> createFromCC(
					final java.util.List<java.lang.String> in) {
				return internalCreateFromCC(in);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> spec(final java.lang.String name) {
				return internalSpec(name);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> sendFile(final java.lang.String type,
					final java.lang.Long length) {
				return internalSendFile(type, length);
			}

			public java.util.concurrent.CompletableFuture<java.lang.Long> receiveFile(final java.lang.String path,
					final java.lang.Boolean delete) {
				return internalReceiveFile(path, delete);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> volumeCreate(
					final VolumeCreateOpts options) {
				return internalVolumeCreate(options);
			}

			public java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> volumeRemove(
					final VolumeRemoveOpts options) {
				return internalVolumeRemove(options);
			}

			public java.util.concurrent.CompletableFuture<java.util.List<Volume>> getVolumes(
					final java.util.List<java.lang.String> args, final java.lang.Boolean all) {
				return internalGetVolumes(args, all);
			}

			public java.util.concurrent.CompletableFuture<VolumesPrune_Out> volumesPrune() {
				return internalVolumesPrune();
			}

			public java.util.concurrent.CompletableFuture<MoreResponse> imageSave(final ImageSaveOptions options) {
				return internalImageSave(options);
			}

			public java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> getPodsByContext(
					final java.lang.Boolean all, final java.lang.Boolean latest,
					final java.util.List<java.lang.String> args) {
				return internalGetPodsByContext(all, latest, args);
			}

			public java.util.concurrent.CompletableFuture<MoreResponse> loadImage(final java.lang.String name,
					final java.lang.String inputFile, final java.lang.Boolean quiet,
					final java.lang.Boolean deleteFile) {
				return internalLoadImage(name, inputFile, quiet, deleteFile);
			}

			public java.util.concurrent.CompletableFuture<Event> getEvents(
					final java.util.List<java.lang.String> filter, final java.lang.String since,
					final java.lang.String until) {
				return internalGetEvents(filter, since, until);
			}

			public java.util.concurrent.CompletableFuture<java.util.List<DiffInfo>> diff(final java.lang.String name) {
				return internalDiff(name);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> getLayersMapWithImageInfo() {
				return internalGetLayersMapWithImageInfo();
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> buildImageHierarchyMap(
					final java.lang.String name) {
				return internalBuildImageHierarchyMap(name);
			}

			public java.util.concurrent.CompletableFuture<java.lang.String> generateSystemd(final java.lang.String name,
					final java.lang.String restart, final java.lang.Long timeout, final java.lang.Boolean useName) {
				return internalGenerateSystemd(name, restart, timeout, useName);
			}
		};
	}

	protected java.util.concurrent.CompletableFuture<GetVersion_Out> internalGetVersion() {
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.GetVersion"))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(getVersion_returnTypeToken, result.getParameters());
				});
	}

	private final static java.lang.reflect.Type getVersion_returnTypeToken = new com.google.gson.reflect.TypeToken<GetVersion_Out>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<PodmanInfo> internalGetInfo() {
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.GetInfo")).thenApply(result -> {
			checkError(result);
			return this.varlink.fromJson(getInfo_returnTypeToken, result.getFirstParameter());
		});
	}

	private final static java.lang.reflect.Type getInfo_returnTypeToken = new com.google.gson.reflect.TypeToken<PodmanInfo>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.util.List<Container>> internalListContainers() {
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.ListContainers"))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(listContainers_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type listContainers_returnTypeToken = new com.google.gson.reflect.TypeToken<java.util.List<Container>>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.util.List<PsContainer>> internalPs(final PsOpts opts) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.Ps", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(ps_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type ps_returnTypeToken = new com.google.gson.reflect.TypeToken<java.util.List<PsContainer>>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.util.List<Container>> internalGetContainersByStatus(
			final java.util.List<java.lang.String> status) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection
				.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.GetContainersByStatus", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(getContainersByStatus_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type getContainersByStatus_returnTypeToken = new com.google.gson.reflect.TypeToken<java.util.List<Container>>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> internalTop(
			final java.lang.String nameOrID, final java.util.List<java.lang.String> descriptors) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(2);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.Top", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(top_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type top_returnTypeToken = new com.google.gson.reflect.TypeToken<java.util.List<java.lang.String>>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<Container> internalGetContainer(final java.lang.String id) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.GetContainer", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(getContainer_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type getContainer_returnTypeToken = new com.google.gson.reflect.TypeToken<Container>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> internalGetContainersByContext(
			final java.lang.Boolean all, final java.lang.Boolean latest, final java.util.List<java.lang.String> args) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(3);
		return this.connection
				.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.GetContainersByContext", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(getContainersByContext_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type getContainersByContext_returnTypeToken = new com.google.gson.reflect.TypeToken<java.util.List<java.lang.String>>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalCreateContainer(final Create create) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.CreateContainer", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(createContainer_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type createContainer_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalInspectContainer(
			final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.InspectContainer", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(inspectContainer_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type inspectContainer_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> internalListContainerProcesses(
			final java.lang.String name, final java.util.List<java.lang.String> opts) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(2);
		return this.connection
				.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.ListContainerProcesses", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(listContainerProcesses_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type listContainerProcesses_returnTypeToken = new com.google.gson.reflect.TypeToken<java.util.List<java.lang.String>>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> internalGetContainerLogs(
			final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.GetContainerLogs", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(getContainerLogs_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type getContainerLogs_returnTypeToken = new com.google.gson.reflect.TypeToken<java.util.List<java.lang.String>>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<LogLine> internalGetContainersLogs(
			final java.util.List<java.lang.String> names, final java.lang.Boolean follow,
			final java.lang.Boolean latest, final java.lang.String since, final java.lang.Long tail,
			final java.lang.Boolean timestamps) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(6);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.GetContainersLogs", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(getContainersLogs_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type getContainersLogs_returnTypeToken = new com.google.gson.reflect.TypeToken<LogLine>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<ContainerChanges> internalListContainerChanges(
			final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection
				.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.ListContainerChanges", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(listContainerChanges_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type listContainerChanges_returnTypeToken = new com.google.gson.reflect.TypeToken<ContainerChanges>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalExportContainer(
			final java.lang.String name, final java.lang.String path) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(2);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.ExportContainer", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(exportContainer_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type exportContainer_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<ContainerStats> internalGetContainerStats(
			final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.GetContainerStats", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(getContainerStats_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type getContainerStats_returnTypeToken = new com.google.gson.reflect.TypeToken<ContainerStats>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<ContainerStats> internalGetContainerStatsWithHistory(
			final ContainerStats previousStats) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection
				.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.GetContainerStatsWithHistory", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(getContainerStatsWithHistory_returnTypeToken,
							result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type getContainerStatsWithHistory_returnTypeToken = new com.google.gson.reflect.TypeToken<ContainerStats>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalStartContainer(
			final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.StartContainer", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(startContainer_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type startContainer_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalStopContainer(
			final java.lang.String name, final java.lang.Long timeout) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(2);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.StopContainer", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(stopContainer_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type stopContainer_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalInitContainer(
			final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.InitContainer", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(initContainer_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type initContainer_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalRestartContainer(
			final java.lang.String name, final java.lang.Long timeout) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(2);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.RestartContainer", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(restartContainer_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type restartContainer_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalKillContainer(
			final java.lang.String name, final java.lang.Long signal) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(2);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.KillContainer", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(killContainer_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type killContainer_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalPauseContainer(
			final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.PauseContainer", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(pauseContainer_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type pauseContainer_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalUnpauseContainer(
			final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.UnpauseContainer", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(unpauseContainer_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type unpauseContainer_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.Void> internalAttach(final java.lang.String name,
			final java.lang.String detachKeys, final java.lang.Boolean start) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(3);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.Attach", parameters))
				.thenApply(result -> {
					checkError(result);
					return null;
				});
	}

	protected java.util.concurrent.CompletableFuture<java.lang.Void> internalAttachControl(
			final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.AttachControl", parameters))
				.thenApply(result -> {
					checkError(result);
					return null;
				});
	}

	protected java.util.concurrent.CompletableFuture<Sockets> internalGetAttachSockets(final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.GetAttachSockets", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(getAttachSockets_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type getAttachSockets_returnTypeToken = new com.google.gson.reflect.TypeToken<Sockets>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.Long> internalWaitContainer(final java.lang.String name,
			final java.lang.Long interval) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(2);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.WaitContainer", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(waitContainer_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type waitContainer_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.Long>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalRemoveContainer(
			final java.lang.String name, final java.lang.Boolean force, final java.lang.Boolean removeVolumes) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(3);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.RemoveContainer", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(removeContainer_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type removeContainer_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> internalDeleteStoppedContainers() {
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.DeleteStoppedContainers"))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(deleteStoppedContainers_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type deleteStoppedContainers_returnTypeToken = new com.google.gson.reflect.TypeToken<java.util.List<java.lang.String>>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.util.List<Image>> internalListImages() {
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.ListImages"))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(listImages_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type listImages_returnTypeToken = new com.google.gson.reflect.TypeToken<java.util.List<Image>>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<Image> internalGetImage(final java.lang.String id) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.GetImage", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(getImage_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type getImage_returnTypeToken = new com.google.gson.reflect.TypeToken<Image>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<MoreResponse> internalBuildImage(final BuildInfo build) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.BuildImage", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(buildImage_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type buildImage_returnTypeToken = new com.google.gson.reflect.TypeToken<MoreResponse>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalInspectImage(
			final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.InspectImage", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(inspectImage_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type inspectImage_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.util.List<ImageHistory>> internalHistoryImage(
			final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.HistoryImage", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(historyImage_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type historyImage_returnTypeToken = new com.google.gson.reflect.TypeToken<java.util.List<ImageHistory>>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<MoreResponse> internalPushImage(final java.lang.String name,
			final java.lang.String tag, final java.util.Optional<java.lang.Boolean> tlsverify,
			final java.lang.String signaturePolicy, final java.lang.String creds, final java.lang.String certDir,
			final java.lang.Boolean compress, final java.lang.String format, final java.lang.Boolean removeSignatures,
			final java.lang.String signBy) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(10);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.PushImage", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(pushImage_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type pushImage_returnTypeToken = new com.google.gson.reflect.TypeToken<MoreResponse>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalTagImage(final java.lang.String name,
			final java.lang.String tagged) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(2);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.TagImage", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(tagImage_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type tagImage_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalRemoveImage(final java.lang.String name,
			final java.lang.Boolean force) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(2);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.RemoveImage", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(removeImage_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type removeImage_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.util.List<ImageSearchResult>> internalSearchImages(
			final java.lang.String query, final java.util.Optional<java.lang.Long> limit,
			final java.util.Optional<java.lang.Boolean> tlsVerify, final ImageSearchFilter filter) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(4);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.SearchImages", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(searchImages_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type searchImages_returnTypeToken = new com.google.gson.reflect.TypeToken<java.util.List<ImageSearchResult>>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> internalDeleteUnusedImages() {
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.DeleteUnusedImages"))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(deleteUnusedImages_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type deleteUnusedImages_returnTypeToken = new com.google.gson.reflect.TypeToken<java.util.List<java.lang.String>>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalCommit(final java.lang.String name,
			final java.lang.String image_name, final java.util.List<java.lang.String> changes,
			final java.lang.String author, final java.lang.String message, final java.lang.Boolean pause,
			final java.lang.String manifestType) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(7);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.Commit", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(commit_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type commit_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalImportImage(
			final java.lang.String source, final java.lang.String reference, final java.lang.String message,
			final java.util.List<java.lang.String> changes, final java.lang.Boolean delete) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(5);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.ImportImage", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(importImage_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type importImage_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalExportImage(final java.lang.String name,
			final java.lang.String destination, final java.lang.Boolean compress,
			final java.util.List<java.lang.String> tags) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(4);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.ExportImage", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(exportImage_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type exportImage_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<MoreResponse> internalPullImage(final java.lang.String name,
			final java.lang.String certDir, final java.lang.String creds, final java.lang.String signaturePolicy,
			final java.util.Optional<java.lang.Boolean> tlsVerify) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(5);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.PullImage", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(pullImage_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type pullImage_returnTypeToken = new com.google.gson.reflect.TypeToken<MoreResponse>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalCreatePod(final PodCreate create) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.CreatePod", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(createPod_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type createPod_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.util.List<ListPodData>> internalListPods() {
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.ListPods")).thenApply(result -> {
			checkError(result);
			return this.varlink.fromJson(listPods_returnTypeToken, result.getFirstParameter());
		});
	}

	private final static java.lang.reflect.Type listPods_returnTypeToken = new com.google.gson.reflect.TypeToken<java.util.List<ListPodData>>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<ListPodData> internalGetPod(final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.GetPod", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(getPod_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type getPod_returnTypeToken = new com.google.gson.reflect.TypeToken<ListPodData>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalInspectPod(final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.InspectPod", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(inspectPod_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type inspectPod_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalStartPod(final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.StartPod", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(startPod_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type startPod_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalStopPod(final java.lang.String name,
			final java.lang.Long timeout) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(2);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.StopPod", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(stopPod_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type stopPod_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalRestartPod(final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.RestartPod", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(restartPod_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type restartPod_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalKillPod(final java.lang.String name,
			final java.lang.Long signal) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(2);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.KillPod", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(killPod_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type killPod_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalPausePod(final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.PausePod", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(pausePod_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type pausePod_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalUnpausePod(final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.UnpausePod", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(unpausePod_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type unpausePod_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalRemovePod(final java.lang.String name,
			final java.lang.Boolean force) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(2);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.RemovePod", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(removePod_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type removePod_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> internalTopPod(
			final java.lang.String pod, final java.lang.Boolean latest,
			final java.util.List<java.lang.String> descriptors) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(3);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.TopPod", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(topPod_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type topPod_returnTypeToken = new com.google.gson.reflect.TypeToken<java.util.List<java.lang.String>>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<GetPodStats_Out> internalGetPodStats(final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.GetPodStats", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(getPodStats_returnTypeToken, result.getParameters());
				});
	}

	private final static java.lang.reflect.Type getPodStats_returnTypeToken = new com.google.gson.reflect.TypeToken<GetPodStats_Out>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> internalGetPodsByStatus(
			final java.util.List<java.lang.String> statuses) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.GetPodsByStatus", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(getPodsByStatus_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type getPodsByStatus_returnTypeToken = new com.google.gson.reflect.TypeToken<java.util.List<java.lang.String>>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.Long> internalImageExists(final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.ImageExists", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(imageExists_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type imageExists_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.Long>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.Long> internalContainerExists(
			final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.ContainerExists", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(containerExists_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type containerExists_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.Long>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalContainerCheckpoint(
			final java.lang.String name, final java.lang.Boolean keep, final java.lang.Boolean leaveRunning,
			final java.lang.Boolean tcpEstablished) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(4);
		return this.connection
				.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.ContainerCheckpoint", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(containerCheckpoint_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type containerCheckpoint_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalContainerRestore(
			final java.lang.String name, final java.lang.Boolean keep, final java.lang.Boolean tcpEstablished) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(3);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.ContainerRestore", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(containerRestore_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type containerRestore_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.Void> internalContainerRunlabel(
			final Runlabel runlabel) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.ContainerRunlabel", parameters))
				.thenApply(result -> {
					checkError(result);
					return null;
				});
	}

	protected java.util.concurrent.CompletableFuture<java.util.Map<java.lang.String, java.lang.String>> internalListContainerMounts() {
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.ListContainerMounts"))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(listContainerMounts_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type listContainerMounts_returnTypeToken = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalMountContainer(
			final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.MountContainer", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(mountContainer_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type mountContainer_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.Void> internalUnmountContainer(
			final java.lang.String name, final java.lang.Boolean force) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(2);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.UnmountContainer", parameters))
				.thenApply(result -> {
					checkError(result);
					return null;
				});
	}

	protected java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> internalImagesPrune(
			final java.lang.Boolean all) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.ImagesPrune", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(imagesPrune_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type imagesPrune_returnTypeToken = new com.google.gson.reflect.TypeToken<java.util.List<java.lang.String>>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<KubePodService> internalGenerateKube(final java.lang.String name,
			final java.lang.Boolean service) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(2);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.GenerateKube", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(generateKube_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type generateKube_returnTypeToken = new com.google.gson.reflect.TypeToken<KubePodService>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalContainerConfig(
			final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.ContainerConfig", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(containerConfig_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type containerConfig_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalContainerArtifacts(
			final java.lang.String name, final java.lang.String artifactName) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(2);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.ContainerArtifacts", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(containerArtifacts_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type containerArtifacts_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalContainerInspectData(
			final java.lang.String name, final java.lang.Boolean size) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(2);
		return this.connection
				.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.ContainerInspectData", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(containerInspectData_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type containerInspectData_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalContainerStateData(
			final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.ContainerStateData", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(containerStateData_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type containerStateData_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalPodStateData(
			final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.PodStateData", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(podStateData_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type podStateData_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalCreateFromCC(
			final java.util.List<java.lang.String> in) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.CreateFromCC", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(createFromCC_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type createFromCC_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalSpec(final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.Spec", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(spec_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type spec_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalSendFile(final java.lang.String type,
			final java.lang.Long length) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(2);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.SendFile", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(sendFile_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type sendFile_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.Long> internalReceiveFile(final java.lang.String path,
			final java.lang.Boolean delete) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(2);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.ReceiveFile", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(receiveFile_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type receiveFile_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.Long>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalVolumeCreate(
			final VolumeCreateOpts options) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.VolumeCreate", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(volumeCreate_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type volumeCreate_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> internalVolumeRemove(
			final VolumeRemoveOpts options) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.VolumeRemove", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(volumeRemove_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type volumeRemove_returnTypeToken = new com.google.gson.reflect.TypeToken<java.util.List<java.lang.String>>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.util.List<Volume>> internalGetVolumes(
			final java.util.List<java.lang.String> args, final java.lang.Boolean all) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(2);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.GetVolumes", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(getVolumes_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type getVolumes_returnTypeToken = new com.google.gson.reflect.TypeToken<java.util.List<Volume>>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<VolumesPrune_Out> internalVolumesPrune() {
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.VolumesPrune"))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(volumesPrune_returnTypeToken, result.getParameters());
				});
	}

	private final static java.lang.reflect.Type volumesPrune_returnTypeToken = new com.google.gson.reflect.TypeToken<VolumesPrune_Out>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<MoreResponse> internalImageSave(final ImageSaveOptions options) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.ImageSave", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(imageSave_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type imageSave_returnTypeToken = new com.google.gson.reflect.TypeToken<MoreResponse>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> internalGetPodsByContext(
			final java.lang.Boolean all, final java.lang.Boolean latest, final java.util.List<java.lang.String> args) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(3);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.GetPodsByContext", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(getPodsByContext_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type getPodsByContext_returnTypeToken = new com.google.gson.reflect.TypeToken<java.util.List<java.lang.String>>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<MoreResponse> internalLoadImage(final java.lang.String name,
			final java.lang.String inputFile, final java.lang.Boolean quiet, final java.lang.Boolean deleteFile) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(4);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.LoadImage", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(loadImage_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type loadImage_returnTypeToken = new com.google.gson.reflect.TypeToken<MoreResponse>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<Event> internalGetEvents(
			final java.util.List<java.lang.String> filter, final java.lang.String since, final java.lang.String until) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(3);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.GetEvents", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(getEvents_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type getEvents_returnTypeToken = new com.google.gson.reflect.TypeToken<Event>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.util.List<DiffInfo>> internalDiff(
			final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.Diff", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(diff_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type diff_returnTypeToken = new com.google.gson.reflect.TypeToken<java.util.List<DiffInfo>>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalGetLayersMapWithImageInfo() {
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.GetLayersMapWithImageInfo"))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(getLayersMapWithImageInfo_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type getLayersMapWithImageInfo_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalBuildImageHierarchyMap(
			final java.lang.String name) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(1);
		return this.connection
				.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.BuildImageHierarchyMap", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(buildImageHierarchyMap_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type buildImageHierarchyMap_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();

	protected java.util.concurrent.CompletableFuture<java.lang.String> internalGenerateSystemd(
			final java.lang.String name, final java.lang.String restart, final java.lang.Long timeout,
			final java.lang.Boolean useName) {
		java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<>(4);
		return this.connection.call(de.dentrassi.varlink.spi.CallRequest.of("io.podman.GenerateSystemd", parameters))
				.thenApply(result -> {
					checkError(result);
					return this.varlink.fromJson(generateSystemd_returnTypeToken, result.getFirstParameter());
				});
	}

	private final static java.lang.reflect.Type generateSystemd_returnTypeToken = new com.google.gson.reflect.TypeToken<java.lang.String>() {
	}.getType();
}
