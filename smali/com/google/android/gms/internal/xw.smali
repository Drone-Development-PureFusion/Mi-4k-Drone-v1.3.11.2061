.class public final Lcom/google/android/gms/internal/xw;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/ads/mediation/a;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# instance fields
.field private final d:Ljava/util/Date;

.field private final e:I

.field private final f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Z

.field private final h:Landroid/location/Location;

.field private final i:I

.field private final j:Z


# direct methods
.method public constructor <init>(Ljava/util/Date;ILjava/util/Set;Landroid/location/Location;ZIZ)V
    .locals 0
    .param p1    # Ljava/util/Date;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/util/Set;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Landroid/location/Location;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Date;",
            "I",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/location/Location;",
            "ZIZ)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/xw;->d:Ljava/util/Date;

    iput p2, p0, Lcom/google/android/gms/internal/xw;->e:I

    iput-object p3, p0, Lcom/google/android/gms/internal/xw;->f:Ljava/util/Set;

    iput-object p4, p0, Lcom/google/android/gms/internal/xw;->h:Landroid/location/Location;

    iput-boolean p5, p0, Lcom/google/android/gms/internal/xw;->g:Z

    iput p6, p0, Lcom/google/android/gms/internal/xw;->i:I

    iput-boolean p7, p0, Lcom/google/android/gms/internal/xw;->j:Z

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/xw;->d:Ljava/util/Date;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/xw;->e:I

    return v0
.end method

.method public c()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/xw;->f:Ljava/util/Set;

    return-object v0
.end method

.method public d()Landroid/location/Location;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/xw;->h:Landroid/location/Location;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/xw;->i:I

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/xw;->g:Z

    return v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/xw;->j:Z

    return v0
.end method
