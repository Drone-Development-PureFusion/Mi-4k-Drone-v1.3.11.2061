.class public Lcom/google/android/gms/location/places/AutocompleteFilter;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/location/places/AutocompleteFilter$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/location/places/p;

.field public static final a:I = 0x0

.field public static final b:I = 0x3ef

.field public static final c:I = 0x2

.field public static final d:I = 0x22

.field public static final e:I = 0x4

.field public static final f:I = 0x5


# instance fields
.field final g:I

.field final h:Z

.field final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final j:Ljava/lang/String;

.field final k:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/location/places/p;

    invoke-direct {v0}, Lcom/google/android/gms/location/places/p;-><init>()V

    sput-object v0, Lcom/google/android/gms/location/places/AutocompleteFilter;->CREATOR:Lcom/google/android/gms/location/places/p;

    return-void
.end method

.method constructor <init>(IZLjava/util/List;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/location/places/AutocompleteFilter;->g:I

    iput-object p3, p0, Lcom/google/android/gms/location/places/AutocompleteFilter;->i:Ljava/util/List;

    invoke-static {p3}, Lcom/google/android/gms/location/places/AutocompleteFilter;->a(Ljava/util/Collection;)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/location/places/AutocompleteFilter;->k:I

    iput-object p4, p0, Lcom/google/android/gms/location/places/AutocompleteFilter;->j:Ljava/lang/String;

    iget v1, p0, Lcom/google/android/gms/location/places/AutocompleteFilter;->g:I

    if-ge v1, v0, :cond_1

    if-nez p2, :cond_0

    :goto_0
    iput-boolean v0, p0, Lcom/google/android/gms/location/places/AutocompleteFilter;->h:Z

    :goto_1
    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    iput-boolean p2, p0, Lcom/google/android/gms/location/places/AutocompleteFilter;->h:Z

    goto :goto_1
.end method

.method private static a(Ljava/util/Collection;)I
    .locals 1
    .param p0    # Ljava/util/Collection;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_1
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/location/places/AutocompleteFilter;->k:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/location/places/AutocompleteFilter;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/location/places/AutocompleteFilter;

    iget v2, p0, Lcom/google/android/gms/location/places/AutocompleteFilter;->k:I

    iget v3, p1, Lcom/google/android/gms/location/places/AutocompleteFilter;->k:I

    if-ne v2, v3, :cond_3

    iget-boolean v2, p0, Lcom/google/android/gms/location/places/AutocompleteFilter;->h:Z

    iget-boolean v3, p1, Lcom/google/android/gms/location/places/AutocompleteFilter;->h:Z

    if-ne v2, v3, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/location/places/AutocompleteFilter;->j:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/location/places/AutocompleteFilter;->j:Ljava/lang/String;

    if-eq v2, v3, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-boolean v2, p0, Lcom/google/android/gms/location/places/AutocompleteFilter;->h:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget v2, p0, Lcom/google/android/gms/location/places/AutocompleteFilter;->k:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/location/places/AutocompleteFilter;->j:Ljava/lang/String;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "includeQueryPredictions"

    iget-boolean v2, p0, Lcom/google/android/gms/location/places/AutocompleteFilter;->h:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "typeFilter"

    iget v2, p0, Lcom/google/android/gms/location/places/AutocompleteFilter;->k:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "country"

    iget-object v2, p0, Lcom/google/android/gms/location/places/AutocompleteFilter;->j:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/c$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/location/places/p;->a(Lcom/google/android/gms/location/places/AutocompleteFilter;Landroid/os/Parcel;I)V

    return-void
.end method
