.class public Lcom/google/firebase/auth/api/model/StringList;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/firebase/auth/api/model/StringList;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I
    .annotation runtime Lcom/google/android/gms/internal/gc;
    .end annotation
.end field

.field private b:Ljava/util/List;
    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "values"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/auth/api/model/g;

    invoke-direct {v0}, Lcom/google/firebase/auth/api/model/g;-><init>()V

    sput-object v0, Lcom/google/firebase/auth/api/model/StringList;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/firebase/auth/api/model/StringList;-><init>(Ljava/util/List;)V

    return-void
.end method

.method constructor <init>(ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/firebase/auth/api/model/StringList;->a:I

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/auth/api/model/StringList;->b:Ljava/util/List;

    :goto_0
    return-void

    :cond_1
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/auth/api/model/StringList;->b:Ljava/util/List;

    goto :goto_0
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/firebase/auth/api/model/StringList;->a:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/auth/api/model/StringList;->b:Ljava/util/List;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/StringList;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-void
.end method

.method public static a(Lcom/google/firebase/auth/api/model/StringList;)Lcom/google/firebase/auth/api/model/StringList;
    .locals 2

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/google/firebase/auth/api/model/StringList;->a()Ljava/util/List;

    move-result-object v0

    :goto_0
    new-instance v1, Lcom/google/firebase/auth/api/model/StringList;

    invoke-direct {v1, v0}, Lcom/google/firebase/auth/api/model/StringList;-><init>(Ljava/util/List;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b()Lcom/google/firebase/auth/api/model/StringList;
    .locals 2

    new-instance v0, Lcom/google/firebase/auth/api/model/StringList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/firebase/auth/api/model/StringList;-><init>(Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/StringList;->b:Ljava/util/List;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/firebase/auth/api/model/g;->a(Lcom/google/firebase/auth/api/model/StringList;Landroid/os/Parcel;I)V

    return-void
.end method
