.class public Lcom/google/android/gms/internal/agu;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/cast/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/agu$b;,
        Lcom/google/android/gms/internal/agu$a;,
        Lcom/google/android/gms/internal/agu$c;
    }
.end annotation


# static fields
.field private static final a:Lcom/google/android/gms/cast/internal/m;


# instance fields
.field private b:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a",
            "<*>;"
        }
    .end annotation
.end field

.field private c:Landroid/hardware/display/VirtualDisplay;

.field private final d:Lcom/google/android/gms/internal/agy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/cast/internal/m;

    const-string v1, "CastRemoteDisplayApiImpl"

    invoke-direct {v0, v1}, Lcom/google/android/gms/cast/internal/m;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/agu;->a:Lcom/google/android/gms/cast/internal/m;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/api/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/agu$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/agu$1;-><init>(Lcom/google/android/gms/internal/agu;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/agu;->d:Lcom/google/android/gms/internal/agy;

    iput-object p1, p0, Lcom/google/android/gms/internal/agu;->b:Lcom/google/android/gms/common/api/a;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/agu;Landroid/hardware/display/VirtualDisplay;)Landroid/hardware/display/VirtualDisplay;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/agu;->c:Landroid/hardware/display/VirtualDisplay;

    return-object p1
.end method

.method static synthetic a()Lcom/google/android/gms/cast/internal/m;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/agu;->a:Lcom/google/android/gms/cast/internal/m;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/agu;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/agu;->b()V

    return-void
.end method

.method static synthetic b(Lcom/google/android/gms/internal/agu;)Lcom/google/android/gms/internal/agy;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/agu;->d:Lcom/google/android/gms/internal/agy;

    return-object v0
.end method

.method private b()V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/agu;->c:Landroid/hardware/display/VirtualDisplay;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/agu;->c:Landroid/hardware/display/VirtualDisplay;

    invoke-virtual {v0}, Landroid/hardware/display/VirtualDisplay;->getDisplay()Landroid/view/Display;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/agu;->a:Lcom/google/android/gms/cast/internal/m;

    iget-object v1, p0, Lcom/google/android/gms/internal/agu;->c:Landroid/hardware/display/VirtualDisplay;

    invoke-virtual {v1}, Landroid/hardware/display/VirtualDisplay;->getDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Display;->getDisplayId()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x26

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "releasing virtual display: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/agu;->c:Landroid/hardware/display/VirtualDisplay;

    invoke-virtual {v0}, Landroid/hardware/display/VirtualDisplay;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/agu;->c:Landroid/hardware/display/VirtualDisplay;

    :cond_1
    return-void
.end method

.method static synthetic c(Lcom/google/android/gms/internal/agu;)Lcom/google/android/gms/common/api/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/agu;->b:Lcom/google/android/gms/common/api/a;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/agu;)Landroid/hardware/display/VirtualDisplay;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/agu;->c:Landroid/hardware/display/VirtualDisplay;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/d$c;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/agu;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v1, "stopRemoteDisplay"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/internal/agu$3;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/agu$3;-><init>(Lcom/google/android/gms/internal/agu;Lcom/google/android/gms/common/api/g;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/d$c;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/agu;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v1, "startRemoteDisplay"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/internal/agu$2;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/agu$2;-><init>(Lcom/google/android/gms/internal/agu;Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method
