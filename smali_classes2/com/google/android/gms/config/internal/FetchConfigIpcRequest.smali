.class public Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field private final b:Ljava/lang/String;

.field private final c:J

.field private final d:Lcom/google/android/gms/common/data/DataHolder;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final i:I

.field private final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/config/internal/AnalyticsUserProperty;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/config/internal/g;

    invoke-direct {v0}, Lcom/google/android/gms/config/internal/g;-><init>()V

    sput-object v0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;JLcom/google/android/gms/common/data/DataHolder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "J",
            "Lcom/google/android/gms/common/data/DataHolder;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/config/internal/AnalyticsUserProperty;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->a:I

    iput-object p2, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->b:Ljava/lang/String;

    iput-wide p3, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->c:J

    iput-object p5, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->d:Lcom/google/android/gms/common/data/DataHolder;

    iput-object p6, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->e:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->f:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->g:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->h:Ljava/util/List;

    iput p10, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->i:I

    iput-object p11, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->j:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JLcom/google/android/gms/common/data/DataHolder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Lcom/google/android/gms/common/data/DataHolder;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/config/internal/AnalyticsUserProperty;",
            ">;)V"
        }
    .end annotation

    const/4 v2, 0x2

    move-object v1, p0

    move-object v3, p1

    move-wide/from16 v4, p2

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move/from16 v11, p9

    move-object/from16 v12, p10

    invoke-direct/range {v1 .. v12}, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;-><init>(ILjava/lang/String;JLcom/google/android/gms/common/data/DataHolder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->c:J

    return-wide v0
.end method

.method public c()Lcom/google/android/gms/common/data/DataHolder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->d:Lcom/google/android/gms/common/data/DataHolder;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->e:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->f:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->g:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/util/List;
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

    iget-object v0, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->h:Ljava/util/List;

    return-object v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->i:I

    return v0
.end method

.method public i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/config/internal/AnalyticsUserProperty;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->j:Ljava/util/List;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/config/internal/g;->a(Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;Landroid/os/Parcel;I)V

    return-void
.end method
