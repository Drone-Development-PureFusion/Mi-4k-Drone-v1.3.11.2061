.class public Lcom/google/android/gms/drive/internal/f;
.super Lcom/google/android/gms/drive/internal/p$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/drive/internal/f$a;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:Lcom/google/android/gms/drive/events/h;

.field private final c:Lcom/google/android/gms/drive/internal/f$a;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/os/Looper;Landroid/content/Context;ILcom/google/android/gms/drive/events/h;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/drive/internal/p$a;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/drive/internal/f;->d:Ljava/util/List;

    iput p3, p0, Lcom/google/android/gms/drive/internal/f;->a:I

    iput-object p4, p0, Lcom/google/android/gms/drive/internal/f;->b:Lcom/google/android/gms/drive/events/h;

    new-instance v0, Lcom/google/android/gms/drive/internal/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/google/android/gms/drive/internal/f$a;-><init>(Landroid/os/Looper;Landroid/content/Context;Lcom/google/android/gms/drive/internal/f$1;)V

    iput-object v0, p0, Lcom/google/android/gms/drive/internal/f;->c:Lcom/google/android/gms/drive/internal/f$a;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/f;->d:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public a(Lcom/google/android/gms/drive/internal/OnEventResponse;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/OnEventResponse;->a()Lcom/google/android/gms/drive/events/DriveEvent;

    move-result-object v1

    iget v0, p0, Lcom/google/android/gms/drive/internal/f;->a:I

    invoke-interface {v1}, Lcom/google/android/gms/drive/events/DriveEvent;->a()I

    move-result v2

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/f;->d:Ljava/util/List;

    invoke-interface {v1}, Lcom/google/android/gms/drive/events/DriveEvent;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/f;->c:Lcom/google/android/gms/drive/internal/f$a;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/f;->b:Lcom/google/android/gms/drive/events/h;

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/drive/internal/f$a;->a(Lcom/google/android/gms/drive/events/h;Lcom/google/android/gms/drive/events/DriveEvent;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(I)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/f;->d:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
