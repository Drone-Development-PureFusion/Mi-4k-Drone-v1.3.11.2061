.class Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$7;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

.field final synthetic b:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$7;->b:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;

    iput-object p2, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$7;->a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$7;->b:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;

    iget-object v1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$7;->a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    invoke-static {v0, v1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)V

    return-void
.end method
