.class final Lcom/google/android/gms/internal/agu$c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/cast/d$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/agu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/common/api/Status;

.field private final b:Landroid/view/Display;


# direct methods
.method public constructor <init>(Landroid/view/Display;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    iput-object v0, p0, Lcom/google/android/gms/internal/agu$c;->a:Lcom/google/android/gms/common/api/Status;

    iput-object p1, p0, Lcom/google/android/gms/internal/agu$c;->b:Landroid/view/Display;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/agu$c;->a:Lcom/google/android/gms/common/api/Status;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/agu$c;->b:Landroid/view/Display;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/agu$c;->a:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public b()Landroid/view/Display;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/agu$c;->b:Landroid/view/Display;

    return-object v0
.end method
