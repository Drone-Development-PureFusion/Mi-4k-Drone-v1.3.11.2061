.class Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$d;
.super Landroid/os/Binder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$d;->a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$d;-><init>(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;)V

    return-void
.end method


# virtual methods
.method a()Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$d;->a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;

    return-object v0
.end method
